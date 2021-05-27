package day39_CustomClass;

public class Employee {
    String name;
    char gender;
    long SSN;
    String jopTitle;
    double salary;

    public void setEmplooyee(String emplooyeeName, char employeeGender, long employeeSSN, String employeeJopTitle, double employeeSalary){
       name = emplooyeeName;
       gender = employeeGender;
       SSN = employeeSSN;
       jopTitle = employeeJopTitle;
       salary = employeeSalary;
    }

    public void getEmployeeInfo(){
        System.out.println("Name: "+name+", Gender"+gender+", Job Title"+", Salary"+salary);
        String ssn = ""+SSN;
        System.out.println("SSN"+ssn.substring(ssn.length() -3));
    }
}
