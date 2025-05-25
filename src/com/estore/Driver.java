package com.estore;
import java.util.Scanner;

public class Driver {
	static {
		System.out.println("********Welcome to my shop********");
		System.out.println("********Fixed Rate********");
		System.out.println("********Udhari mana hai********");
	}

	public static void main(String[] args) {
		System.out.println("Enter 1 to Register");
		System.out.println("Enter 2 to Login");
		System.out.println("Enter 3 to Guest Login");
		System.out.println("Enter 4 to Exit");

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		ElectronicStore s = new ElectronicStore ();

		switch (x) {
		case 1:
			s.signup();
		case 2:
			s.login();
		case 3:
			s.homepage();
			break;
		case 4:
			System.out.println("Bye Bye");
			System.exit(0);
			break;
		default:
			System.err.println("Enter the above value only");
			main(null);
		}
	}
}
