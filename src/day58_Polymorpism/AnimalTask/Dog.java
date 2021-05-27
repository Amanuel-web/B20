package day58_Polymorpism.AnimalTask;

public class Dog extends Animal {

    public String DogName;

    public Dog (String DogName,int age, char gender) {
        super(age, gender);
        this.DogName = DogName;

    }

    @Override
    public void eat(){

        System.out.println("Dog eating");

    }

    @Override
    public void sleep(){

        System.out.println("Dog sleeping");

    }

    public void bark(){
        System.out.println(DogName + " is barking");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + DogName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

}
