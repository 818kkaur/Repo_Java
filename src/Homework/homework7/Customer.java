package Homework.homework7;

public class Customer {
    String name;
    Accounts account;

    public Customer(String name, String ssn, String accountType, double initialAmount) {
        this.name = name;
        account = new Accounts(ssn, accountType, initialAmount);
    }

    public void openNewAccount(String accountType, double amount) {
        account.openAccount(accountType, amount);
    }

    public void showCustomerAccountNumbers() {
        account.showAccountNumbersForCustomer();
    }

    public void getMiniStatement() {
        System.out.println("\nMini Statement for you\nName: " + name);
        account.showAccountDetails();
    }

    public void depositMoney(double amount, int accountNumber) {
        account.deposit(amount, accountNumber);
    }

}
