package by.htp.oop.task04;

public class BankAccount {

	private int accountId;
	private static int countId = 1;
	private double balance;
	private boolean unlockStatus;

	Customer belongTo;

	BankAccount() {
	}

	BankAccount(Customer customer, double money) {
		balance = money;
		accountId = countId++;

		unlockStatus = true;
		belongTo = customer;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public static int getCountId() {
		return countId;
	}

	public static void setCountId(int countId) {
		BankAccount.countId = countId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean isUnlockStatus() {
		return unlockStatus;
	}

	public void setUnlockStatus(boolean unlockStatus) {
		this.unlockStatus = unlockStatus;
	}

	public Customer getBelongTo() {
		return belongTo;
	}

	public void setBelongTo(Customer belongTo) {
		this.belongTo = belongTo;
	}

	@Override
	public String toString() {
		return "BankAccount [accountId=" + accountId + ", balance=" + balance + ", unlockStatus=" + unlockStatus
				+ ", belongTo=" + belongTo + "]";
	}

	public void changeBalance(double money) {
		if (money >= 0) {
			this.balance += money;
		} else if (money < 0 && money <= this.balance) {
			this.balance += money;
		} else {
			System.out.println("This account does not has this summ, we give you " + this.balance + "BYN.");
			this.balance = 0;
		}
	}

}
