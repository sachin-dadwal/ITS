package com.its.User;

import java.util.Scanner;

public class MainClass1 {
	public static void main(String[] args) {

		ProductUser pu = new ProductUser();
		CustomerUser cu= new CustomerUser();
		Scanner sc = new Scanner(System.in);
		/*System.out.println("\nPlease Login to continue....\n");

		System.out.println("Enter the username: ");
		String user = sc.nextLine();
		System.out.println("Enter the password: ");
		String pass = sc.nextLine();*/
		//if ("admin".equalsIgnoreCase(user) && "password".equalsIgnoreCase(pass)) {
			System.out.println("\n\n----------------------------------------------------------------");
			//System.out.println("---Welcome Admin---");
			System.out.println("----------------------------------------------------------------");
			System.out.println("Welcome to the Inventory Track System..");
			
			
			do {
				System.out.println("Select the following option..");
				System.out.println("\n1.Customer \n2.Product \n3.Logout");
				int n = sc.nextInt();
				switch (n) {
				case 1: {
					cu.P();
					
					break;
				}
				case 2: {
					pu.P();
					break;
				}

				case 3:
					System.out.println("You are logged out !!!");
					System.exit(0);
					break;
				default: {
					System.out.println("Please select the correct option");
					break;
				}
				}
			} while (1 > 0);
			
		//} else {
			//System.out.println("Please enter the correct password or username..");
		//}

	}

}
