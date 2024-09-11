package designPattern;
/**
 SingleTon Design Pattern: it ensures that a class have only one instance (i,e Only one Object)
 **/
public class SingleTon {
    public static void main(String[] args ){
        ABC obj1= ABC.getInstance();
        ABC obj2 =ABC.getInstance();
    }
    static class ABC{
        static ABC obj = new ABC();   // 1. create a static instance
        private ABC (){                 // 2. create a private constructor  
        }
        private static ABC getInstance(){  // 3.create a private method which return the static obj
            System.out.println("single ton Design Pattern");
            return obj;
        }
    }

}
