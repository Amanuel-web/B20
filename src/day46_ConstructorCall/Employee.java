package day46_ConstructorCall;

public class Employee {

    String name;
    String jobTitle;
    int ID;
    double salary;

    public Employee (String name){
        this.name = name;
    }
    public Employee (String name,String jobTitle){
        this(name);
        this.jobTitle = jobTitle;
    }
    public Employee (int ID ,String name,String jobTitle){
        this(name ,jobTitle);
        this.ID = ID;
    }
    public Employee (int ID ,String name,String jobTitle,double salary){
        this(ID,name,jobTitle);
        this.salary = salary;
    }


    public String toString() {
        return "Employee:- "+name +"\n jobTitle:- "+ jobTitle + "\n ID=" + ID +"\n salary=" + salary;
    }
}
