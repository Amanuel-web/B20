package day45_Constructur;

public class SalaryCalculator {

    double hourlyRate;
    int weeklyHour;
    double stateTaxRate;
    double federalTaxRate;

    public SalaryCalculator(double houtlyRate, int weeklyHour, double stateTaxRate, double federalTaxRate) {
        this.hourlyRate = houtlyRate;
        this.weeklyHour = weeklyHour;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
    }

    public double Salary(){
        return (hourlyRate * weeklyHour) * 48;
    }

    public double StateTax(){
        return Salary() * stateTaxRate;
    }

    public double FederalTax(){
        return Salary() * federalTaxRate;
    }

    public double AfterTax(){
        return Salary() - StateTax() - FederalTax();
    }

    public String toString() {
        return "Salary:- "+Salary()+"\nState tax:- "+StateTax()+"\nFederal Tax Rate:- " + federalTaxRate+"\nSalary After Tax:- "+AfterTax();
    }

}
