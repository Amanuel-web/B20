package day48_Inheritance;

public class BankAccount {

    public static String bankName;
    public String firstName;
    public String lastName;
    private String accountHolder;
    private int accountNumber;
    private double balance;

    static {
        bankName = "Bank of America";
    }

    public BankAccount(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void Deposite(double amount) throws InterruptedException {
        System.out.println("Depositing $"+amount);
        Thread.sleep(2000);
        balance += amount;
    }

    public void Withdraw(double amount) throws InterruptedException {
        if(amount <=0){
            System.out.println("Enter Enough Money");
            return;
        }
        if(balance < amount){
            System.out.println("Not Enough Balance");
            return;
        }else {
            System.out.println("Withdrawing $"+amount);
            Thread.sleep(2000);
            balance -= amount;
        }
    }

    public double AvailableBalace(){
        return getBalance();//System.out.println("Your Remaining Balance is"+balance);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", accountNumber=" + accountNumber +"Bank Name"+bankName+
                '}';
    }
}
