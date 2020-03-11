package by.htp.oop.task04;

public class BankAction {

	public static void createAccount(Bank bank, Customer customer, double money) {

		for (int i = 0; i < bank.accounts.length; i++) {
			if (bank.accounts[i] == null) {
				bank.accounts[i] = new BankAccount(customer, money);
				break;
			} 
		}
	}

	public static void changeBalance(double money) {

		BankAccount account = new BankAccount();
		double bal = account.getBalance();
		if (money >= 0) {
			bal += money;
		} else if (money < 0 && money <= bal) {
			bal += money;
		} else {
			System.out.println("This account does not has this summ, we give you " + bal + "BYN.");
			bal = 0;
		}
	}

	public static void changeAccountBalance(Bank bank, Customer customer, int id, double money) {

		for (int i = 0; i < bank.accounts.length; i++) {
			if (bank.accounts[i] != null && bank.accounts[i].getBelongTo() == customer
					&& bank.accounts[i].getAccountId() == id) {
				if (bank.accounts[i].isUnlockStatus()) {
					if (money <= customer.getHasMoney()) {
						bank.accounts[i].changeBalance(money);
						bank.accounts[i].getBalance();
						System.out.println(bank.accounts[i]);

						break;
					} else {
						money = customer.getHasMoney();
						bank.accounts[i].changeBalance(money);

						System.out.println("not enought money, add " + money);
						break;
					}
				} else {
					System.out.format("\nAccount id#%d is blocked.\n", id);
					money = 0;
					break;
				}
			}
		}

	}

	public static void setAccountStatus(Bank bank, int id, boolean unlock) {
		boolean isFind = false;
		for (int i = 0; i < bank.accounts.length; i++) {
			if (bank.accounts[i] != null && bank.accounts[i].getAccountId() == id) {
				bank.accounts[i].isUnlockStatus();
				isFind = true;
				break;
			}
		}

		if (!isFind) {
			System.out.format("\nlock: Account id#%d didn't find\n", id);
		}
	}

	public static BankAccount[] showAccounts(Bank bank, Customer customer) {
		int countCustomerAccounts = 0;
		for (int i = 0; i < bank.accounts.length; i++) {
			if (bank.accounts[i] != null && bank.accounts[i].getBelongTo() == customer) {
				countCustomerAccounts++;
			}
		}

		BankAccount[] customerAccounts = new BankAccount[countCustomerAccounts];
		for (int i = 0, j = 0; i < bank.accounts.length; i++) {
			if (bank.accounts[i] != null && bank.accounts[i].getBelongTo() == customer) {
				customerAccounts[j] = bank.accounts[i];
				j++;
			}
		}

		return customerAccounts;
	}

	public static void sortByBalance(Bank bank, Customer customer) {
		BankAccount[] sorted = new BankAccount[showAccounts(bank, customer).length];
		for (int i = 0; i < showAccounts(bank, customer).length; i++) {
			sorted[i] = showAccounts(bank, customer)[i];
		}

		for (int i = 1; i < sorted.length; i++) {
			if (sorted[i - 1].getBalance() < sorted[i].getBalance()) {
				BankAccount forChange = sorted[i];
				sorted[i] = sorted[i - 1];
				sorted[i - 1] = forChange;

				if (i > 1) {
					i -= 2;
				} else {
					i--;
				}
			}
		}

		for (BankAccount el : sorted) {
			System.out.format("Account id#%d ; Customer: %s %s; is unlock : %s; balance: %.2f;%n", el.getAccountId(),
					el.getBelongTo().getFirstName(), el.getBelongTo().getLastName(), el.isUnlockStatus(),
					el.getBalance());
		}
	}

	public static void showSummOfAllAccounts(Bank bank, Customer customer) {
		double balance = 0;
		for (int i = 0; i < showAccounts(bank, customer).length; i++) {
			balance += showAccounts(bank, customer)[i].getBalance();
		}
		System.out.format("Customer %s %s has %.2f BYN in all accounts.%n", customer.getFirstName(),
				customer.getLastName(), balance);
	}

	public static void showSummOfAllAccountsPositiv(Bank bank, Customer customer) {
		double balance = 0;
		for (int i = 0; i < showAccounts(bank, customer).length; i++) {
			if (showAccounts(bank, customer)[i].getBalance() >= 0) {
				balance += showAccounts(bank, customer)[i].getBalance();
			}
		}
		System.out.format("Customer %s %s has %.2f BYN in all accounts.%n", customer.getFirstName(),
				customer.getLastName(), balance);
	}

	public static void showSummOfAllAccountsNegotiv(Bank bank, Customer customer) {
		double balance = 0;
		for (int i = 0; i < showAccounts(bank, customer).length; i++) {
			if (showAccounts(bank, customer)[i].getBalance() < 0) {
				balance += showAccounts(bank, customer)[i].getBalance();
			}
		}
		System.out.format("Customer %s %s has %.2f BYN in all accounts.%n", customer.getFirstName(),
				customer.getLastName(), balance);
	}

}
