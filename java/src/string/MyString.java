package string;
public class MyString {
    public static void main(String[] args ) {

        //String Object
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        if(s1==s2){
            System.out.println("Objects are same");
        }else {
            System.out.println("Objects are not same");
        }

        //String Literals
        String s3 = "Hello";
        String s4 = "Hello";
        if(s3==s4){
            System.out.println("Object are same ");
        }else {
            System.out.println("Object are not same ");
        }

        System.out.println(s1 == s2);
        System.out.println(s3 == s4);
        System.out.println(s1 == s3);       // will check the reference of the obj
        System.out.println(s1.equals(s3));  // will check the content

    }
}
