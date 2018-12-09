package classified;
import java.util.*;
import people.Person;
public class Manager extends Worker implements Person{

	
	public Manager(String name,int age) {
		
		
		super(name,age);
		
	}
	@Override
	public void socialize() {
		System.out.println(name +": Good afternoon, my name is " +this.name+
				" and I am the manager, how can I assist you :)");		
			}	
	@Override
	public void reset() {
		name="";
		age=0;
		
	}
	
	public void checkBalance() {
		
System.out.println("Balance is "+Store.getAssets());		
	if(Store.assets<=0)
	System.out.println("I am broke!");
	}

public void order(Double price,Integer quantity, String itemName) {
	
	Store.orderSupplies(price, quantity, itemName);
Supplier.delivery(itemName,quantity);
}


}
