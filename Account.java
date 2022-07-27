package com.bridgelabz.stock_management;

import java.util.Scanner;

public class Account {
	// taking user inputs
		static Scanner input = new Scanner(System.in);

		int Account_balance = 0;

		public void debit() {
			System.out.println("Enter how much you want to debit :- ");
			int debit_balance = input.nextInt();

			if (debit_balance <= Account_balance) {
				Account_balance -= debit_balance;
				System.out.println("\n Your total account balance :- " + Account_balance);
			} else {
				System.out.println("OOPS! You dont have enough balance to withdraw.");
			}
		}

		public void credit() {

			System.out.println("Enter how much you want credit :- ");
			int credit_balance = input.nextInt();

			Account_balance += credit_balance;
			System.out.println("\n Your total account balance :- " + Account_balance);

		}
}
