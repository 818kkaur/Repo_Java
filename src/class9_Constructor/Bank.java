package class9_Constructor;

public class Bank {
    public static void main(String[] args) {

        Accounts A1 = new Accounts("AB","109","savings");
        Accounts A2 = new Accounts("ABc","10912","savings");
A1.deposit(1234);
A1.withdraw(50);
A1.miniStatement();
A2.miniStatement();

    }
}
