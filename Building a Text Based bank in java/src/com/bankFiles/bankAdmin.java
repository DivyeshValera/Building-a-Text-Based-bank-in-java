package com.bankFiles;

import java.util.Scanner;

public class bankAdmin {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sentinal = 0;
		int size = 0;
		double[] accountBalences = new double[250];
		String[] accountNames = new String[250];
		for(;true;){
			System.out.println("Bank Admin Menu");
			System.out.println("Please Enter a Menu Option");
			System.out.println("(1): Add Customer to Bank");
			System.out.println("(2): Change Customer Name");
			System.out.println("(3): Check Account Balence");
			System.out.println("(4): Modify Account Balence");
			System.out.println("(5): Summary of All Accounts");
			System.out.println("(0): Quit");
			
			int userInput = input.nextInt();
			switch (String.valueOf(userInput)) {
			case "1":	
				System.out.println("Bank Add Customer Menu");
				System.out.println("Please Enter an account balence");
				double balence = input.nextDouble();
				accountBalences[size] = balence;
				System.out.println("Please enter an account holder name: ");
				input.nextLine();
				String name = input.nextLine();
				accountNames[size] = name;
				System.out.println("Customer's ID is :" + size);
				size++;
				break;
			case "2":
				System.out.println("Bank Change Name Menu");
				System.out.println("Please Enter a customer ID to change their name");
				int index = input.nextInt();
				System.out.println("What is the customer's new name?");
				input.nextLine();
				accountNames[index] = input.nextLine();
				break;
			case "3":	
				System.out.println("Bank Check Balence Menu");
				System.out.println("Please Enter a customer ID to check their balence");
				int checkindex = input.nextInt();
				double checkbalence = accountBalences[checkindex];
				System.out.println("This customer has $" + checkbalence + " in their account");
				break;
			case "4":
				System.out.println("Bank Modify Balence Menu");
				System.out.println("Please Enter a customer ID to check their balence");
				int Mindex = input.nextInt();
				System.out.println("What is the customer's new account balence");
				accountBalences[Mindex] = input.nextDouble();
				break;
			case "5":	
				System.out.println("Bank All Customer Summary Menu");
				double total = 0;
				for(int i = 0; i < size; i++){
					total = total + accountBalences[i];
					System.out.println(accountNames[i] + " has $" + accountBalences[i] + " in their account");
				}
				System.out.println("Total $"+total+ "available in the bank");
				break;
			case "0":	
				System.out.println("Quit");
				System.exit(0);
				break;
			default:
				System.out.println("ERROR:Invalid Input");
				break;
			}
	}
	}
}
