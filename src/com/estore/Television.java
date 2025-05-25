package com.estore;

import java.util.Scanner;

public class Television extends ElectronicStore {

	public void televisionCategory() {
		System.out.println("Enter 1 for Select Television Brands");
		System.out.println("Enter 2 to go back");
		//System.out.println("Enter 4 to go back");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		switch (n) {
		case 1:
			Tbrand a = new Tbrand();
			a.category();
			break;
		case 2:
			homepage();
			break;
		default:
			System.err.println("Invalid Input");
		//	Brand b = new Brand();
		//	b.category();
			televisionCategory();
		}
	}

	public void detail() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A to choose 50inch");
		System.out.println("Enter B to choose 55inch");
		System.out.println("Enter C to choose 60inch");
		System.out.println("Enter D to choose 65inch");
		space = sc.next();
		if (space.equalsIgnoreCase("A") || space.equalsIgnoreCase("B") || space.equalsIgnoreCase("C") || space.equalsIgnoreCase("D")) {
			System.out.println("Model Available");
		} else {
			System.err.println("Model not available");
			televisionCategory();
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
