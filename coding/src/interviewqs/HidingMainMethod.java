package interviewqs;

/**
 * we cant override the Main method, but we can hide the main method
 **/
public class HidingMainMethod {
    public static void main(String[] args) {
        System.out.println("Parent");

    }
}

class Child extends HidingMainMethod {
    public static void main(String[] args) {
        System.out.println(" Child ");

    }
}