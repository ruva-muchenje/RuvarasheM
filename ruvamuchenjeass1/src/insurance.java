public class insurance extends Bank {
    // Constructor for insurance class
    public insurance(String accountType, double accountBalance) {
        super(accountType, accountBalance);
    }

    // Method to indicate coverage
    public void cover() {
        System.out.println("You are covered.");
    }
}
