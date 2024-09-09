import exeption.WrongLoginException;
import exeption.WrongPasswordException;
import service.ValidationService;

import static service.ValidationService.validate;

public class Main {

    public static void main(String[] args) {
        try {

            System.out.println("Hello world!");
            validate("G_12323", "55566666333", "55566666333");
            System.out.println("Conformity");
        } catch (WrongPasswordException a) {
            System.out.println("Not conformity password");
        } catch (WrongLoginException b) {
            System.out.println(" Not conformity login");
        }

    }
}