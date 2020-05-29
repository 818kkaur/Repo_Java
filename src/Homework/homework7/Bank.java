package Homework.homework7;

public class Bank {
    public static void main(String[] args) {


        Customer c1 = new Customer("dd", "1234", "saving", 1111);
        c1.openNewAccount("checking" , 2222);
        c1.getMiniStatement();
        c1.depositMoney(10110, 1001);
        c1.getMiniStatement();

    }
}
