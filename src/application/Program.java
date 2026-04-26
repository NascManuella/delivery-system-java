package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.BikeDelivery;
import entities.CarDelivery;
import entities.DeliveryService;
import entities.ExpressDelivery;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		List<DeliveryService> list = new ArrayList<>();
		
		System.out.print("How many deliveries? ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			
			System.out.println("\nDelivery #" + i);
			System.out.print("Delivery type (a = Car, b = Bike, c = Express): ");
			char type = sc.next().charAt(0);
			
			System.out.print("Distance: ");
			double distance = sc.nextDouble();
			
			DeliveryService d;
			
			if(type == 'a') {
				d = new CarDelivery();
			} else if(type == 'b') {
				d = new BikeDelivery();
			} else if (type == 'c') {
				d = new ExpressDelivery();
			} else {
				System.out.println("Invalid type");
				i--;
				continue;
			}
			
			list.add(d);
			
			System.out.println(d.getClass().getSimpleName()
					+ " - $"
					+ String.format("%.2f", d.calculateFee(distance)));
		}
		
		
		sc.close();

	}

}
