package com.its.User;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Select the following option..");
		System.out.println("\n1.Customer \n2.Product \n3.Logout");
		int n = sc.nextInt();
		switch (n) {
		case 1: {
			
			break;
		}
		case 2: {
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
	}
}


