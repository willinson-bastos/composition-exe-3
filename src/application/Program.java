package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String status = sc.nextLine();
		
		Order order = new Order(new Date(), OrderStatus.valueOf(status),new Client(name, email, birthDate));

		System.out.print("How many items to this order? ");
		int repeat = sc.nextInt();
		for(int x=1; x<=repeat; x++) {
			System.out.println("Enter #"+ x +" item data:");
			System.out.print("Product name: ");
			String itemName = sc.nextLine();
			System.out.print("Product price: ");
			double itemPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int itemQuantity = sc.nextInt();
			
		}
		
		sc.close();
	}

}
