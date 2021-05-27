package day48_Inheritance;

public class BOA {

    public static void main(String[] args) throws InterruptedException {

        BankAccount acc1 = new BankAccount("sam","Adam");
        acc1.setBalance(20000);
        acc1.setAccountNumber(12345678);
        acc1.setAccountHolder(acc1.firstName+" "+acc1.lastName);

        acc1.Deposite(1000);
        acc1.Withdraw(10000);

        System.out.println(acc1.AvailableBalace());

        acc1.Withdraw(-30000);
    }

}
