package day44_constructor;

public class HR {

    static Employee employee1;
    static Employee employee2;
    static Employee employee3;
    static Employee employee4;
    static Employee employee5;

     static {

         employee1 = new Employee();
         employee2 = new Employee();
         employee3 = new Employee();
         employee4 = new Employee();
         employee5 = new Employee();

         employee1.setEmployeeInfo("Muhammed",000001,45678,"SDET",120000,'M');
         employee2.setEmployeeInfo("Euhan",000002,45679,"QA",115000,'M');
         employee3.setEmployeeInfo("Amed",000003,45670,"Instrucetor",99000,'F');
         employee4.setEmployeeInfo("Auha",000004,45671,"SDET",125000,'F');
         employee5.setEmployeeInfo("Ahammed",000005,45672,"Developer",140000,'M');
     }

}

