package com.estore;

import java.util.Scanner;
import java.util.Locale.Category;

public class Mobiles extends ElectronicStore {

	public void mobileCategory() {
		System.out.println("Enter 1 for Select Mobile Brands");
		System.out.println("Enter 2 to go back");
		//System.out.println("Enter 4 to go back");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		switch (n) {
		case 1:
			Brand a = new Brand();
			a.category();
			break;
		case 2:
			homepage();
			break;
		default:
			System.err.println("Invalid Input");
		//	Brand b = new Brand();
		//	b.category();
			mobileCategory();
		}
	}

	public void detail() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A to choose 6/128");
		System.out.println("Enter B to choose 8/128");
		System.out.println("Enter C to choose 6/256");
		System.out.println("Enter D to choose 8/256");
		System.out.println("Enter E to go back");
		space = sc.next();
		if (space.equalsIgnoreCase("A") || space.equalsIgnoreCase("B") || space.equalsIgnoreCase("C") || space.equalsIgnoreCase("D")) {
			System.out.println("Model Available");
		}
		
		else {
			System.err.println("Model not available");
			mobileCategory();
		}
	
		System.out.println("Enter 1 for Blue");
		System.out.println("Enter 2 for Black");
		System.out.println("Enter 3 for White");
		int n = sc.nextInt();
		switch (n) {
		case 1:
			color = "Blue";
			System.out.println(color);
			break;
		case 2:
			color = "Black";
			System.out.println(color);
			break;
		case 3:
			color = "White";
			System.out.println(color);
			break;
			
		default:
			System.err.println("No color found");
			detail();
			break;
		}
	}

}
