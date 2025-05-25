package com.estore;

import java.util.Scanner;

public class Brand extends Mobiles {
	public void category() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for SAMSUNG");
		System.out.println("Enter 2 for ONEPLUS");
		System.out.println("Enter 3 for APPLE");
		System.out.println("Enter 4 for VIVO");
		System.out.println("Enter 5 for OPPO");
		System.out.println("Enter 6 to go back");
	//	brand = sc.next();
		int b = sc.nextInt();
		switch (b) {
		case 1 :
			brand = "SAMSUNG";
			System.out.println("You have choosed "+brand);
			SAMSUNG();
			break;
		case 2 :
			brand = "ONEPLUS";
			System.out.println("You have choosed "+brand);
			ONEPLUS();
			break;
	
		case 3 :
			brand = "APPLE";
			System.out.println("You have choosed "+brand);
			APPLE();
			break;

		case 4 :
			brand = "VIVO";
			System.out.println("You have choosed "+brand);
			VIVO();
			break;
		case 5 :
			brand = "OPPO";
			System.out.println("You have choosed "+brand);
			OPPO();
			break;
		case 6:
			mobileCategory();
			break;
		default:
			System.err.println("Invalid Input");
			category();
		}
	}

	public void SAMSUNG() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for SAMSUNG S24 ULTRA");
		System.out.println("Enter 2 for SAMSUNG S24");
		System.out.println("Enter 3 for SAMSUNG S23 ULTRA");
		System.out.println("Enter 4 for SAMSUNG S23");
		System.out.println("Enter 5 for SAMSUNG Z FOLD5");
		System.out.println("Enter 6 to go back");
		int option = sc.nextInt();
		if (isRegistered == false) {
			System.out.println("Please register first");
			signup();
		}
		switch (option) {
		case 1:
			System.out.println("You have choose SAMSUNG S24 ULTRA");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			String confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("SAMSUNG S24 ULTRA",1,149999));
				System.out.println("Product has been added to the cart");
				System.out.println("Enter 1 to continue");
				System.out.println("Enter 2 to checkout");
				option = sc.nextInt();
				if (option == 1) {
					System.out.println("Redirecting to homepage");
					homepage();
				} else {
					PaymentInterface p = new Payment(); // Upcasting
					p.paymentOption();
					//p.bill();
				}
			} else {

			}
			break;
			
		case 2:
			System.out.println("You have choose SAMSUNG S24 ");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("SAMSUNG S24 ULTRA" ,1, 90999));
				System.out.println("Product has been added to the cart");
				System.out.println("Enter 1 to continue");
				System.out.println("Enter 2 to checkout");
				option = sc.nextInt();
				if (option == 1) {
					System.out.println("Redirecting to homepage");
					homepage();
				} else {
					PaymentInterface p = new Payment(); // Upcasting
					p.bill();
				}
			} else {

			}
			break;
		case 3:
			System.out.println("You have choose SAMSUNG S23 ULTRA");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("SAMSUNG S23 ULTRA" ,1, 109999));
				System.out.println("Product has been added to the cart");
				System.out.println("Enter 1 to continue");
				System.out.println("Enter 2 to checkout");
				option = sc.nextInt();
				if (option == 1) {
					System.out.println("Redirecting to homepage");
					homepage();
				} else {
					PaymentInterface p = new Payment(); // Upcasting
					p.bill();
				}
			} else {

			}
			break;
		case 4:
			System.out.println("You have choose SAMSUNG S23");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("SAMSUNG S23" ,1, 89999));
				System.out.println("Product has been added to the cart");
				System.out.println("Enter 1 to continue");
				System.out.println("Enter 2 to checkout");
				option = sc.nextInt();
				if (option == 1) {
					System.out.println("Redirecting to homepage");
					homepage();
				} else {
					PaymentInterface p = new Payment(); // Upcasting
					p.bill();
				}
			} else {

			}
			break;
		case 5:
			System.out.println("You have choose SAMSUNG Z FOLD5");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("SAMSUNG Z FOLD5" ,1, 79999));
				System.out.println("Product has been added to the cart");
				System.out.println("Enter 1 to continue");
				System.out.println("Enter 2 to checkout");
				option = sc.nextInt();
				if (option == 1) {
					System.out.println("Redirecting to homepage");
					homepage();
				} else {
					PaymentInterface p = new Payment(); // Upcasting
					p.bill();
				}
			} else {

			}
			break;
		
		case 6:
			category();
			break;
		}

	}
	public void ONEPLUS() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for ONEPLUS 12R");
		System.out.println("Enter 2 for ONEPLUS 12");
		System.out.println("Enter 3 for ONEPLUS NORD CE 3 LITE 5G");
		System.out.println("Enter 4 for ONEPLUS NORD CE 3 5G");
		System.out.println("Enter 5 for ONEPLUS NORD 3 5G");
		System.out.println("Enter 6 to go back");
		int option = sc.nextInt();
		switch (option) {
		case 1:
			System.out.println("You have choose ONEPLUS 12R");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			String confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("ONEPLUS 12R",1,39999));
				System.out.println("Product has been added to the cart");
				System.out.println("Enter 1 to continue");
				System.out.println("Enter 2 to checkout");
				option = sc.nextInt();
				if (option == 1) {
					System.out.println("Redirecting to homepage");
					homepage();
				} else {
					PaymentInterface p = new Payment(); // Upcasting
					p.bill();
				}
			} else {

			}
			break;
			
		case 2:
			System.out.println("You have choose ONEPLUS 12 ");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("ONEPLUS 12" ,1, 64999));
				System.out.println("Product has been added to the cart");
				System.out.println("Enter 1 to continue");
				System.out.println("Enter 2 to checkout");
				option = sc.nextInt();
				if (option == 1) {
					System.out.println("Redirecting to homepage");
					homepage();
				} else {
					PaymentInterface p = new Payment(); // Upcasting
					p.bill();
				}
			} else {

			}
			break;
		case 3:
			System.out.println("You have choose ONEPLUS NORD CE3 LITE 5G");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("ONEPLUS NORD CE3 LITE 5G" ,1, 17999));
				System.out.println("Product has been added to the cart");
				System.out.println("Enter 1 to continue");
				System.out.println("Enter 2 to checkout");
				option = sc.nextInt();
				if (option == 1) {
					System.out.println("Redirecting to homepage");
					homepage();
				} else {
					PaymentInterface p = new Payment(); // Upcasting
					p.bill();
				}
			} else {

			}
			break;
		case 4:
			System.out.println("You have choose ONEPLUS NORD CE 3 5G");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("ONE PLUS NORD CE 3 5G" ,1, 24999));
				System.out.println("Product has been added to the cart");
				System.out.println("Enter 1 to continue");
				System.out.println("Enter 2 to checkout");
				option = sc.nextInt();
				if (option == 1) {
					System.out.println("Redirecting to homepage");
					homepage();
				} else {
					PaymentInterface p = new Payment(); // Upcasting
					p.bill();
				}
			} else {

			}
			break;
		case 5:
			System.out.println("You have choose ONEPLUS NORD 3 5G");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("ONEPLUS NORD 3 5G" ,1, 28999));
				System.out.println("Product has been added to the cart");
				System.out.println("Enter 1 to continue");
				System.out.println("Enter 2 to checkout");
				option = sc.nextInt();
				if (option == 1) {
					System.out.println("Redirecting to homepage");
					homepage();
				} else {
					PaymentInterface p = new Payment(); // Upcasting
					p.bill();
				}
			} else {

			}
			break;
		case 6:
			category();
			break;
		}
		
	}
	public void APPLE() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for IPhone 15 Pro Max");
		System.out.println("Enter 2 for IPhone 15 Plus");
		System.out.println("Enter 3 for IPhone 14 Pro Max");
		System.out.println("Enter 4 for IPhone 14 Plus");
		System.out.println("Enter 5 for IPhone 13 Pro Max");
		System.out.println("Enter 6 to go back");
		int option = sc.nextInt();
		switch (option) {
		case 1:
			System.out.println("You have choose IPhone 15 Pro Max");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			String confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("IPhone 15 Pro Max",1,148900));
				System.out.println("Product has been added to the cart");
				System.out.println("Enter 1 to continue");
				System.out.println("Enter 2 to checkout");
				option = sc.nextInt();
				if (option == 1) {
					System.out.println("Redirecting to homepage");
					homepage();
				} else {
					PaymentInterface p = new Payment(); // Upcasting
					p.bill();
				}
			} else {

			}
			break;
			
		case 2:
			System.out.println("You have choose IPhone 15 Plus");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("IPhone 15 Plus" ,1, 80990));
				System.out.println("Product has been added to the cart");
				System.out.println("Enter 1 to continue");
				System.out.println("Enter 2 to checkout");
				option = sc.nextInt();
				if (option == 1) {
					System.out.println("Redirecting to homepage");
					homepage();
				} else {
					PaymentInterface p = new Payment(); // Upcasting
					p.bill();
				}
			} else {

			}
			break;
		case 3:
			System.out.println("You have choose IPhone 14 Pro Max");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("IPhone 14 Pro Max" ,1, 127999));
				System.out.println("Product has been added to the cart");
				System.out.println("Enter 1 to continue");
				System.out.println("Enter 2 to checkout");
				option = sc.nextInt();
				if (option == 1) {
					System.out.println("Redirecting to homepage");
					homepage();
				} else {
					PaymentInterface p = new Payment(); // Upcasting
					p.bill();
					
				}
			} else {

			}
			break;
		case 4:
			System.out.println("You have choose IPhone 14 Plus");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("IPhone 14 Plus" ,1, 66999));
				System.out.println("Product has been added to the cart");
				System.out.println("Enter 1 to continue");
				System.out.println("Enter 2 to checkout");
				option = sc.nextInt();
				if (option == 1) {
					System.out.println("Redirecting to homepage");
					homepage();
				} else {
					PaymentInterface p = new Payment(); // Upcasting
					p.bill();
				}
			} else {

			}
			break;
		case 5:
			System.out.println("You have choose IPhone 13 Pro Max");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("IPhone 13 Pro Max" ,1, 129900));
				System.out.println("Product has been added to the cart");
				System.out.println("Enter 1 to continue");
				System.out.println("Enter 2 to checkout");
				option = sc.nextInt();
				if (option == 1) {
					System.out.println("Redirecting to homepage");
					homepage();
				} else {
					PaymentInterface p = new Payment(); // Upcasting
					p.bill();
				}
			} else {

			}
			break;
		case 6:
			category();
			break;
		}
		
	}
	public void VIVO() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for VIVO X100 PRO 5G");
		System.out.println("Enter 2 for VIVO V30 PRO");
		System.out.println("Enter 3 for VIVO V30");
		System.out.println("Enter 4 for VIVO V29 PRO");
		System.out.println("Enter 5 for VIVO V29");
		System.out.println("Enter 6 to go back");
		int option = sc.nextInt();
		switch (option) {
		case 1:
			System.out.println("You have choose ONEPLUS 12R");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			String confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("VIVO X100 PRO 5G",1,89999));
				System.out.println("Product has been added to the cart");
				System.out.println("Enter 1 to continue");
				System.out.println("Enter 2 to checkout");
				option = sc.nextInt();
				if (option == 1) {
					System.out.println("Redirecting to homepage");
					homepage();
				} else {
					PaymentInterface p = new Payment(); // Upcasting
					p.bill();
				}
			} else {

			}
			break;
			
		case 2:
			System.out.println("You have choose VIVO V30 PRO");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("VIVO V30 PRO" ,1, 41999));
				System.out.println("Product has been added to the cart");
				System.out.println("Enter 1 to continue");
				System.out.println("Enter 2 to checkout");
				option = sc.nextInt();
				if (option == 1) {
					System.out.println("Redirecting to homepage");
					homepage();
				} else {
					PaymentInterface p = new Payment(); // Upcasting
					p.bill();
				}
			} else {

			}
			break;
		case 3:
			System.out.println("You have choose VIVO V30");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("VIVO V30" ,1, 33999));
				System.out.println("Product has been added to the cart");
				System.out.println("Enter 1 to continue");
				System.out.println("Enter 2 to checkout");
				option = sc.nextInt();
				if (option == 1) {
					System.out.println("Redirecting to homepage");
					homepage();
				} else {
					PaymentInterface p = new Payment(); // Upcasting
					p.bill();
				}
			} else {

			}
			break;
		case 4:
			System.out.println("You have choose VIVO V29 PRO");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("VIVO V29 PRO" ,1, 39999));
				System.out.println("Product has been added to the cart");
				System.out.println("Enter 1 to continue");
				System.out.println("Enter 2 to checkout");
				option = sc.nextInt();
				if (option == 1) {
					System.out.println("Redirecting to homepage");
					homepage();
				} else {
					PaymentInterface p = new Payment(); // Upcasting
					p.bill();
				}
			} else {

			}
			break;
		case 5:
			System.out.println("You have choose VIVO V29");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("VIVO V29" ,1, 32900));
				System.out.println("Product has been added to the cart");
				System.out.println("Enter 1 to continue");
				System.out.println("Enter 2 to checkout");
				option = sc.nextInt();
				if (option == 1) {
					System.out.println("Redirecting to homepage");
					homepage();
				} else {
					PaymentInterface p = new Payment(); // Upcasting
					p.bill();
				}
			} else {

			}
			break;
		case 6:
			category();
			break;
		}
		
	}
	public void OPPO() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for OPPO FIND N2 FLIP");
		System.out.println("Enter 2 for OPPO RENO 10 PRO+ 5G");
		System.out.println("Enter 3 for OPPO RENO 8 PRO 5G");
		System.out.println("Enter 4 for OPPO RENO 8T 5G");
		System.out.println("Enter 5 for OPPO RENO 8 5G");
		System.out.println("Enter 6 to go back");
		int option = sc.nextInt();
		switch (option) {
		case 1:
			System.out.println("You have choose OPPO FIND N2 FLIP");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			String confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("OPPO FIND N2 FLIP",1,89999));
				System.out.println("Product has been added to the cart");
				System.out.println("Enter 1 to continue");
				System.out.println("Enter 2 to checkout");
				option = sc.nextInt();
				if (option == 1) {
					System.out.println("Redirecting to homepage");
					homepage();
				} else {
					PaymentInterface p = new Payment(); // Upcasting
					p.bill();
				}
			} else {

			}
			break;
			
		case 2:
			System.out.println("You have choose OPPO RENO 10 PRO+ 5G");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("OPPO RENO 10 PRO+ 5G" ,1, 54999));
				System.out.println("Product has been added to the cart");
				System.out.println("Enter 1 to continue");
				System.out.println("Enter 2 to checkout");
				option = sc.nextInt();
				if (option == 1) {
					System.out.println("Redirecting to homepage");
					homepage();
				} else {
					PaymentInterface p = new Payment(); // Upcasting
					p.bill();
				}
			} else {

			}
			break;
		case 3:
			System.out.println("You have choose OPPO RENO 8 PRO 5G");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("OPPO RENO 8 PRO 5G" ,1, 52999));
				System.out.println("Product has been added to the cart");
				System.out.println("Enter 1 to continue");
				System.out.println("Enter 2 to checkout");
				option = sc.nextInt();
				if (option == 1) {
					System.out.println("Redirecting to homepage");
					homepage();
				} else {
					PaymentInterface p = new Payment(); // Upcasting
					p.bill();
				}
			} else {

			}
			break;
		case 4:
			System.out.println("You have choose OPPO RENO 8T 5G");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("OPPO RENO 8T 5G" ,1, 38999));
				System.out.println("Product has been added to the cart");
				System.out.println("Enter 1 to continue");
				System.out.println("Enter 2 to checkout");
				option = sc.nextInt();
				if (option == 1) {
					System.out.println("Redirecting to homepage");
					homepage();
				} else {
					PaymentInterface p = new Payment(); // Upcasting
					p.bill();
				}
			} else {

			}
			break;
		case 5:
			System.out.println("You have choose OPPO RENO 8 5G");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("OPPO RENO 8 5G" ,1, 38999));
				System.out.println("Product has been added to the cart");
				System.out.println("Enter 1 to continue");
				System.out.println("Enter 2 to checkout");
				option = sc.nextInt();
				if (option == 1) {
					System.out.println("Redirecting to homepage");
					homepage();
				} else {
					PaymentInterface p = new Payment(); // Upcasting
					p.bill();
				}
			} else {

			}
			break;
		case 6:
			category();
			break;
		}
		
	}
}
