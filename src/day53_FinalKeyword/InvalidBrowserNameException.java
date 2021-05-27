package day53_FinalKeyword;

public class InvalidBrowserNameException extends RuntimeException {

       public InvalidBrowserNameException(){

           super("Invalid Browser Name");

       }

       public InvalidBrowserNameException(String str){

           super(str);
           System.out.println("Dumb Ass");

       }

}
class Test2{

    public static void main(String[] aa){

        String name = "chrome";

        switch(name){
            case "FireFox":
                System.out.println("FireFox is Selected");
                break;
            case "chrome":
                System.out.println("chrome is Selected");
                break;
            default :
               throw new InvalidBrowserNameException("Fuck u");
        }



    }

}