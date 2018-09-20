package com.its.User;

import java.util.Scanner;

import com.its.App.Customer;
import com.its.App.CustomerManipulation;
import com.its.Storage.ITStorage;

public class CustomerUser {

	public static void P() {
		boolean res = true;

		Scanner sc = new Scanner(System.in);

		Customer c1, c2, c3, c4;

		do {
			System.out.println(
					"Please Select the following operation to perform \n\n1.Add\n2.Remove\n3.Search\n4.Display\n5.Update\n6.Logout");
			int i = sc.nextInt();
			CustomerManipulation cm = new CustomerManipulation();
			switch (i) {
			case 1:
			{
				c1 = new Customer();

				System.out.println("Enter a Customer id");
				c1.setcId(sc.next());

				System.out.println("Enter the Customer Name");
				c1.setcName(sc.next());

				System.out.println("Enter the Phone number");
				String ph=sc.next();
				if(ph.length()==10)
				{
				c1.setcPhno(ph);
				
				System.out.println("Enter the email id");
				c1.setcEmail(sc.next());
				}
				else
				{
					try {
						throw new Exception();
					} catch (Exception e) {
						System.out.println("Please enter the valid phone number");
					}
				}
				cm.addCustomer(c1);
				
				// System.out.println(cm.addCustomer(c1));
				break;
				}

			case 2:

				if (ITStorage.listofUsers.size() == 0) {
					try {
						throw new NullPointerException();
					} catch (NullPointerException e) {
						// TODO Auto-generated catch block
						sc.nextLine();
						System.out.println("List is empty");
					
						System.out.println("Please create a user first ");
						
						
						{
							c1 = new Customer();

							System.out.println("Enter a Customer id");
							c1.setcId(sc.next());

							System.out.println("Enter the Customer Name");
							c1.setcName(sc.next());

							System.out.println("Enter the Phone number");
							c1.setcPhno(sc.next());

							System.out.println("Enter the email id");
							c1.setcEmail(sc.next());
							cm.addCustomer(c1);
							
							// System.out.println(cm.addCustomer(c1));
							break;
							}
						
						
					}
				}

				else {
					c1 = new Customer();
					System.out.println("Enter the customer id you want to delete:");
					// ct1.setPhNo(sc.nextLong());
					c2 = cm.searchCustomer(sc.next());
					cm.removeCustomer(c2);
				}

				break;

			case 3:
				if (ITStorage.listofUsers.size() == 0) {
					try {
						throw new Exception();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						System.out.println("List is empty");
						
					}
				}

				else {
					c1 = new Customer();
					System.out.println("Enter the customer id you want to seach the details");
					c3 = cm.searchCustomer(sc.next());
					System.out.println(c3);
					System.out.println("*******************");
					System.out.println("Customer Id" + "\t" + "Name" + "\t" + "PhNo " + "\t" + "EMail");
					System.out.println(c3.getcId() + "\t" + c3.getcName() + "\t" + c3.getcPhno() + "\t" + c3.getcEmail());
					System.out.println("*******************");
				}
				break;

			case 4:
				if (ITStorage.listofUsers.size() == 0) {
					try {
						throw new Exception();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						System.out.println("List is empty");
						e.printStackTrace();
					}
				}

				else {
					System.out.println("*******************");
					cm.displayAllCustomers();
					System.out.println("*******************");
				}

				break;

			case 5:
				if (ITStorage.listofUsers.size() == 0) {
					try {
						throw new Exception();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						System.out.println("List is empty");
						e.printStackTrace();
					}
				}

				else {
					c4 = new Customer();
					System.out.println("Enter the Customer id you want to update the details");
					c4 = cm.searchCustomer(sc.next());
					System.out.println("\nNow Enter the updated values:\n");
					
					System.out.println("Enter the Name");
					c4.setcName(sc.next());

					System.out.println("Enter the PhNo");
					c4.setcPhno(sc.next());

					System.out.println("Enter the Email");
					c4.setcEmail(sc.next());

					cm.updateCustomer(c4);
				}
				break;
			case 6:
				System.out.println("\nYou are logged out !!!\n");
				System.exit(0);

			default:
				System.out.println("Please, Enter the correct choice !!!!");
				break;
			}
		} while (res);

	}

}
