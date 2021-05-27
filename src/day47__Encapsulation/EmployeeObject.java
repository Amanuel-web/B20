package day47__Encapsulation;

public class EmployeeObject {


    public static void main(String[] args) {

        EmployeeInfo employee1 = new EmployeeInfo("sam", 43, "SDET");
           employee1.setAddress("vegas");
           employee1.setSalary(213244);
           employee1.setID(1234567);

        System.out.println(employee1.getSalary());
        System.out.println(employee1.companyName);
        System.out.println(employee1);


    }
}
