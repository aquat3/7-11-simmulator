package classified;
import java.util.*;
public class Store {
// for these maps, the key is the name of item/food the value is the quantity. 
public static Map<String, Integer> shelf=new HashMap<String, Integer>();	
	
protected static Map<String, Integer> storage=new HashMap<String, Integer>();	
protected static Map<String, Integer> grill=new HashMap<String, Integer>();	


protected static Map<String, Integer> freezer=new HashMap<String, Integer>();	

 

public static Map<String, Double> shelfPrice=new HashMap<String, Double>();	

public static Map<String, Double> grillPrice=new HashMap<String, Double>();	

public static Map<String, Double> storagePrice=new HashMap<String, Double>();	

// create a map to hold items and price
// create a method that adds sample items to shelf
//


protected static double assets;

public Store(double assets) {
	this.assets=assets;
	
	
}
	public static void addToShelf(String itemName, Integer quantity) {
		
		shelf.put(itemName, quantity);
		
		
	}

public static void addToGrill(String itemName, Integer quantity) {
		freezer.put(itemName, freezer.get(itemName)-quantity);
		grill.put(itemName, grill.get(itemName)+quantity);
		
		
	}	
public void addToStorage(String itemName, Integer quantity) {
	
	storage.put(itemName, quantity);
	
	
}
	public void setPrice(String item, Double price) {
		//storagePrice.put(item, price);
		shelfPrice.put(item, price);
		
		
	}
	public void clean() {
		System.out.println("*Cleaning");
	}
	public static double getAssets() {
		
		return assets;
	}
	
	public static void addMoreToShelf(String itemName, Integer quantity) {
		//String str = itemName;
		//String cap = str.substring(0, 1).toUpperCase() + str.substring(1);
		
		storage.put(itemName, storage.get(itemName)-quantity);
 		shelf.put(itemName, shelf.get(itemName)+quantity);

		
	}
public static void addMoreToStorage(String itemName, Integer quantity) {
		
 		storage.put(itemName, shelf.get(itemName)+quantity);

		
	}
	public static void removeFromShelf(String itemName, Integer quantity) {
 		shelf.put(itemName, shelf.get(itemName)-quantity);
	}
	public static void removeFromGrill(String itemName, Integer quantity) {
 		grill.put(itemName, grill.get(itemName)-quantity);
	}
	
	
	public static void income(double money) {
		
		assets+=money;
		
	}
public static void orderSupplies(Double price,Integer quantity, String itemName) {
	
	assets-=(price*quantity);
	storage.put(itemName, storage.get(itemName)+quantity);

}
public static void showShelf() {
	
	System.out.println("Shelf "+shelf);
}
public static void showGrill() {
	
	System.out.println("Grill "+grill);
}
public static void showStorage() {
	
	System.out.println("Storage"+storage);
}
public static void showFreezer() {
	
	System.out.println("Freezer "+freezer);
}
public static void showPrices() {
	System.out.println("Shelf prices"+shelfPrice);
	System.out.println("Grill prices "+grillPrice);
	
}


public void defaultAssets() {
	assets=1000;
	
}


public void createShelf() {
	
	shelf.put("oreos", 5);
	shelf.put("cookies", 5);
	shelf.put("donuts", 5);
	shelf.put("coffee", 5);
	shelf.put("nyquil", 5);
	shelf.put("cigarettes", 5);
	shelf.put("soda", 5);
	shelf.put("pop tarts", 5);
	shelf.put("water", 5);
	shelf.put("gaterade", 5);
	
	
	shelfPrice.put("oreos", 1.99);
	shelfPrice.put("cookies", 1.99);
	shelfPrice.put("donuts", 0.99);
	shelfPrice.put("coffee", 1.59);
	shelfPrice.put("nyquil", 3.99);
	shelfPrice.put("cigarettes", 7.99);
	shelfPrice.put("soda", 1.99);
	shelfPrice.put("pop tarts", 1.99);
	shelfPrice.put("water", 0.99);
	shelfPrice.put("gaterade", 1.99);
	
	
	
	
}
public void createStorage() {
	storage.put("oreos", 5);
	storage.put("cookies", 5);
	storage.put("donuts", 5);
	storage.put("coffee", 5);
	storage.put("nyquil", 5);
	storage.put("Cigarettes", 5);
	storage.put("soda", 5);
	storage.put("pop tarts", 5);
	storage.put("water", 5);
	storage.put("gaterade", 5);
	
	
	storagePrice.put("oreos", 1.99);
	storagePrice.put("cookies", 1.99);
	storagePrice.put("donuts", 0.99);
	storagePrice.put("coffee", 1.59);
	storagePrice.put("nyquil", 3.99);
	storagePrice.put("cigarettes", 7.99);
	storagePrice.put("soda", 1.99);
	storagePrice.put("pop tarts", 1.99);
	storagePrice.put("water", 0.99);
	storagePrice.put("gaterade", 1.99);
	
	
	
}
public void createGrill() {
	
	grill.put("hotdog", 5);
	grill.put("tacquito", 5);
	grill.put("wings", 5);
	grill.put("beefpatty", 5);
	grill.put("sausage", 5);
	

	grillPrice.put("hotdog", 1.99);
	grillPrice.put("tacquito", 1.49);
	grillPrice.put("wings", 0.99);
	grillPrice.put("beefpatty",2.99 );
	grillPrice.put("sausage", 1.99);
	



}public void createFreezer() {
	
	freezer.put("hotdog", 5);
	freezer.put("tacquito", 5);
	freezer.put("wings", 5);
	freezer.put("beefpatty", 5);
	freezer.put("sausage", 5);
	

	 



}

public void resetStore() {
	assets=0;
	shelf.clear();
	grill.clear();
	shelfPrice.clear();
	grillPrice.clear();
	freezer.clear();
	storage.clear();
}
}


