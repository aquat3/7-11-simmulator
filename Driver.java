package people;

import classified.*;
import java.util.*;
public class Driver {

	public static void main(String[] args) {
 Worker bob= new Worker("Bob",23);
 Store s= new Store(1000.0);
	Customer sam= new Customer("Sam",35,false);
	Customer billy= new Customer("Billy",14,true);
Scanner in= new Scanner(System.in);
/*

	s.addToShelf("Oreos", 5);
	s.addToShelf("Soda", 5);
	s.addToShelf("Beef Jerky", 5);
	s.addToShelf("sun flower seeds", 5);
	Manager roberto= new Manager("Roberto",54);
	s.showShelf();
 	
	billy.steal("Soda", 1);
	s.showShelf();
bob.stock("Soda", 10);
s.showShelf();
roberto.checkBalance();

sam.buy("Oreos", 5.00, true, 10.00,2);
roberto.checkBalance();
s.showShelf();
billy.buy("cigarettes", 7.99, true, 8.00, 1);
	
*/

String choice="";
	Store st= new Store(0);
	st.createShelf();
	st.createGrill();
	st.createStorage();
	st.defaultAssets();
	st.createFreezer();
Manager defaultManager= new Manager("",45);
while(!(choice.equalsIgnoreCase("end"))) {
	System.out.println("                            7-Eleven                   \n       ");
	defaultManager.checkStore();
	System.out.println("\n");;
	System.out.println("Welcome to the 711 store simmulator, Please make a selection, type \"end\" anytime to leave ");
	//System.out.print("a. create default store ");
	//System.out.print("b. create your own store ");
	
	//choice=in.next();

//	if(choice.equalsIgnoreCase("a")) {
	
	
System.out.println("Pick a role ,type \"change \" anytime to change role ");
	System.out.println("a. manager  b. worker  c. customer d. Delivery Driver");
	choice=in.next();
	
	

	if(choice.equalsIgnoreCase("a")) {
		
		System.out.println("Enter your name");
		String name= in.next();
		System.out.println("Enter your age");
int age=in.nextInt();
		Manager m= new Manager(name,age);
		while(!(choice.equalsIgnoreCase("change"))) {
		//m.checkStore();
			System.out.println("What would you like to do?");
		System.out.println("a. check store balance  b. interract  c.order supplies d. check store");
		choice=in.next();
		if(choice.equalsIgnoreCase("a"))
			m.checkBalance();		
		if(choice.equalsIgnoreCase("b"))
			m.socialize();		
		if(choice.equalsIgnoreCase("c")) {
			System.out.println("what is the item?");
			String item=in.next();
			System.out.println("what is the price?");
			double price=in.nextDouble();
			System.out.println("what is the quantity?");
			int amount=in.nextInt();
			
			m.order(price, amount, item);;		
		}if(choice.equalsIgnoreCase("d"))
			m.checkStore();
		}// end loop
	
	}// end if
	
	
if(choice.equalsIgnoreCase("b")) {
		
		System.out.println("Enter your name");
		String name= in.next();
		System.out.println("Enter your age");
int age=in.nextInt();
		Worker w= new Worker(name,age);
		w.checkStore();
		while(!(choice.equalsIgnoreCase("change"))) {
		System.out.println("What would you like to do?");
		System.out.println("a. stock shelves  b. interract  c. check store d. cook");
		choice=in.next();
		if(choice.equalsIgnoreCase("a")) {
			System.out.println("What will we add?");
			String itemName=in.next();
			System.out.println("how much will we add?");
			int quantity=in.nextInt();
					
			w.stock(itemName, quantity);		
		
		
		}if(choice.equalsIgnoreCase("b"))
			w.socialize();		
		if(choice.equalsIgnoreCase("c")) {
			 w.checkStore();
			
 		}if(choice.equalsIgnoreCase("d")) {
 			
 			System.out.println("What will we cook?");
			String itemName=in.next();
			System.out.println("how much will we add?");
			 
			int quantity=in.nextInt();
			 
			
			w.cook(itemName, quantity);
 		
 		
 		}
		}// end loop
	
	}// end if
	
if(choice.equalsIgnoreCase("c")) {
	
	System.out.println("Enter your name");
	String name= in.next();
	System.out.println("Enter your age");
int age=in.nextInt();
boolean delinquent=false;; 	
if(age<18)
delinquent=true;

Customer c= new Customer(name,age,delinquent);
c.checkStore();
	while(!(choice.equalsIgnoreCase("change"))) {
	System.out.println("What would you like to do?");
	System.out.println("a. Buy  b. interract  c. check store d. steal");
	choice=in.next();
	if(choice.equalsIgnoreCase("a")) {
		
		String grillOrShelf="";
		
		System.out.println("Grill or shelf?");
		grillOrShelf=in.next();
		System.out.println("What will you buy?");
		String itemName=in.next();
		System.out.println("how many do you want?");
		int quantity=in.nextInt();
		System.out.println("cash or credit? ");
		String cashcr=in.next();
		
		boolean cashTF=true;
		boolean shelf=true;
		double cashAmount=0;
		if(grillOrShelf.equalsIgnoreCase("grill"))
			shelf=false;
		if(cashcr.equalsIgnoreCase("credit"))
		cashTF=false;
	//	Map<String, Double> shelfPrice=new HashMap<String, Double>();	

	//	 Map<String, Double> grillPrice=new HashMap<String, Double>();	
		 //shelfPrice=s.shelfPrice;
		// grillPrice=s.grillPrice;
		 if(cashTF==false&&grillOrShelf.equalsIgnoreCase("shelf"))
		 cashAmount=s.shelfPrice.get(itemName);
		 else if(cashTF==false&&grillOrShelf.equalsIgnoreCase("grill"))
			 cashAmount=s.grillPrice.get(itemName);

			 else { 
			 System.out.println("how much cash do you have?");
		 cashAmount=in.nextDouble();
		 }
			 if(grillOrShelf.equalsIgnoreCase("shelf"))
		 c.buy(itemName, s.shelfPrice.get(itemName), cashTF, cashAmount, quantity,shelf);	
			 else 
				 c.buy(itemName, s.grillPrice.get(itemName), cashTF, cashAmount, quantity,shelf);	
 
	
	}if(choice.equalsIgnoreCase("b"))
		c.socialize();		
	if(choice.equalsIgnoreCase("c")) {
		 c.checkStore();
		
		}if(choice.equalsIgnoreCase("d")) {
			
			System.out.println("What should i steal >:)?");
			String itemName=in.next();
			System.out.println("how many do I want?");
			int quantity=in.nextInt();
			c.steal(itemName, quantity);
				
				}
	}
	
}
		if(choice.equalsIgnoreCase("d")) {
		 
			System.out.println("Enter your name");
			String name2= in.next();
			System.out.println("Enter your age");
		int age2=in.nextInt();
		 

		Supplier sp= new Supplier(name2,age2);
		sp.checkStore();// inherits customer methods
			while(!(choice.equalsIgnoreCase("change"))) {
			System.out.println("What would you like to do?");
			System.out.println("a. Buy  b. interract  c. check store ");
			choice=in.next();
			if(choice.equalsIgnoreCase("a")) {
				
				String grillOrShelf="";
				
				System.out.println("Grill or shelf?");
				grillOrShelf=in.next();
				System.out.println("What will you buy?");
				String itemName=in.next();
				System.out.println("how many do you want?");
				int quantity=in.nextInt();
				System.out.println("cash or credit? ");
				String cashcr=in.next();
				
				boolean cashTF=true;
				boolean shelf=true;
				double cashAmount=0;
				if(grillOrShelf.equalsIgnoreCase("grill"))
					shelf=false;
				if(cashcr.equalsIgnoreCase("credit"))
				cashTF=false;
			//	Map<String, Double> shelfPrice=new HashMap<String, Double>();	

			//	 Map<String, Double> grillPrice=new HashMap<String, Double>();	
				 //shelfPrice=s.shelfPrice;
				// grillPrice=s.grillPrice;
				 if(cashTF==false&&grillOrShelf.equalsIgnoreCase("shelf"))
				 cashAmount=s.shelfPrice.get(itemName);
				 else if(cashTF==false&&grillOrShelf.equalsIgnoreCase("grill"))
					 cashAmount=s.grillPrice.get(itemName);

					 else { 
					 System.out.println("how much cash do you have?");
				 cashAmount=in.nextDouble();
				 }
					 if(grillOrShelf.equalsIgnoreCase("shelf"))
				 sp.buy(itemName, s.shelfPrice.get(itemName), cashTF, cashAmount, quantity,shelf);	
					 else 
						 sp.buy(itemName, s.grillPrice.get(itemName), cashTF, cashAmount, quantity,shelf);	
		 
			
			}if(choice.equalsIgnoreCase("b"))
				sp.socialize();		
			if(choice.equalsIgnoreCase("c")) {
				 sp.checkStore();
				
				} 
		
		
		
		
		
	
	
	}// end loop

}// end if
	
	
	
	
	
	/*
	}else {
		Store st= new Store(0);
		System.out.println("What is the amount of assets?");
		int assets=in.nextInt();
		int x=0;
		double prices=0;
		System.out.println("Would you like to add items to the shelf? y/n");
		choice=in.next();
		if(choice.equals("y")) {
			while(choice.equals("y")) {
				System.out.println("what item?");
				choice=in.next();
				System.out.println("How many?");
				x=in.nextInt();
				st.addToShelf(choice,x);
				System.out.println("How much is it?");
				prices=in.nextDouble();
				st.setPrice(choice, prices);
			System.out.println("again? y/n");
				choice=in.next();
			}
			
			
		}else {
			System.out.println("your loss, your store is empty!!");
		}
		
	}
	
	System.out.println("Pick a role ,type \"change \" anytime to change role ");
	System.out.println("a. manager  b. worker  c. customer  d. delivery driver");
	choice=in.next();
	
	

	if(choice.equalsIgnoreCase("a")) {
		while(choice.equalsIgnoreCase("change")) {
		System.out.println("Enter your name");
		String name= in.next();
		System.out.println("Enter your age");
int age=in.nextInt();
		Manager m= new Manager(name,age);
		System.out.println("What would you like to do?");
		System.out.println("a. check store balance  b. interract  c.order supplies ");
		choice=in.next();
		//if(choice.equalsIgnoreCase("a"))
		
		
		}
	
	} */


	}
}
}

