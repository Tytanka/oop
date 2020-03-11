package by.htp.oop.task04;

import java.util.Arrays;

public class Bank {
	private String bankName;

	BankAccount[] accounts = new BankAccount[10];

	Bank() {
	}

	Bank(String bankName) {
		this.bankName = bankName;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public BankAccount[] getAccounts() {
		return accounts;
	}

	public void setAccounts(BankAccount[] accounts) {
		this.accounts = accounts;
	}

	@Override
	public String toString() {
		return "Bank [bankName=" + bankName + ", accounts=" + Arrays.toString(accounts) + "]";
	}

}
