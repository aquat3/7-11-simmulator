package classified;

import people.Person;
import classified.Store;//
public class Worker implements Person{

	protected String name;
	protected int age;
 	public Worker(String name,int age) {
		this.name=name;
		this.age=age;
 		
		
	}
	@Override
	public void socialize() {
System.out.println("Hello my name is "+this.name);		
	}
	
	
public void stock(String itemName, Integer quantity) {
		
 Store.addMoreToShelf(itemName, quantity);		
	
}
	
	public static void transaction(double price, double cash) {
		 
		if(price>cash) {
			
			System.out.println("uh oh, not enough money");
		return;
		}
		
		double change=cash-price;
		 		Store.income(change);

		 if(change>0)
		System.out.println("Worker: Your change is " +change);
		
	}
	public void cook(String itemName, Integer quantity) {
		Store.addToGrill(itemName, quantity);
		System.out.println("I am making some "+itemName+"(s)");
	}
	public void checkStore() {
		
		Store.showShelf();
		Store.showPrices();
		Store.showGrill();
		Store.showStorage();
	Store.showFreezer();
	
	}
	@Override
	public void reset() {
		name="";
		age=0;
		
	}
}
