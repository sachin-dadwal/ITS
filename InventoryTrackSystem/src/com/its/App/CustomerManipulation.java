package com.its.App;

import com.its.Storage.ITStorage;

public class CustomerManipulation
{
	public boolean addCustomer(Customer c1)
	{
		
		return ITStorage.listofUsers.add(c1);
		
	}
	public boolean removeCustomer(Customer c1) {
			// System.out.println("Removed");
			return ITStorage.listofUsers.remove(c1);

		}

		public boolean updateCustomer(Customer c1) {
			//System.out.println("Updated");
			return ITStorage.listofUsers.add(c1);
		}

		public Customer searchCustomer(String id) {
			Customer c = null;
			for (Customer c1 : ITStorage.listofUsers) {
				if (c1.getcId() == id) {
					c = c1;
					break;
				}
			}
			//System.out.println("Searched");
			return c;
		}

		public void displayAllCustomers() {
			System.out.println("-----------------------------------------------------");
			System.out.println("Customer id"+"\t"+"Name" + "\t" + "Mobile" + "\t" + "Email ");

			for (Customer c1 : ITStorage.listofUsers) {
				System.out.println(c1.getcId()+"\t"+c1.getcName() + "\t" + c1.getcPhno() + "\t" + c1.getcEmail());
			}
			System.out.println("-----------------------------------------------------");
		}


}
