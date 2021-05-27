package day49_Inheritance.ScrumTeamTask.task;

import day47__Encapsulation.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    ArrayList<Tester> testers1 = new ArrayList<>();
    ArrayList<Developer> developers1 = new ArrayList<>();

    public ScrumTeam(Tester[] testers,Developer[] developers){
        addTester2(testers);
        addDeveloper2(developers);
    }

    public void addTesters1(Tester tester){
        testers1.add(tester);
    }

    public void addDeveloper(Developer developer){
        developers1.add(developer);
    }

    public void addTester2(Tester[] test){
        testers1.addAll(Arrays.asList(test));
    }

    public void addDeveloper2(Developer[] dev){
        developers1.addAll(Arrays.asList(dev));
    }

    public void removeTester(int ID){
        testers1.removeIf(p-> p.ID == ID);
    }

    public void removeDeveloper(int ID){
        developers1.removeIf(p-> p.ID == ID);
    }

    public void removeTesterDeveloper(int TestID,int DevID){
        removeTester(TestID);
        removeDeveloper(DevID);
    }

    @Override
    public String toString() {
        return "********************-> ScrumTeam <-***********************" +"\nTesters=" + testers1.size()+"\nDevelopers=" + developers1.size();
    }
}
