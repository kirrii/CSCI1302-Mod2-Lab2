package lab2;
import java.util.Scanner;
import java.text.NumberFormat;

public class ShoppingCartMain {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ShoppingCart cart = new ShoppingCart();
		NumberFormat money = NumberFormat.getCurrencyInstance();
		System.out.println("Add an item? (y/n): ");
		String choo = in.nextLine().trim();
		
		while(choo.equalsIgnoreCase("y")) {
			System.out.print("Item name: ");
			String name = in.nextLine().trim();
			
			System.out.print("Item price: $");
			double price = Double.parseDouble(in.nextLine().trim());
			
			System.out.print("Quamtity: ");
			int qty = Integer.parseInt(in.nextLine().trim());
			
			cart.addToCart(name, price, qty);
			System.out.println(cart);
			
			System.out.print("Add another item? (y/n): ");
			choo = in.nextLine().trim();
			System.out.println();
		}
		System.out.println("Please pay " + money.format(cart.getTotalPrice()));
		
	}
}
