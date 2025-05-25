package com.estore;

import java.util.Scanner;

public class Tbrand extends Television {
	public void category() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for SONY");
		System.out.println("Enter 2 for SAMSUNG");
		System.out.println("Enter 3 for MI");
		System.out.println("Enter 4 for LG ");
		System.out.println("Enter 5 for REDMI");
		System.out.println("Enter 6 to go back");
	//	brand = sc.next();
		int b = sc.nextInt();
		switch (b) {
		case 1 :
			brand = "SONY";
			SONY();
			break;
		case 2 :
			brand = "SAMSUNG";
			SAMSUNG();
			break;
	
		case 3 :
			brand = "MI";
			MI();
			break;

		case 4 :
			brand = "LG";
			LG();
			break;
		case 5 :
			brand = "PANASONIC";
			REDMI();
			break;
		case 6:
			televisionCategory();
			break;
		default:
			System.err.println("Invalid Input");
			category();
		}
	}

	public void SONY() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for SONY XR-65A80L");
		System.out.println("Enter 2 for SONY BRAVIA 65inch");
		System.out.println("Enter 3 for SONY X80L");
		System.out.println("Enter 4 for SONY BRAVIA 125.7cm");
		System.out.println("Enter 5 for SONY X85J");
		System.out.println("Enter 6 to go back");
		int option = sc.nextInt();
		if (isRegistered == false) {
			System.out.println("Please register first");
			signup();
		}
		switch (option) {
		case 1:
			System.out.println("You have choose SONY XR-65A80L");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			String confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("SONY XR-65A80L",1,249900));
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
				SONY();
			}
			break;
		case 2:
			System.out.println("You have choose SONY BRAVIA 65inch");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("SONY BRAVIA 65inch",1,139900));
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
				SONY();
			}
			break;
			
		case 3:
			System.out.println("You have choose SONY X80L");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("SONY X80L",1,114900));
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
				SONY();
			}
			break;
		case 4:
			System.out.println("You have choose SONY BRAVIA 125.7cm");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("SONY BRAVIA 125.7cm",1,85900));
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
				SONY();
			}
			break;
		case 5:
			System.out.println("You have choose SONY X85J");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("SONY X85J",1,148500));
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
				SONY();
			}
			break;
		
		case 6:
			category();
			break;
		}

		
	}
	public void SAMSUNG() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for SAMSUNG NEO QLED 4K");
		System.out.println("Enter 2 for SAMSUNG QN85C 4K");
		System.out.println("Enter 3 for SAMSUNG AU7700");
		System.out.println("Enter 4 for SAMSUNG BU8570 CRYSTAL 4K");
		System.out.println("Enter 5 for SAMSUNG LS03B");
		System.out.println("Enter 6 to go back");
		int option = sc.nextInt();
		if (isRegistered == false) {
			System.out.println("Please register first");
			signup();
		}
		switch (option) {
		case 1:
			System.out.println("You have choose SAMSUNG NEO QLED 4K");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			String confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("SAMSUNG NEO QLED 4K",1,135950));
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
				SAMSUNG();
			}
			break;
		case 2:
			System.out.println("You have choose SAMSUNG QN85C 4K");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("SAMSUNG QN85C 4K",1,110490));
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
				SAMSUNG();
			}
			break;
			
		case 3:
			System.out.println("You have choose SAMSUNG AU7700");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("SAMSUNG AU7700",1,110990));
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
				SAMSUNG();
			}
			break;
		case 4:
			System.out.println("You have choose SAMSUNG BU8570 CRYSTAL 4K");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("SAMSUNG BU8570 CRYSTAL 4K",1,112990));
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
				SAMSUNG();
			}
			break;
		case 5:
			System.out.println("You have choose SAMSUNG LS03B");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("SAMSUNG LS03B",1,129990));
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
				SAMSUNG();
			}
			break;
		
		case 6:
			category();
			break;
		}

		
	}
	public void MI() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for MI QLED TV 75");
		System.out.println("Enter 2 for XIAOMI OLED VISION TV 55");
		System.out.println("Enter 3 for XIAOMI SMART TV X 65");
		System.out.println("Enter 4 for XIAOMI SMART TV X PRO");
		System.out.println("Enter 5 for MI TV 5X 55");
		System.out.println("Enter 6 to go back");
		int option = sc.nextInt();
		if (isRegistered == false) {
			System.out.println("Please register first");
			signup();
		}
		switch (option) {
		case 1:
			System.out.println("You have choose MI QLED TV 75");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			String confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("MI QLED TV 75",1,144999));
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
				MI();
			}
			break;
		case 2:
			System.out.println("You have choose XIAOMI OLED VISION TV 55");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("XIAOMI OLED VISION TV 55",1,74999));
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
				MI();
			}
			break;
			
		case 3:
			System.out.println("You have choose XIAOMI SMART TV X 65");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("XIAOMI SMART TV X 65",1,59999));
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
				MI();
			}
			break;
		case 4:
			System.out.println("You have choose XIAOMI SMART TV X PRO");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("XIAOMI SMART TV X PRO",1,47999));
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
				MI();
			}
			break;
		case 5:
			System.out.println("You have choose MI TV 5X 55");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("MI TV 5X 55",1,49999));
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
				MI();
			}
			break;
		
		case 6:
			category();
			break;
		}

		
	}
	public void LG() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for LG OLED EVO C77");
		System.out.println("Enter 2 for LG QNED MINI LED QNED 90");
		System.out.println("Enter 3 for LG OLED B3 ");
		System.out.println("Enter 4 for LG UHD TV UR80");
		System.out.println("Enter 5 for LG OLED A3");
		System.out.println("Enter 6 to go back");
		int option = sc.nextInt();
		if (isRegistered == false) {
			System.out.println("Please register first");
			signup();
		}
		switch (option) {
		case 1:
			System.out.println("You have choose LG OLED EVO C77");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			String confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("LG OLED EVO C77",1,463000));
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
				LG();
			}
			break;
		case 2:
			System.out.println("You have choose LG QNED MINI LED QNED 90");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("LG QNED MINI LED QNED 90",1,239990));
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
				LG();
			}
			break;
			
		case 3:
			System.out.println("You have choose LG OLED B3 ");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("LG OLED B3 ",1,205030));
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
				LG();
			}
			break;
		case 4:
			System.out.println("You have choose LG UHD TV UR80");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("LG UHD TV UR80",1,140000));
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
				LG();
			}
			break;
		case 5:
			System.out.println("You have choose LG OLED A3");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("LG OLED A3",1,99990));
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
				LG();
			}
			break;
		
		case 6:
			category();
			break;
		}

		
	}
	public void REDMI() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for REDMI SMART TV X65");
		System.out.println("Enter 2 for REDMI SMART TV X55");
		System.out.println("Enter 3 for REDMI SMART FIRE TV 4K");
		System.out.println("Enter 4 for REDMI SMART TV X43");
		System.out.println("Enter 5 for REDMI SMART TV X50");
		System.out.println("Enter 6 to go back");
		int option = sc.nextInt();
		if (isRegistered == false) {
			System.out.println("Please register first");
			signup();
		}
		switch (option) {
		case 1:
			System.out.println("You have choose REDMI SMART TV X65");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			String confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("REDMI SMART TV X65",1,59999));
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
				REDMI();
			}
			break;
		case 2:
			System.out.println("You have choose REDMI SMART TV X55");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("REDMI SMART TV X55",1,34999));
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
				REDMI();
			}
			break;
			
		case 3:
			System.out.println("You have choose REDMI SMART FIRE TV 4K");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("REDMI SMART FIRE TV 4K",1,24999));
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
				REDMI();
			}
			break;
		case 4:
			System.out.println("You have choose REDMI SMART TV X43");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("REDMI SMART TV X43",1,24999));
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
				REDMI();
			}
			break;
		case 5:
			System.out.println("You have choose REDMI SMART TV X50");
			detail();
			System.out.println("Press Y to purchase");
			System.out.println("Press N to cancel");
			confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				cart.add(new Product("REDMI SMART TV X50",1,32999));
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
				REDMI();
			}
			break;
		
		case 6:
			category();
			break;
		}

		
	}
}	