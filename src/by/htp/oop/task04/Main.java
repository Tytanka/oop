package by.htp.oop.task04;

/*
 * 4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность
 *  блокировки/разблокировки счета. Реализовать поиск и сортировку счетов.
 *   Вычисление общей суммы по счетам. Вычисление суммы по всем счетам, имеющим положительный 
 *   и отрицательный балансы отдельно. 
 */

public class Main {

	public static void main(String[] args) {
		Customer ivanov = new Customer("Ivanov", "Ivan", 1550.5);
		System.out.println(ivanov);

		Bank prior = new Bank("Priorbank");

		BankAction.createAccount(prior, ivanov, 500.5);
		BankAction.createAccount(prior, ivanov, 100);
		BankAction.createAccount(prior, ivanov, 300);

		for (BankAccount el : BankAction.showAccounts(prior, ivanov)) {
			System.out.format("Account id#%d ; Customer: %s %s; is unlock : %s; balance: %.2f;%n", el.getAccountId(),
					el.getBelongTo().getFirstName(), el.getBelongTo().getLastName(), el.isUnlockStatus(),
					el.getBalance());
		}

		Customer sidorov = new Customer("Sidorov", "Sidor", 1200);
		BankAction.createAccount(prior, sidorov, 300);
		for (BankAccount el : BankAction.showAccounts(prior, sidorov)) {
			System.out.format("Account id#%d ; Customer: %s %s; is unlock : %s; balance: %.2f;%n", el.getAccountId(),
					el.getBelongTo().getFirstName(), el.getBelongTo().getLastName(), el.isUnlockStatus(),
					el.getBalance());
		}
		System.out.println("-----changeAccountBalance------");
		BankAction.changeAccountBalance(prior, ivanov, 1, -700);
		for (BankAccount el : BankAction.showAccounts(prior, ivanov)) {
			System.out.format("Account id#%d ; Customer: %s %s; is unlock : %s; balance: %.2f;%n", el.getAccountId(),
					el.getBelongTo().getFirstName(), el.getBelongTo().getLastName(), el.isUnlockStatus(),
					el.getBalance());
		}

		System.out.println("-----sortByBalance------");
		BankAction.sortByBalance(prior, ivanov);

		System.out.println("-----showSummOfAllAccounts------");
		BankAction.showSummOfAllAccounts(prior, ivanov);
		for (BankAccount el : BankAction.showAccounts(prior, ivanov)) {
			System.out.format("Account id#%d ; Customer: %s %s; is unlock : %s; balance: %.2f;%n", el.getAccountId(),
					el.getBelongTo().getFirstName(), el.getBelongTo().getLastName(), el.isUnlockStatus(),
					el.getBalance());
		}
		System.out.println("-----showSummOfAllAccountsPositiv------");
		BankAction.showSummOfAllAccountsPositiv(prior, ivanov);

		System.out.println("-----showSummOfAllAccountsNegotiv------");
		BankAction.showSummOfAllAccountsNegotiv(prior, ivanov);

	}
}
