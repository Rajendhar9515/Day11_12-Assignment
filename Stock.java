package com.bridgelabz.stock_management;

import java.util.ArrayList;
import java.util.Scanner;

public class Stock {
	static Scanner input = new Scanner(System.in);
	static ArrayList<StockPortfolio> stocks = new ArrayList<StockPortfolio>(); // creating array list

	// getter and setter methods for arraylist
	public static ArrayList<StockPortfolio> getStocks() {
		return stocks;
	}

	public void setStocks(ArrayList<StockPortfolio> stocks) {
		this.stocks = stocks;
	}

	// method to add stocks in arraylist
	public void enterNumOfStocks() {
		System.out.println("Enter how many stock you want :- ");
		int userChoice = input.nextInt();

		for (int i = 0; i < userChoice; i++) {
			addStock();
		}
	}

	public static void addStock() {
		System.out.println("Enter stock name :- ");
		String stock_name = input.next();

		System.out.println("Enter number of shares :- ");
		int num_of_shares = input.nextInt();

		System.out.println("Enter share price :- ");
		int share_price = input.nextInt();

		int val_of_stock = num_of_shares * share_price;

		StockPortfolio stock_add = new StockPortfolio(stock_name, num_of_shares, share_price, val_of_stock);
		stocks.add(stock_add);

		System.out.println("Stock is added successfully in your portfolio.\n");
	}

	// display method to display stocks
	public void displayStocks() {
		for (StockPortfolio stock : stocks) {
			System.out.println(stock.toString());
		}
		printTotalValueOfStocks();
	}

	// method to print total value stocks(portfolio size)
	public void printTotalValueOfStocks() {
		int total_value_of_stocks = 0;
		for (StockPortfolio stockPortfolio : stocks) {
			total_value_of_stocks += stockPortfolio.getVal_of_stock();
		}
		System.out.println("Total value of stocks :- " + total_value_of_stocks);
	}

	// main method
	public static void main(String[] args) {
		System.out.println("\t WELCOME TO STOCK ACCOUNT MANAGEMENT \n");

		Stock object = new Stock();
		object.enterNumOfStocks();
		object.displayStocks();
	}

}
