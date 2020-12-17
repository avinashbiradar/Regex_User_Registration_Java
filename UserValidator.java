import java.util.Scanner;
import java.util.regex.Pattern;
public class UserValidator {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[]args)
    {
        SelectOption();
    }
    public static void SelectOption(){
        System.out.println("1.FirstName");
        System.out.println("2.LastName");
        System.out.println("Enter option to check");

        int inputOption = scan.nextInt();
        switch (inputOption){
            case 1 : System.out.println("Enter your first name");
                String firstName=scan.next();
                firstNameValidation(firstName);
                break;
            case 2 : System.out.println("Enter your Last name");
                String LastName=scan.next();
                firstNameValidation(LastName);
                break;
            default:
                System.out.println("Enter a valid Option");
        }
    }
    public static void firstNameValidation(String firstName){
        boolean valid = firstName.matches("^[A-Z]{1}[a-z]{2,}$");
        System.out.println("Name: " + firstName + "\nValid: " + valid);
    }
    public static void lastNameValidation(String lastName){
        boolean valid = lastName.matches("^[A-Z]{1}[a-z]{2,}$");
        System.out.println("Name: " + lastName + "\nValid: " + valid);
    }
}