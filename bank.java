import java.util.Scanner;

class Account {
    String name;
    int accNo;
    String accType;
    double balance;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter customer name:");
        name = sc.next();
        System.out.println("Enter account number:");
        accNo = sc.nextInt();
        System.out.println("Enter balance:");
        balance = sc.nextDouble();
    }

    void displayBalance() {
        System.out.println("Balance = " + balance);
    }

    void deposit(double amt) {
        balance += amt;
    }

    void withdraw(double amt) {
        balance -= amt;
    }
}

class SavAcct extends Account {
    double rate = 0.05;

    void computeInterest() {
        double interest = balance * rate;
        balance += interest;
        System.out.println("Interest added = " + interest);
    }
}

class CurAcct extends Account {
    double minBalance = 1000;
    double penalty = 100;

    void checkMinBalance() {
        if (balance < minBalance) {
            balance -= penalty;
            System.out.println("Penalty imposed = " + penalty);
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Account Type");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        int ch = sc.nextInt();

        if (ch == 1) {
            SavAcct s = new SavAcct();
            s.accept();

            System.out.println("Enter deposit amount:");
            s.deposit(sc.nextDouble());

            System.out.println("Enter withdrawal amount:");
            s.withdraw(sc.nextDouble());

            s.computeInterest();
            s.displayBalance();
        } else {
            CurAcct c = new CurAcct();
            c.accept();

            System.out.println("Enter deposit amount:");
            c.deposit(sc.nextDouble());

            System.out.println("Enter withdrawal amount:");
            c.withdraw(sc.nextDouble());

            c.checkMinBalance();
            c.displayBalance();
        }
    }
}
