package day57_Polymorphism.PhoneTask;

public class Phone_Object {

    public static void main(String[] args) {

        iPhone1 iphone = new iPhone1("8+","6.5",1200);

        Sumsung samsung = new Sumsung("S10+","6.5",1100) ;

        Huawei huawei = new Huawei("P8","6.6",150);

        System.out.println(iphone);

        iphone.calling(702728918);

        iphone.faceTiming(702789652);

        Phone1 phone = new iPhone1("11","6.8",1200);//Polymorphism

        Phone1 phone1 = new Sumsung("20","6.9",1200);//Polymorphism

        Phone1[] phone1s = {iphone , samsung , huawei };


    }

}
