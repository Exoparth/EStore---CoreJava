package com.estore;

import java.util.Scanner;

public class Lapbrand extends Laptop {
	public void category() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for DELL");
		System.out.println("Enter 2 for LENOVO");
		System.out.println("Enter 3 for APPLE");
		System.out.println("Enter 4 for ASUS");
		System.out.println("Enter 5 for HP");
		System.out.println("Enter 6 to go back");
	//	brand = sc.next();
		int b = sc.nextInt();
		switch (b) {
		case 1 :
			brand = "DELL";
			DELL();
			break;
		case 2 :
			brand = "LENOVO";
			LENOVO();
			break;
	
		case 3 :
			brand = "APPLE";
			APPLE();
			break;

		case 4 :
			brand = "ASUS";
			ASUS();
			break;
		case 5 :
			brand = "HP";
			HP();
			break;
		case 6:
			laptopCategory();
			break;
		default:
			System.err.println("Invalid Input");
			category();
		}
	}

	public void DELL() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for DELL XPS 17(13th Gen i9)");
		System.out.println("Enter 2 for DELL INSPIRON 15 3530");
		System.out.println("Enter 3 for DELL ALIENWARE M18 R2");
		System.out.println("Enter 4 for DELL XPS 15");
		System.out.println("Enter 5 for DELL INSPIRON 12 2-in-1");
		System.out.println("Enter 6 to go back");
		int option = sc.nextInt();
		if (isRegistered == false) {
			System.out.println("Please register first");
			signup();
		}
		switch (option) {
		case 1:
			System.out.println("You have choose DELL XPS 17(13th Gen i9)");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			String confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("DELL XPS 17(13th Gen i9)",1,380000));
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
				System.out.println("Purchased Cancel");
				DELL();
			}
			break;
		case 2:
			System.out.println("You have choose DELL INSPIRON 15 3530");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("DELL INSPIRON 15 3530",1,43500));
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
				System.out.println("Purchased Cancel");
				DELL();
			}
			break;
			
		case 3:
			System.out.println("You have choose DELL ALIENWARE M18 R2");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("DELL ALIENWARE M18 R2",1,296500));
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
				System.out.println("Purchased Cancel");
				DELL();
			}
			break;
		case 4:
			System.out.println("You have choose DELL XPS 15");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("DELL XPS 15",1,250000));
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
				System.out.println("Purchased Cancel");
				DELL();
			}
			break;
		case 5:
			System.out.println("You have choose DELL INSPIRON 16 2-in-1");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("DELL INSPIRON 16 2-in-1",1,101000));
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
				System.out.println("Purchased Cancel");
				DELL();
			}
			break;
		
		case 6:
			category();
			break;
		}

		
	}
	public void LENOVO() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for LENOVO LEGION 9i 16IRX8");
		System.out.println("Enter 2 for LENOVO LEGION 7i");
		System.out.println("Enter 3 for LENOVO YOGA BOOK 9i");
		System.out.println("Enter 4 for LENOVO THINKPAD P15V");
		System.out.println("Enter 5 for LENOVO IDEAPAD 710S");
		System.out.println("Enter 6 to go back");
		int option = sc.nextInt();
		if (isRegistered == false) {
			System.out.println("Please register first");
			signup();
		}
		switch (option) {
		case 1:
			System.out.println("You have choose LENOVO LEGION 9i 16IRX8");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			String confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("LENOVO LEGION 9i 16IRX8",1,450000));
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
				System.out.println("Purchased Cancel");
				LENOVO();
			}
			break;
		case 2:
			System.out.println("You have choose LENOVO LEGION 7i");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("LENOVO LEGION 7i",1,413950));
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
				System.out.println("Purchased Cancel");
				LENOVO();
			}
			break;
			
		case 3:
			System.out.println("You have choose LENOVO YOGA BOOK 9i");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("LENOVO YOGA BOOK 9i",1,223000));
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
				System.out.println("Purchased Cancel");
				LENOVO();
			}
			break;
		case 4:
			System.out.println("You have choose LENOVO THINKPAD P15V");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("LENOVO THINKPAD P15V",1,165999));
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
				System.out.println("Purchased Cancel");
				LENOVO();
			}
			break;
		case 5:
			System.out.println("You have choose LENOVO IDEAPAD 710S");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("LENOVO IDEAPAD 710S",1,153000));
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
				System.out.println("Purchased Cancel");
				LENOVO();
			}
			break;
		
		case 6:
			category();
			break;
		}

		
	}
	public void APPLE() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for 13inch MacBook Air M1");
		System.out.println("Enter 2 for 13inch MacBook Air M2");
		System.out.println("Enter 3 for 16inch MacBook Pro M1");
		System.out.println("Enter 4 for 14inch MacBook Pro M1");
		System.out.println("Enter 5 for 16inch MacBook Pro");
		System.out.println("Enter 6 to go back");
		int option = sc.nextInt();
		if (isRegistered == false) {
			System.out.println("Please register first");
			signup();
		}
		switch (option) {
		case 1:
			System.out.println("You have choose 13inch MacBook Air M1");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			String confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("13inch MacBook Air M1",1,80000));
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
				System.out.println("Purchased Cancel");
				APPLE();
			}
			break;
		case 2:
			System.out.println("You have choose 13inch MacBook Air M2");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("13inch MacBook Air M2",1,116900));
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
				System.out.println("Purchased Cancel");
				APPLE();
			}
			break;
			
		case 3:
			System.out.println("You have choose 16inch MacBook Pro M1");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("16inch MacBook Pro M1",1,223950));
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
				System.out.println("Purchased Cancel");
				APPLE();
			}
			break;
		case 4:
			System.out.println("You have choose 14inch MacBook Pro M1");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("14inch MacBook Pro M1",1,174900));
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
				System.out.println("Purchased Cancel");
				APPLE();
			}
			break;
		case 5:
			System.out.println("You have choose 16inch MacBook Pro");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("16inch MacBook Pro",1,232450));
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
				System.out.println("Purchased Cancel");
				APPLE();
			}
			break;
		
		case 6:
			category();
			break;
		}

		
	}
	public void ASUS() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for ASUS ROG Strix SCAR 16");
		System.out.println("Enter 2 for ASUS ROG Zephyrus Duo 16");
		System.out.println("Enter 3 for ASUS ROG Zephyrus G14");
		System.out.println("Enter 4 for ASUS ROG Flow X13");
		System.out.println("Enter 5 for ASUS TUF Gaming F15");
		System.out.println("Enter 6 to go back");
		int option = sc.nextInt();
		if (isRegistered == false) {
			System.out.println("Please register first");
			signup();
		}
		switch (option) {
		case 1:
			System.out.println("You have choose ASUS ROG Strix SCAR 16");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			String confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("ASUS ROG Strix SCAR 16",1,289990));
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
				System.out.println("Purchased Cancel");
				ASUS();
			}
			break;
		case 2:
			System.out.println("You have choose ASUS ROG Zephyrus Duo 16");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("ASUS ROG Zephyrus Duo 16",1,299990));
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
				System.out.println("Purchased Cancel");
				ASUS();
			}
			break;
			
		case 3:
			System.out.println("You have choose ASUS ROG Zephyrus G14");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("ASUS ROG Zephyrus G14",1,266990));
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
				System.out.println("Purchased Cancel");
				ASUS();
			}
			break;
		case 4:
			System.out.println("You have choose ASUS ROG Flow X13");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("ASUS ROG Flow X13",1,129990));
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
				System.out.println("Purchased Cancel");
				ASUS();
			}
			break;
		case 5:
			System.out.println("You have choose ASUS TUF Gaming F15");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("ASUS TUF Gaming F15",1,58990));
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
				System.out.println("Purchased Cancel");
				ASUS();
			}
			break;
		
		case 6:
			category();
			break;
		}

		
	}
	public void HP() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for HP Envy x360 2-in-1 Laptop");
		System.out.println("Enter 2 for HP Laptop 39.6cm ");
		System.out.println("Enter 3 for HP EliteBook 840");
		System.out.println("Enter 4 for VICTUS Gaming Laptop 15");
		System.out.println("Enter 5 for HP pavilion Laptop");
		System.out.println("Enter 6 to go back");
		int option = sc.nextInt();
		if (isRegistered == false) {
			System.out.println("Please register first");
			signup();
		}
		switch (option) {
		case 1:
			System.out.println("You have choose HP Envy x360 2-in-1 Laptop");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			String confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("HP Envy x360 2-in-1 Laptop",1,99999));
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
				System.out.println("Purchased Cancel");
				HP();
			}
			break;
		case 2:
			System.out.println("You have choose HP Laptop 39.6cm ");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("HP Laptop 39.6cm ",1,60999));
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
				System.out.println("Purchased Cancel");
				HP();
			}
			break;
			
		case 3:
			System.out.println("You have choose HP EliteBook 840");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("HP EliteBook 840",1,120450));
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
				System.out.println("Purchased Cancel");
				HP();
			}
			break;
		case 4:
			System.out.println("You have choose VICTUS Gaming Laptop 15");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("VICTUS Gaming Laptop 15",1,70449));
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
				System.out.println("Purchased Cancel");
				HP();
			}
			break;
		case 5:
			System.out.println("You have choose HP pavilion Laptop");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("HP pavilion Laptop",1,32999));
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
				System.out.println("Purchased Cancel");
				HP();
			}
			break;
		
		case 6:
			category();
			break;
		}

		
	}
}	