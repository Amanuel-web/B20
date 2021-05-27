package day41_toString_Practice;

public class Developer {
    String name;
    double salary;
    String gender;
    int age;

    public void setInfo(String name, double salary, String gender,int age ){
        this.name = name;
        this.salary = salary;
        this.gender = gender;
        this.age = age;
    }

    public void coding(){
        System.out.println(name+"is coding");
    }
    public void fixBugs(){
        System.out.println(name+"is crying");
    }
    public String toString(){
        return "Name:- "+name+"SEX:- "+gender+" Salary:- "+salary+" Age:- "+age;
    }
}
class DeveObj{
    public static void main (String[] a) throws InterruptedException {
        Developer[] developers = {new Developer(),new Developer(),new Developer(),new Developer(),new Developer(),};

        developers[0].setInfo("Ahmet",125000,"male",30);
        developers[1].setInfo("Erfan",150000,"male",26);
        developers[2].setInfo("Arpat",150000,"male",27);
        developers[3].setInfo("Ajit",120000,"male",30);
        developers[4].setInfo("Massio",180000,"male",36);

        for (Developer each : developers){
            each.coding();
            Thread.sleep(300);
            System.out.println("Loading.......");
            Thread.sleep(3000);

        }
    }
}
