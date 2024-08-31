import service.ValidationService;

import static service.ValidationService.validate;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        validate("G_12323", "55566666333", "55566666333");
        System.out.println("Conform");
    }

}