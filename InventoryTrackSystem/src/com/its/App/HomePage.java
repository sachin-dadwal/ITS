package com.its.App;

import java.util.Scanner;

public class HomePage
{
	
	public static void main(String[] args) {
		
		System.out.println("---Welcome to Inventry Track System---");
		Scanner sc=new Scanner(System.in);
		Add a=new Add();
		do
		{
		System.out.println("\nPlease select the following option\n");
		System.out.println("1.Add \n2.View\n3.Update\n4.Delete\n5.Log Out");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
		{
			a.add();
			break;
		}
		case 2:
		{
			break;
		}
		case 3:
		{
			break;
		}
		case 4:
		{
			break;
		}
		case 5:
		{
			System.out.println("You are logged out");
			System.exit(1);
			break;
		}
		default:
		{
			System.out.println("Please select the correct option and try again !!");
			break;
		}
		}
		}
		while(1>0);
		
	}

}
