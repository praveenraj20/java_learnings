package ExceptionTest;


/**
 Throws -> method level exception/checked exception , will throw the exception to caller method or JVM
 **/
public class ThrowsExample {

    public static  void main(String[] args ) throws InterruptedException {

        // error print
        Integer i = 12;
        try {
            System.out.println(i/0);

        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println(e);
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }

        // throws
        doStuff();
    }
    public static void  doStuff() throws InterruptedException {
        doMoreStuff();

    }
    public  static void doMoreStuff() throws InterruptedException {
        System.out.println("Throws");
        Thread.sleep(3000);
        System.out.println("Throws");

    }


}
