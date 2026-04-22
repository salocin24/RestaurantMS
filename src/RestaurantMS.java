

import java.util.ArrayList;
import java.util.Scanner;

public class RestaurantMS {

	private static final Scanner input = new Scanner(System.in);

	public static void printMenu() {
		System.out.println("Crusty Krab Restaurant Management System");
		System.out.println("1. View Restaurants");
		System.out.println("2. View Menu by Location");
		System.out.println("3. Add Customer");
		System.out.println("0. Exit");
		System.out.print("Chose an option: ");
	}
	private static int readInt() {
		while(!input.hasNext()) {
			System.out.println("Enter a valid number: ");
			input.next();
		}
		return input.nextInt();
	}
	
	private static void viewRestaurants() {
		RestaurantDAO dao = new RestaurantDAO();
		ArrayList<Restaurant> restaurants = dao.getAllRestaurants();
		
		if(restaurants.isEmpty()) {
			System.out.println("No restaurants found.");
			return;
		}
		
		System.out.printf("%-10s %-40s %-15s %-10s%n", "ID", "Address", "Phone", "Area");
		System.out.println("--------------------------------------------------------------");
		
		for(Restaurant r : restaurants) {
			System.out.printf("%-10d %-40s %-15s %-10s%n",
					r.getStoreID(),
					r.getAddress(),
					r.getPhoneNum(),
					r.getAreaCode()
					);
		}
	}
	
	public static void main(String[] args) {
		boolean running = true;
		while(running) {
			printMenu();
			int choice = readInt();
			
			switch(choice) {
			case 1:
				viewRestaurants();
			}
		}
	}
}
