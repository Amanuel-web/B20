package day46_ConstructorCall;

public class EmployeeObj {

    public static void main(String[] args) {
        Employee employee1 = new Employee("cnuk");

        System.out.println(employee1);

        System.out.println("============");

        Employee employee2 = new Employee("Sema","QA");

        System.out.println(employee2 );

        System.out.println("============================");

        Employee employee3 = new Employee(12345,"uu","SDET");

        System.out.println(employee3);

        System.out.println("=============================");

        Employee employee4 = new Employee(123456,"Alex","SDET",123456);

        System.out.println(employee4);

    }

}
