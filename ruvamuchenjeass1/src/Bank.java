
    public class Bank {
        private final String accountType;
        private double accountBalance;

        // Parameterized constructor
        public Bank(String accountType, double accountBalance) {
            this.accountType = accountType;
            this.accountBalance = accountBalance;
        }

        // Method to deposit money
        public double deposit(double amount) {
            accountBalance += amount;
            return accountBalance;
        }

        // Method to withdraw money
        public double withdrawal(double amount) {
            if (amount <= accountBalance) {
                accountBalance -= amount;
                double newBalance = withdrawal(500.00);
                System.out.println("New balance: " + newBalance);
            } else {
                System.out.println("Insufficient balance.");
            }
            return accountBalance;

        }

        // Method to display account information
        public void display() {
            System.out.println("The account type is " + accountType + " and the balance is " + accountBalance);
        }
    }

