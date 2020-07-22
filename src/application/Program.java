package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
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
		sc.nextLine();
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String status = sc.nextLine();
		
		Order order = new Order(new Date(), OrderStatus.valueOf(status),new Client(name, email, birthDate));

		System.out.print("How many items to this order? ");
		int repeat = sc.nextInt();
		sc.nextLine();
		for(int x=1; x<=repeat; x++) {
			System.out.println("Enter #"+ x +" item data:");
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int itemQuantity = sc.nextInt();
			sc.nextLine();
			OrderItem orderItem = new OrderItem(itemQuantity, new Product(productName, productPrice));
			order.addItem(orderItem);
		}
		System.out.println();
		System.out.println("ORDER SUMARY: ");
		System.out.println(order);
		
		sc.close();
	}

}
