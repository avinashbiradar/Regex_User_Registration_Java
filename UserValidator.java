import java.util.Scanner;
import java.util.regex.Pattern;
public class UserValidator {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        while(true) {
            SelectOption();
        }
    }
    public static void SelectOption () {
        System.out.println("1.FirstName");
        System.out.println("2.LastName");
        System.out.println("3.Email");
        System.out.println("4.Phone Number ");
        System.out.println("5.password ");
        System.out.println("Enter option to check");
        int inputOption = scan.nextInt();
        switch (inputOption) {
            case 1:
                System.out.println("Enter your first name");
                String firstName = scan.next();
                firstNameValidation(firstName);
                break;
            case 2:
                System.out.println("Enter your Last name");
                String LastName = scan.next();
                firstNameValidation(LastName);
                break;
            case 3:
                System.out.println("Enter your Email");
                String email = scan.next();
                emailValidation(email);
                break;
            case 4:
                System.out.println("Enter your Mobile");
                String mobile = scan.next();
                mobileValidation(mobile);
                break;
            case 5:
                System.out.println("Enter your Password");
                String password = scan.next();
                passwordValidation(password);
                break;
            default:
                System.out.println("Enter a valid Option");
        }
    }
                public static void firstNameValidation (String firstName){
                boolean valid = firstName.matches("^[A-Z]{1}[a-z]{2,}$");
                System.out.println("Name: " + firstName + "\nValid: " + valid);
            }
                public static void lastNameValidation (String lastName){
                boolean valid = lastName.matches("^[A-Z]{1}[a-z]{2,}$");
                System.out.println("Name: " + lastName + "\nValid: " + valid);
            }

                public static void emailValidation (String email){
                boolean valid = email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
                System.out.println("Name: " + email + "\nValid: " + valid);
            }
                public static void mobileValidation (String mobile){
                boolean valid = mobile.matches("^[1-9][0-9]+[ ]{0,1}+[1-9][0-9]{9}$");
                System.out.println("Name: " + mobile + "\nValid: " + valid);
            }
                public static void passwordValidation (String password){
                boolean valid = password.matches("(?=.*[a-z])(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%!]{1}).{8,}");
                System.out.println("Name: " + password + "\nValid: " + valid);
            }


}