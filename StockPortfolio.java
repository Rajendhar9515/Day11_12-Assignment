package com.bridgelabz.stock_management;

public class StockPortfolio {
	// instance variables
		String stock_name;
		int num_of_shares;
		int share_price;

		int val_of_stock;

		// constructor
		public StockPortfolio(String stock_name, int num_of_shares, int share_price, int val_of_stock) {
			this.stock_name = stock_name;
			this.num_of_shares = num_of_shares;
			this.share_price = share_price;
			this.val_of_stock = val_of_stock;
		}

		public String getStock_name() {
			return stock_name;
		}

		public void setStock_name(String stock_name) {
			this.stock_name = stock_name;
		}

		public int getNum_of_shares() {
			return num_of_shares;
		}

		public void setNum_of_shares(int num_of_shares) {
			this.num_of_shares = num_of_shares;
		}

		public int getShare_price() {
			return share_price;
		}

		public void setShare_price(int share_price) {
			this.share_price = share_price;
		}

		public int getVal_of_stock() {
			return val_of_stock;
		}

		public void setVal_of_stock(int val_of_stock) {
			this.val_of_stock = val_of_stock;
		}

		// overriding toString method to return in required format
		@Override
		public String toString() {
			return ("Stock name :- " + getStock_name() + " and number of shares :- " + getNum_of_shares() + "\n"
					+ "          			share price :- " + getShare_price() + "\n"
					+ "          			value of stock :- " + getVal_of_stock());
		}

}
