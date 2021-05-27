package day47__Encapsulation;

public class Credentials {
    public String name;
    public int age;
    private String userName;
    private String password;

    public static String companyName = "facebook";

    /*static {
        companyName = "facebook";
    }*/

    public Credentials(String name,int age){

        this.name = name;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
