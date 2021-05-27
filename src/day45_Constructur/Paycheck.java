package day45_Constructur;

public class Paycheck {

    public static void main(String[] args) {

        SalaryCalculator obj1 = new SalaryCalculator(55,40,0.09,0.24);

        System.out.println(obj1.Salary());
        System.out.println(obj1.AfterTax());
        System.out.println("Total Tax:- "+ (obj1.Salary() - obj1.AfterTax() ));

        System.out.println(obj1);

    }

}
