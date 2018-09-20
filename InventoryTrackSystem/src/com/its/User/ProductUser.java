package com.its.User;

import java.util.Scanner;

import com.its.App.Product;
import com.its.App.ProductManipulation;


public class ProductUser 
{
	
	MainClass1 t=new MainClass1();
	public static void  P()
	{
	boolean res = true;

	Scanner sc = new Scanner(System.in);
	Product p1, p2, p3, p4;
	
	
	do {
		System.out.println(
				"Please Select the following operation to perform \n\n1.Add\n2.Remove\n3.Search\n4.Display\n5.Update\n6.Logout");
		int i = sc.nextInt();
		ProductManipulation cm = new ProductManipulation();
		switch (i) {
		case 1:

			p1 = new Product();

			System.out.println("Enter a product id");
			p1.setpId(sc.next());

			System.out.println("Enter the Product Name");
			p1.setpName(sc.next());

			System.out.println("Enter the quantity");
			p1.setpQuantity(sc.next());
			
			System.out.println("Enter the Cost of the product");
			p1.setpCost(sc.next());
			cm.addProduct(p1);
			break;

		case 2:

			p1 = new Product();
			System.out.println("Enter the Product id you want to delete:");
			// ct1.setPhNo(sc.nextLong());
			p2 = cm.searchProduct(sc.next());
			cm.removeProduct(p2);

			break;

		case 3:

			p1 = new Product();
			System.out.println("Enter the product id you want to seach the details");

			p3 = cm.searchProduct(sc.next());
			System.out.println("*******************");
			System.out.println("Product Id" + "\t" + "Name" + "\t" + "Quantity "+"\t"+"Cost");
			System.out.println(p3.getpId() + "\t" + p3.getpName() + "\t" + p3.getpQuantity()+"\t"+p3.getpCost());
			System.out.println("*******************");
			break;

		case 4:
			System.out.println("*******************");
			cm.displayAllProducts();
			System.out.println("*******************");

			break;

		case 5:
			p4 = new Product();
			System.out.println("Enter the Product id you want to update the details");
			p4 = cm.searchProduct(sc.next());
			System.out.println("\nNow Enter the updated values:\n");
			System.out.println("Enter the Name");
			p4.setpName(sc.next());

			System.out.println("Enter the Quantity");
			p4.setpQuantity(sc.next());
			
			System.out.println("Enter the cost");
			p4.setpCost(sc.next());
				
			cm.updateProduct(p4);
			break;
		case 6:
			System.out.println("\nYou are logged out !!!\n");
			System.exit(0);
			
		/*case 7:
			MainClass1.main();*/

		default:
			System.out.println("Please, Enter the correct choice !!!!");
			break;
		}
	} while (res);
	

}
}