package com.estore;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ElectronicStore // Super Class
{
	String userName;
	String password;
	String cpassword;
	long contact;
	String mail;
	String address;
	static boolean isRegistered = false;
	boolean b = false;
	String space;
	String brand;
	double price;
	String color;

	static List<Product> cart = new ArrayList<>();

	public void login() {
		if (isRegistered == false) {
			System.out.println("Please Register First");
			signup();
			// isRegistered = true;
		}
		System.out.println("Please proceed to login");
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 to login with contact");
		System.out.println("Press 2 to login with email");
		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("Enter the contact number");
			long contact = sc.nextLong();
			sc.nextLine();
			if (contact == this.contact) {
				System.out.println("Successful");
			} else {
				System.err.println("Contact is invalid");
				login();
			}
			break;
		case 2:
			System.out.println("Enter your mail id");
			sc.nextLine();
			String mail = sc.nextLine();
			if (mail.equals(this.mail)) {
				System.out.println("Successful");
			} else {
				System.err.println("Email is invalid");
				login();
			}
			break;
		default:
			System.err.println("Invalid Input Try Again!!");
			login();
		}
		if (b == false) {
			System.out.println("Enter your password");
			String password = sc.nextLine();
			if (password.equals(this.password)) {
				System.out.println("Login Successful");
				b = true;
			} else {
				System.err.println("Invalid Password Try Again");
				login();
			}
		}
	}

	public void signup() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the username");
		userName = sc.nextLine();
		passwordValidation();
		contactValidation();
		System.out.println("Enter the address");
		address = sc.nextLine();
		//System.out.println("Enter the Email");
		//mail = sc.nextLine();
		emailValidation();
		captcha();
		isRegistered = true;
	}

	public void captcha() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		String captcha = "";
		while (captcha.length() < 6) {
			int n = r.nextInt(122);
			if ((n >= 97 && n <= 122) || (n >= 48 && n <= 57)) {
				captcha = captcha + (char) n;
			}
		}
		System.out.println("Enter the below captcha");
		System.out.println(captcha);
		String userCap = sc.nextLine();
		if (captcha.equals(userCap)) {
			System.out.println("Captcha Correct");
		} else {
			System.err.println("Try Again!!!");
			captcha();
		}
	}

	public void passwordValidation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the password");
		password = sc.nextLine();
		System.out.println("Enter the Confirm Password");
		cpassword = sc.nextLine();
		if (password.equals(cpassword)) {
			System.out.println("Password is Valid");
		} else {
			System.err.println("Password not matching Please try again!!");
			passwordValidation();
		}
	}

	public void contactValidation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the contact number");
		contact = sc.nextLong();
		if (contact > 999999999L && contact < 10000000000L) {
			System.out.println("Contact is valid");
		} else {
			System.err.println("Enter 10 digits number");
			contactValidation();
		}
	}
	public void emailValidation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the email id");
		mail = sc.next();
		if (mail.endsWith("@gmail.com")) {
			System.out.println("email id is valid");
		} else {
			System.err.println("Enter valid email id");
			emailValidation();
		}
	}

	public void homepage() {
		System.out.println("Enter 1 for Mobiles");
		System.out.println("Enter 2 for Televisions");
		System.out.println("Enter 3 for Laptops");
		System.out.println("Enter 4 for Air Conditioners");
		System.out.println("Enter 5 for Refrigerators");
		System.out.println("Enter 6 for Headphones");
		System.out.println("Enter 5 for Smart Watches");
		System.out.println("Enter 8 for Tablets");
		System.out.println("Enter 9 for Cameras");
		System.out.println("Enter 10 for WI-FI");
		System.out.println("Enter 11 for BT Speakers");
		System.out.println("Enter 12 for Exit");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		switch (n) {
		case 1:
			Mobiles f = new Mobiles();
			f.mobileCategory();
			break;
		case 2: 
			Television t = new Television();
			t.televisionCategory();
			break;
		case 3: 
			Laptop l = new Laptop();
			l.laptopCategory();
			break;
		case 12:
			System.out.println("Thank you");
			System.exit(0);
			break;
		default:
			System.err.println("Invalid Input");
			homepage();
		}
	}
}
