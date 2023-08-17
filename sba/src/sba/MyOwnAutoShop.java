package sba;

import java.text.DecimalFormat;

public class MyOwnAutoShop {
	public static void main(String[] args) {
		Sedan sedan = new Sedan(150, 25000, "Blue", 18);
		Ford ford1 = new Ford(180, 30000, "Red", 2023, 2000);
		Ford ford2 = new Ford(200, 35000, "Black", 2022, 1500);
		Car car = new Car(160, 20000, "Green");

		DecimalFormat df = new DecimalFormat("#0.00");

		System.out.println("Sedan Sale Price: " + formatPrice(sedan.getSalePrice(), df));
		System.out.println("Ford1 Sale Price: " + formatPrice(ford1.getSalePrice(), df));
		System.out.println("Ford2 Sale Price: " + formatPrice(ford2.getSalePrice(), df));
		System.out.println("Car Sale Price: " + formatPrice(car.getSalePrice(), df));
	}

	// Helper method to format price with DecimalFormat
	public static String formatPrice(double price, DecimalFormat df) {
		return df.format(price);
	}
}
