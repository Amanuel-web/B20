package day47__Encapsulation;

public class EmployeeInfo {
    public String employeeName;
    public int employeeAge;
    public String jopTitle;
    private int ID;
    private int salary;
    private String address;


    public static String companyName ;

    public EmployeeInfo(String employeeName , int employeeAge,String jopTitle){

        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.jopTitle = jopTitle;

    }
    static {companyName = "Capital One";}

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString(){
        return "Name:- "+employeeName +"\nAge:- "+employeeAge +"\nJop Title:-"+jopTitle+"\nID:- "+getID();
    }
}
