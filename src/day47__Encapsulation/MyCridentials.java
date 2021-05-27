package day47__Encapsulation;

public class MyCridentials {

    public static void main(String[] args) {

        Credentials obj1 = new Credentials("same",43);

        obj1.setUserName("bangkok");
        obj1.setPassword("bank1234kok");

        System.out.println(obj1.getUserName() +" & "+ obj1.getPassword());

        System.out.println(obj1.name +" & "+ obj1.age);

        System.out.println(Credentials.companyName);

    }

}
