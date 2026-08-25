import java.util.Scanner;

class Account {
    double balance;

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount deposited Rs = " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount withdrawn Rs = " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void displayBalance() {
        System.out.println("Current balance Rs = " + balance);
    }
}

class Bankingsystem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account acc = new Account();

        System.out.println("Enter deposit amount:");
        double depositAmount = sc.nextDouble();
        acc.deposit(depositAmount);

        System.out.println("Enter withdraw amount:");
        double withdrawAmount = sc.nextDouble();
        acc.withdraw(withdrawAmount);

        acc.displayBalance();

    }
};
