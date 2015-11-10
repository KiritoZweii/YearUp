import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {
	static ArrayList<Item> shoppingCart = new ArrayList<Item>();
	static Scanner sc = new Scanner(System.in);
	static double total = 0;
	static NumberFormat formatter = new DecimalFormat("0.00"); 



	public static void main(String[] args) {
		introduction();
		ShoppingCart cart = new ShoppingCart();
		cart.shoppingCartWork();
		howToEnd();

	}

	public static void introduction() {
		// This method prints introduction message
		System.out.println("*********************************");
		System.out.println("*                               *");
		System.out.println("*       Shopping Cart           *");
		System.out.println("*                               *");
		System.out.println("*********************************");
	}

	public void shoppingCartWork() {
		System.out.println("Do you want to input items? Type y/n");
		String reply = sc.nextLine();


		if (reply.equalsIgnoreCase("y")) {
			ScanItems();
			ListItems();
			RemoveItems();
			Total();
			;
		} else {
			System.out.println("Goodbye! ");
		}

	}



	public static void ScanItems() {
		System.out.println("Enter item name: ");
		String name = sc.nextLine();
		while (!name.equalsIgnoreCase("n")) {
			System.out.println("Enter quantity: ");
			int quantity = sc.nextInt();
			System.out.println("Enter price: ");
			double price = sc.nextDouble();
			sc.nextLine();
			Item food = new Item(name, quantity, price);
			shoppingCart.add(food);
			System.out.println("Enter next item or n to quit");
			name = sc.next();
			sc.nextLine();
		}
	}

	public static void ListItems() {

		System.out.println();
		System.out.println("*********** Here are your Items ***********");
		int i = 0;
		while (i < shoppingCart.size()) {
			Item index = shoppingCart.get(i);
			System.out.println("Item #" + (i + 1) + " is " + index.m_name + " and you have " + index.getM_quantity()
			+ " with a price of $" + formatter.format(index.getM_price()));
			i++;

		}

	}

	public static void RemoveItems() 
	{
		System.out.println("\nDo you want to remove a item? y/n");
		ListItems();
		String remove = sc.nextLine();
		if (!remove.equalsIgnoreCase("n"))
		{
			System.out.println("Enter the item number you want to remove: ");
			int itemNumber = sc.nextInt();
			int itemIndex = itemNumber -1;
			while (itemNumber != -1)
			{
				Item index = shoppingCart.get(itemIndex);
				if (index != null)
				{
					shoppingCart.remove(itemIndex);
					System.out.println(index.getM_name()+ " has been removed");
					ListItems();
				}
				System.out.println("Remove another item number or -1 to quit");
				itemNumber = sc.nextInt();

			}
		}
	}
	public static String Total()
	{
		double price = 0;
		int i = 0;
		while(i < shoppingCart.size()){
			for (i = 0; i < shoppingCart.size(); i++){
				Item Price = shoppingCart.get(i);
				price = price + (Price.getM_price() * Price.getM_quantity());
			}
			System.out.println();
			System.out.println("*********** Here is Your Final List of Items ***********");
			System.out.println();
			price = (price * .075) + price;
			System.out.println("Your total price is $" + formatter.format(price));
			total = price;
			if (total >= 100){
				System.out.println("You have to pay with a card. Your price is over $100");

			}
			if (price < 100){
				System.out.println("We see that your items have not exceeded $100.00. "
						+ "We will therefore only accept cash.");


				System.out.println();
				System.out.println("Do you want to input items? Type y/n");
				String reply = sc.nextLine();

				if (reply.equalsIgnoreCase("y")) {
					ScanItems();
					ListItems();
					RemoveItems();
					Total();
				}
				else if(reply.equalsIgnoreCase("n"))
				{
					System.out.println();
					System.out.println("*********** Thanks for using the Shopping Cart ***********");



				}
				else 
				{
					System.out.println();
					System.out.println("Do you want to input items? Type y/n");
					if (reply.equalsIgnoreCase("y")) {
						ScanItems();
						ListItems();
						RemoveItems();
						Total();
					}
					else if(reply.equalsIgnoreCase("n"))
					{
						System.out.println();
						System.out.println("*********** Thanks for using the Shopping Cart ***********");



					}
				}
		
					
				
			}


			return null;
		}
		return null;

	}
	public static String howToEnd(){
		if(total > 100)
			System.out.println();
		System.out.println("Do you want to input items? Type y/n");
		String reply = sc.nextLine();

		if (reply.equalsIgnoreCase("y")) {
			ScanItems();
			ListItems();
			RemoveItems();
			Total();
		}
		else if(reply.equalsIgnoreCase("n"))
		{
			System.out.println();
			System.out.println("*********** Thanks for using the Shopping Cart ***********");

		return null;
		}
		return reply;
		
	}
}


