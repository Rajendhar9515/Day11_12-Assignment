package com.bridgelabz.stock_management;

import java.util.Scanner;

public class Stock_main_method {
	// main method.
	public static void main(String[] args) {
		System.out.println("\t WELCOME TO STOCK ACCOUNT MANAGEMENT \n");

		Scanner input = new Scanner(System.in);

		// credit balance into account.
		System.out.print("Enter amount to credit in your account :- ");
		double credit_balance = input.nextInt();
		Account.credit(credit_balance);

		StockAccount object = new StockAccount();
		object.askUser();
	}

}
