package day49_Inheritance.ScrumTeamTask.task;

import day47__Encapsulation.Test;

import java.util.ArrayList;

public class AppleINC {

    public static void main(String[] args) {

        Tester tester1 = new Tester("sam",30,'M',110_000,10711453,"SDET");
        Tester tester2 = new Tester("sama",40,'M',150_000,10711454,"SDET");
        Tester tester3 = new Tester("san",35,'F',130000,10711455,"SDET");

        Tester[] testers = {tester1,tester2 ,tester3};

        Developer dev1 = new Developer("mas",20,'F',210_000,10711463,"dev") ;
        Developer dev2 = new Developer("masa",30,'F',250_000,10711463,"dev") ;
        Developer dev3= new Developer("man",25,'M',230_000,10711463,"dev") ;

        Developer[] developers = {dev1,dev2 ,dev3 };

        ScrumTeam scrumTeam = new ScrumTeam(testers , developers);

        System.out.println(scrumTeam);

        Tester[] testers2 = {new Tester("Aman",22,'M',150000,77796,"SDET"),
                             new Tester("Amau",25,'F',18000,777798,"Dev")};

        Developer[] developers2 = {new Developer("mas",20,'F',210_000,10711463,"dev") ,
                                   new Developer("san",35,'F',130000,10711455,"SDET") };

        ScrumTeam scrumTeam2 = new ScrumTeam(testers2, developers2);

        System.out.println(scrumTeam2 );

        ScrumTeam[] allScrumTeam = {scrumTeam,scrumTeam2};

        for (ScrumTeam each : allScrumTeam){
            for (Tester p : each.testers1){
                System.out.println(p.name+" "+ p.salary);
            }
        }

    }
}
