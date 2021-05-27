/*
package day42;

import java.util.ArrayList;
import java.util.Arrays;

class tester{
    String name;
    char gender;
    long employeeID;
    String jobTitle;
    double salary;

    public void setTesInfo(String name, char gender, long employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.gender = gender;
    }

    public void smokeTesting() {
        System.out.println(name + " smoke testing");
    }

    public void creatingTicket() {
        System.out.println(name + " is creating ticket");
    }

    public String toString() {
        return "Name: " + name + ", Gender: " + gender + ", Job Title: " + jobTitle + ", Salary: " + salary + ", Employee ID: " + employeeID;
    }
}

class developer{
    String name;
    char gender;
    long employeeID;
    String jobTitle;
    double salary;

    public void setDevInfo(String name, char gender, long employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.gender = gender;
    }

    public void coding() {
        System.out.println(name + " is coding");
    }

    public void fixBug() {
        System.out.println(name + " is fixBug");
    }

    public String toString() {
        return "Name: " + name + ", Gender: " + gender + ", Job Title: " + jobTitle + ", Salary: " + salary + ", Employee ID: " + employeeID;
    }
}

class scrumTeam{
    ArrayList<Tester> testers = new ArrayList<>();
    ArrayList<Developer> developers = new ArrayList<>();
    String PO;
    String BA;
    String SM;

    public void setInfo(String PO, String BA, String SM) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
    }

    public void addTester(Tester tester) {
        testers.add(tester);
    }

    public void addTester(Tester[] testers) {
        if (testers.length == 0) {
            return;
        }
        this.testers.addAll(Arrays.asList(testers));
    }

    public void removeTester(long employeeID) { // 007
        testers.removeIf(p -> p.employeeID == employeeID);
        //              each employee id,  == 007
    }

    public void addDeveloper(Developer developer) {
        developers.add(developer);
    }

    public void addDeveloper(Developer[] developers) {
        if (developers.length == 0) { // to check if the array is empty
            return;
        }
        this.developers.addAll(Arrays.asList(developers));
    }

    public void removeDeveloper(long employeeID) {
        developers.removeIf(p -> p.employeeID == employeeID);
    }


    public String toString() {
        return testers.size() + " testers, " + developers.size() + " developers, PO: " + PO + ", BA: " + BA + ", SM: " + SM;
    }
}

class capitalOne{

    public static void main(String[] args) {
        Tester[] testers = {new Tester(), new Tester(), new Tester(), new Tester()};

        testers[0].setTesInfo("Aalia", 'F', 15111L, "Lead Tester", 180000);
        testers[1].setTesInfo("Naz", 'F', 15222L, "Tester", 180000);
        testers[2].setTesInfo("Kalbinur", 'F', 15333L, "Tester", 210000);

        Developer[] developers = {new Developer(), new Developer(), new Developer(),new Developer(),new Developer(),};

        developers[0].setDevInfo("waqar", 'M', 2111L, "Dev Lead", 4500000);
        developers[1].setDevInfo("roza", 'F', 3222L, "Dev", 550000);
        developers[2].setDevInfo("burak", 'M', 43333L, "Dev", 650000);
        developers[3].setDevInfo("Verginia", 'F', 5522L, "Dev", 560000);
        developers[4].setDevInfo("burak", 'M', 43333L, "Dev", 650000);


        ScrumTeam team1 = new ScrumTeam();
        team1.setInfo("Nadir", "Faziz", "Aladin");
        team1.addTester(testers);
        team1.addDeveloper(developers);
        System.out.println(team1);

        System.out.println("=====================================================");

        for (Tester each : team1.testers) {// each: every single testers in the scrum team
            System.out.println(each.name + " $" + each.salary);

        }
        System.out.println("=====================================================");

        for (Tester each : team1.testers) {// each: every single testers in the scrum team
            System.out.println(each.name + " $" + each.salary);

        }
        System.out.println("=====================================================");


        System.out.println("=====================================================");
        System.out.println("=====================================================");
        System.out.println("=====================================================");
        double a = testers[0].salary;
        for (Tester each : team1.testers) {// each: every single testers in the scrum team
            if(each.salary > a) {
                System.out.println(each.name + " : $" + each.salary);
            }
        }

        System.out.println("=====================================================");

        for (Developer each : team1.developers) {
            System.out.println(each.name + " : $" + each.salary);
        }

        System.out.println("=====================================================");

        team1.removeTester(15333);
        team1.removeDeveloper(2111);
        team1.removeDeveloper(43333);
        System.out.println(team1);

        System.out.println("=====================================================");
        Developer dev1 = new Developer();
        dev1.setDevInfo("luisa", 'f', 2113L, "Dev Lead", 500000);

        team1.addDeveloper(dev1);

        System.out.println(team1);


        System.out.println("=====================================================");

        ScrumTeam[] scrumTeams = {team1, new ScrumTeam(), new ScrumTeam()};
        */
/*
        print all developers and testers from scrum team
        find the maximum salary
         *//*


        System.out.println("=====================================================");
    }
}

public class Warmup {

}
*/
