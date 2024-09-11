package javaEightFeatures;

interface Phone{
    void call();

    static  void show(){
        System.out.println("java_8 allow you to use static methods in Interface ");
    }
    default void message(){
        System.out.println("java_8 also allow you to implement the interface by Default Methods");
    }
}
class AndroidPhone implements Phone{
    @Override
    public void call() {
        System.out.println("Calling the Interface..!");
    }
}
public class DefaultMethodInInterface {
    public static void main(String[] args){
        Phone obj = new AndroidPhone();
        obj.call();
        obj.message();
        Phone.show();   // for Static method no need to create Obj


    }
}
