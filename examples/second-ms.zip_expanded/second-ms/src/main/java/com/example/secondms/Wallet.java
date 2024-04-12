package com.example.secondms;

public class Wallet {
	private String walletName;
	private Account account;
	private double defaultBalance;
	private double maxAmountToSpend;
	
	public Wallet(String walletName, Account account, double defaultBalance, double maxAmountToSpend) {
		super();
		this.walletName = walletName;
		this.account = account;
		this.defaultBalance = defaultBalance;
		this.maxAmountToSpend = maxAmountToSpend;
	}

	public Wallet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getWalletName() {
		return walletName;
	}

	public void setWalletName(String walletName) {
		this.walletName = walletName;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public double getDefaultBalance() {
		return defaultBalance;
	}

	public void setDefaultBalance(double defaultBalance) {
		this.defaultBalance = defaultBalance;
	}

	public double getMaxAmountToSpend() {
		return maxAmountToSpend;
	}

	public void setMaxAmountToSpend(double maxAmountToSpend) {
		this.maxAmountToSpend = maxAmountToSpend;
	}
	
	
}
