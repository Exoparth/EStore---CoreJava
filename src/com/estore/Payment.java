package com.estore;

import java.util.Random;
import java.util.Scanner;

public class Payment implements PaymentInterface{
	long contact;
	long card;
	public void paymentOption() {
		System.out.println("Enter 1 for UPI");
		System.out.println("Enter 2 for CREDIT CARD");
		Scanner sc = new Scanner(System.in);
		int payment = sc.nextInt();
		switch (payment) {
		case 1: {
			bill();
		}
		case 2 :
		{
			credit();
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + payment);
		}
		
	}
	public void bill() {
		System.out.println("This is your bill");
		int total = 0;
		for (Product p : ElectronicStore.cart) {
			total = total + p.price;
			System.out.println(p);
		}
		System.out.println("The final bill is " + total);
		upi();
	}
	@Override
	public void upi() {
		contactValidation();
		otp();
	}
	public void contactValidation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the contact number from which you want to make payment");
		contact = sc.nextLong();
		if (contact > 999999999L && contact < 10000000000L) {
			System.out.println("Contact is valid");
		} else {
			System.err.println("Enter 10 digits number");
			contactValidation();
		}
	}

	public void otp() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int otp = r.nextInt(10000);
		if (otp>999 && otp < 10000) {
			System.out.println(otp);
			System.out.println("Enter the otp to confirm payment");
			int userotp = sc.nextInt();
			if (otp == userotp) {
				System.out.println("Purchased has been made successfully");
			//	System.out.println("Your Products");
				int total = 0;
				for (Product p : ElectronicStore.cart) {
					total = total + p.price;
					System.out.println("Your Products are: "+p);
				}
				System.out.println("Paid Amount:" + total);
				System.out.println("Please visit again!");
				System.exit(0);
				
			}
			else {
				System.err.println("Invalid OTP. Please enter valid OTP");
				otp();
			}
		}
		else
		{
			otp();
		}
		
	}
	
	@Override
	public void credit() {
			Scanner sc = new Scanner(System.in);
			//long card;
			System.out.println("Please Enter Card Number");
			card = sc.nextLong();
			if(card > 99999999999L && card < 1000000000000L) {
				System.out.println("Your Card is Valid");
				//upi();
			}
			else {
				System.err.println("Please enter valid card number");
				credit();
			}
			System.out.println("Please enter cvv");
			Random r = new Random();
			int cvv = r.nextInt(1000);
			if (cvv>100 && cvv<1000) {
				System.out.println(cvv);
				System.out.println("Enter the cvv to confirm payment");
				int usercvv = sc.nextInt();
				if (cvv == usercvv) {
					System.out.println("Purchased has been made successfully");
					upi();
				}
				else {
					System.out.println("Please Enter Valid Details");
					credit();
				}
		}
	}		
	

	@Override
	public void netBanking() {
		// TODO Auto-generated method stub
		
	}
	

}
