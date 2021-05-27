package day40_custom_class_recap;

public class BankAccount {
    String AccountType;
    String AccountHolder;
    String AccountNumber;
    double balance;

    public void setAccountInfo(String clientAccountType,String name,String accnum){
       AccountType = clientAccountType;
       AccountHolder = name;
       AccountNumber = accnum;
    }
    public void getAccountInfo(){
        System.out.println("=====================================");
        System.out.println("Account Holder:- "+AccountHolder);
        System.out.println("Account Number:- "+AccountNumber);
        System.out.println("Balance:- "+balance);
        System.out.println("=====================================");
    }
    public void checkBalance(){
        System.out.println("Availabel Balance:- "+balance);
    }
    public void deposite(double amount) throws InterruptedException {
        System.out.println("Depositing "+amount+" $ To Account Number "+AccountNumber);
         Thread.sleep(3000);
        System.out.println("Successfully Added "+amount+"Amount");
        balance += amount;
    }
    public void withdrawal(double amount) throws InterruptedException {
        if (amount >= balance) {
            System.out.println("Not enough Amount");
            balance -= 50;
            System.out.println("U have been penalized for trying to withdraw not enough amount");
            return;
        }else {
            System.out.println("Depositing " + amount + " $ To Account Number " + AccountNumber);
            Thread.sleep(3000);
            System.out.println("Successfully Withdraw " + amount + "Amount");
            balance -= amount;
        }
    }
}
