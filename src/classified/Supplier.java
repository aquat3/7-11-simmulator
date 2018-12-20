package classified;

import people.*;

public class Supplier extends Customer implements Person{
	protected static String name; 
	protected static int age;
	public Supplier(String driverName,int age) {
		super(driverName,age,false);// deliver drivers never steal :)
		name=driverName;
		
		
	}

	@Override
	public void socialize() {
		System.out.println(name+": whats up!");
		
	}
	
	public static void delivery(String item,Integer quantity) {
		//Store.addMoreToStorage(item , quantity);
		if(!(name.equals(null)))
		System.out.println(name+": I am delivering "+quantity+ " "+item+"(s)");
		//else 
			System.out.println("Delivery guy"+": I am delivering "+quantity+ " "+item+"(s)");

		
	}
	
	@Override
	public void reset() {
		name="";
 		
	}
}
