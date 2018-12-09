package people;

import classified.Store;
import classified.Worker;

public class Customer implements Person{
private String name;
private int age;
private boolean delinquent;
	
public Customer(String name, int age, boolean delinquent) {
	
	this.name=name;
	this.age=age;
	this.delinquent=delinquent;
	
}
@Override
public void reset() {
	name="";
	age=0;
	
}
@Override
	public void socialize() {
System.out.println(name+": Hello ");		
	}
public void steal(String item, Integer Quantity) {
	if(delinquent==false) {
		System.out.println("I cannot steal I am a grown person!");
	return;
	}
	Store.removeFromShelf(item, Quantity);// you cant steal from grill since its behind the counter. 
	System.out.println("hehehe I stole some "+item);
	
}
public void buy(String item,double price, boolean cash, double cashAmount,Integer quantity,boolean shelf) {
	if (cash==true)
		Store.income(cashAmount);
	if(this.age<18&& item.equalsIgnoreCase("cigarettes")) {
	System.out.println("To young buddy");
	return;
	}
	if(price>cashAmount) {
		
		System.out.println("uh oh, not enough money");
	
 		return;
	
	
	}System.out.println("I bought "+quantity +" "+item+"(s)");
	if(shelf==true) {
	Worker.transaction(price*quantity, cashAmount);
	Store.removeFromShelf(item, quantity);
	}else {
		
		Worker.transaction(price*quantity, cashAmount);
		Store.removeFromGrill(item, quantity);
		
	}

}
public void checkStore() {
	
	Store.showShelf();
	Store.showPrices();
	Store.showGrill();
	Store.showStorage();
	Store.showFreezer();


}
	
	
}
