package day40_custom_class_recap;

public class Offer {
    double salary;
    String state;
    boolean hasPTO;
    boolean isFullTime;
    boolean isWFH;
    String jopTitle;
    boolean hasBoolean;
    public void setSalaryOfferInfo(double salary,String state,boolean hasPTO,boolean isFullTime,boolean isWFH,String jopTitle,boolean hasBoolean){
        this.salary = salary;
        this.state = state;
        this.hasPTO = hasPTO;
        this.isFullTime = isFullTime;
        this.isWFH = isWFH;
        this.jopTitle = jopTitle;
        this.hasBoolean = hasBoolean;
    }
    public void getSalaryOfferInfo(){
        System.out.println("===========================================================================================");
        System.out.println("Salary:- "+salary+"                                                                       =");
        System.out.println("State:- "+state+"                                                                         =");
        System.out.println("Jop Title:- "+jopTitle+"                                                                  =" );
        System.out.println("===========================================================================================");
    }

}
