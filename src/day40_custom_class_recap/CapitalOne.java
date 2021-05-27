package day40_custom_class_recap;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {
    public static void main(String[] args) throws InterruptedException {
        BankAccount noma = new BankAccount();
        BankAccount koman = new BankAccount();
        BankAccount doma = new BankAccount();
        BankAccount coma = new BankAccount();
        BankAccount poma = new BankAccount();

       noma.setAccountInfo("Checking","Noma Uma","100079861");
       koman.setAccountInfo("Checking","Koman Aman","100079862");
       doma.setAccountInfo("Checking","Doma Sma","100079863");
       coma.setAccountInfo("Checking","Coma Mama","100079864");
       poma.setAccountInfo("Checking","Poma ema","100079865");
        ArrayList<BankAccount> account = new ArrayList<>();
        account.addAll(Arrays.asList(noma,koman,doma,coma,poma));

        for(BankAccount each : account) {
            each.deposite(500);
             each.getAccountInfo();

        }

        account.get(3).deposite(10000);
        account.get(3).checkBalance();
        account.get(3).withdrawal(9000);
        account.get(3).checkBalance();

        account.get(4).deposite(600);
        account.get(4).checkBalance();
        System.out.println("********************************************************************************************");

        account.removeIf(each -> each.balance < 1000);

        for(BankAccount each: account ){
            each.getAccountInfo();
        }
    }
}
