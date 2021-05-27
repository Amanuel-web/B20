package day40_custom_class_recap;

public class Bank {
    public static void main(String[] args) throws InterruptedException {
        BankAccount Aamu = new BankAccount();
        Aamu.setAccountInfo("Saving","Aamu gma","123456");

        Aamu.getAccountInfo();
        System.out.println("============================");
        Aamu.deposite(10000);
        System.out.println("============================");
        Aamu.checkBalance();
        System.out.println("============================");
        Aamu.withdrawal(5000);
        System.out.println("+===========================");
        Aamu.checkBalance();
        System.out.println("============================");
        Aamu.withdrawal(20000);
        System.out.println("============================");
        Aamu.checkBalance();
    }
}
