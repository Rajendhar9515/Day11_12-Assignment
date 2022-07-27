package com.bridgelabz.stock_management;

import java.util.Scanner;

public class StockAccount {
	static Scanner inputs = new Scanner(System.in);

	// method to ask user to perform actions to make user friendly.
	public void askUser() {
		System.out.println("Enter 1 to enter , 2 to exit :- ");
		int option = inputs.nextInt();

		if (option == 1) {
			System.out.println("Please add stocks in your portfolio .....");
			Stock stock = new Stock();
			stock.enterNumOfStocks(); // calling method to add stocks.

			System.out.println("Displaying stocks .....");
			stock.displayStocks(); // calling method to display stocks.

			valueOf();

			while (option != 4) {
				System.out.println("Enter your option from the list :- " + "1.Buy" + "\n" + "2.Sell" + "\n"
						+ "3.Debit money" + "\n" + "4.Exit");
				int choice = inputs.nextInt();
				switch (choice) {
				case 1:
					System.out.print("Enter the symbol of your stock :- ");
					String symbol = inputs.next();

					System.out.print("Enter the amount you want to spend on this stock :- ");
					int amount = inputs.nextInt();
					buy(amount, symbol);
					Account.getAccount_balance();
					break;
				case 2:
					System.out.print("Enter the symbol of your stock :- ");
					symbol = inputs.next();

					System.out.print("Enter the amount you want to gain on this stock :- ");
					amount = inputs.nextInt();
					sell(amount, symbol);
					Account.getAccount_balance();
					break;
				case 3:
					System.out.print("Enter amount you want to withdraw from your account :- ");
					double debit_balance = inputs.nextDouble();
					Account.debit(debit_balance);
					break;
				default:
					printReport();
					System.out.println("Exited successfully.");
					return;
				}
			}
		} else if (option == 2) {
			printReport();
			System.out.println("Successfully exited.");

		} else {
			System.out.println("Enter valid option");
			askUser();
		}
	}

	// method to return account balance
	public double valueOf() {
		Account balance_check = new Account();
		int balance = balance_check.getAccount_balance();
		return balance;
	}

	// method to buy stocks
	public void buy(int amount, String symbol) {
		boolean flag = false;
		for (StockPortfolio stock : Stock.getStocks()) {
			String symbol_check = stock.getStock_name();

			int share_price_check = stock.getShare_price();

			if (symbol.equals(symbol_check)) {
				flag = true;
				double num_of_shares = amount / share_price_check;
				double debit_balance = num_of_shares * share_price_check;

				// Account passing_debit_obj = new Account();
				Account.debit(debit_balance);

				printReport();

				break;
			} else {
				continue;
			}
		}
		if (flag == false) {
			Stock.addStock();
		}
	}

	// method to sell stocks
	public void sell(int amount, String symbol) {

		for (StockPortfolio stock : Stock.getStocks()) {
			String symbol_check = stock.getStock_name();

			int share_price_check = stock.getShare_price();
			if (symbol.equals(symbol_check)) {
				System.out.println("Stock sold successfully.");
				double num_of_shares = amount / share_price_check;
				double credit_balance = stock.share_price * num_of_shares;

				Account.credit(credit_balance);

				printReport();
			} else {
				continue;
			}
		}
	}

	// print report method to print stocks and value of stocks
	public void printReport() {
		int value = 0;
		for (int i = 0; i < Stock.getStocks().size(); i++) {
			value += Stock.getStocks().get(i).getVal_of_stock();
			System.out.println(Stock.getStocks().get(i));
		}
		System.out.println("Value of all stocks :- " + value);
	}

}
