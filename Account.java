package com.bridgelabz.stock_management;

import java.util.Scanner;

public class Account {
	static Scanner input = new Scanner(System.in);

	static int Account_balance = 0;

	// debit method
	public static void debit(double debit_balance) {

		if (debit_balance <= Account_balance) {
			Account_balance -= debit_balance;
			System.out.println("\n Your total account balance :- " + Account_balance);
		} else {
			System.out.println("OOPS! You dont have enough balance to withdraw.");
		}
	}

	// credit method
	public static void credit(double credit_balance) {

		Account_balance += credit_balance;
		System.out.println("\n Your total account balance :- " + Account_balance);

	}

	public static int getAccount_balance() {
		System.out.println("Account balance :- " + Account_balance);
		return Account_balance;
	}

	public static void setAccount_balance(int account_balance) {
		Account_balance = account_balance;
	}
}
