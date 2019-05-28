package Assignments_REPLIT;
import java.util.ArrayList;
public class a218_OOP_13_Catalog_Project_APPLE extends a218_OOP_13_Catalog_Project_APPLE_MAIN {

	public ArrayList<String> items = new ArrayList<>();
	public ArrayList<Double> prices = new ArrayList<>();
	public ArrayList<Double> monthlyPayments = new ArrayList<>();

	public void loadItems() {
////////////////////////////////////////////////////////////////////////////////
// This method adds all listed items to <items> arraylist
// that is already declared above
//////////////////////////////////////////////////////////////////////////// TODO
		items.add("iPhone 6s");
		items.add("iPhone 6s Plus");
		items.add("iPhone X");
		items.add("MacbookPro");
		items.add("ThumbDrive");
		items.add("Beats HeadPhones");
		items.add("Mouse");
		items.add("Charger");
		items.add("iPad");
		items.add("Dyson Vacuum");
		items.add("TV");
		items.add("Apple Watch");
	}
	public void loadPrices() {
////////////////////////////////////////////////////////////////////////////////
// This method adds all listed prices to <prices> arraylist
// that is already declared above
//////////////////////////////////////////////////////////////////////////// TODO
		prices.add(449.0);
		prices.add(549.0);
		prices.add(1149.0);
		prices.add(1499.99);
		prices.add(39.99);
		prices.add(349.99);
		prices.add(79.99);
		prices.add(39.99);
		prices.add(429.0);
		prices.add(399.0);
		prices.add(2199.0);
		prices.add(559.0);
	}
	public void loadMonthlyPayments() {
////////////////////////////////////////////////////////////////////////////////////
// This method adds all listed monthly payments to <monthlyPayments> arraylist
// that is already declared above
//////////////////////////////////////////////////////////////////////////////// TODO
		monthlyPayments.add(18.71);
		monthlyPayments.add(22.88);
		monthlyPayments.add(56.16);
		monthlyPayments.add(79.49);
		monthlyPayments.add(2.68);
		monthlyPayments.add(15.12);
		monthlyPayments.add(8.98);
		monthlyPayments.add(4.56);
		monthlyPayments.add(18.31);
		monthlyPayments.add(16.25);
		monthlyPayments.add(89.49);
		monthlyPayments.add(21.18);
	}
	public void loadWholeCatalog() {
/////////////////////////////////////////////////////////////////////////////////////
// This method will load whole catalog data - <items>,<prices>,<monthlyPayments>
// Call loadItems(),loadPrices(),loadMonthlyPayments() that you created above
///////////////////////////////////////////////////////////////////////////////// TODO

//		System.out.println(sumList(items));
//		double sum = sumList(doubleList);
//		System.out.println("Sum: " + sum);
		
		
		
		
	}

	/**
	 * Write a method that reads values from above ArrayLists and returns a
	 * stringbuilder with all item details: return format(each item in new line and
	 * delimited by '-' ): iPhone 6s-449.0-18.71 iPhone 6s Plus-549.0-22.88 ..
	 * 
	 */

	public StringBuilder getWholeCatalog() {
		// LOAD WHOLE CATALOG HERE FIRST

		// TODO

		return null;
	}

	/**
	 * write a method that an item name and returns all details for it. If item is
	 * not in the list then returns null ex: getItemDetails("ThumbDrive")
	 * -->ThumbDrive-39.99-2.68 getItemDetails("Charger") --> Charger-39.99-4.56
	 * getItemDetails("Potato") --> null
	 * 
	 * @param item
	 * @return
	 */

	public String getItemDetails(String item) {
		// LOAD WHOLE CATALOG HERE FIRST

		// TODO

		return null;
	}

	/**
	 * write a method that accepts a price and returns a ArrayList<String> with
	 * items with all detail that have less than or equal monthly payments
	 * 
	 * getItemsLessThanAMonthlyPrice(5.99) --> ThumbDrive-39.99-2.68
	 * Charger-39.99-4.56 getItemsLessThanAMonthlyPrice(1.99) --> ""
	 * 
	 * @param double price
	 * @return ArrayList<String>
	 */

	public ArrayList<String> getItemsLessThanAMonthlyPrice(double price) {
		// LOAD WHOLE CATALOG HERE FIRST

		// TODO

		return null;
	}

	/**
	 * Method accepts a item name and updates total Price and monthly payments for
	 * that item in <items>,<prices>,<monthlyPayments> arrayLists When assigning
	 * monthlyPayments do => newPrice/12 <= to get monthly payments
	 * 
	 * @param item     name
	 * @param newPrice
	 */

	public void updatePrice(String item, double newPrice) {
		// LOAD WHOLE CATALOG HERE FIRST

		// TODO

	}

	/**
	 * Method looks for an item in the catalog and removes all details for that item
	 * including item name, price, monthlypayments
	 * 
	 * 
	 * @param item
	 */

	public void deleteItemFromCatalog(String item) {
		// LOAD WHOLE CATALOG HERE FIRST

		// TODO
	}

}