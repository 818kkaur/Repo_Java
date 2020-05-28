package class9_Constructor;

public class Accounts {
        static int accNum = 1000;
        double balance;
        String name;
        String type;
        String routingNumber = "12345";
        String ssn;
        int userAccNum;

        public Accounts(String name, String ssn, String type) {
            this.name = name;
            this.ssn = ssn;
            this.type = type;
           userAccNum = ++accNum;
        }


        //deposit
        public double deposit(double amount) {
            if (amount > 0) {
                balance+=amount;    //  bal = bal + amount
            } else {
                System.out.println("Invalid amount to deposit -> " + amount);
            }
            return balance;
        }
        //withdraw
        // withdraw(10)
        public double withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance-=amount;    //  bal = bal - amount
            } else {
                System.out.println("Invalid amount to withdraw -> " + amount);
            }
            return balance;
        }

        //checkBalance
        public void miniStatement() {
            System.out.println("Name: " + name +
                    "\nAccount Num: " + userAccNum +
                    "\nBalance: " + balance);
        }


    }
