package thread;
class Book extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("update DB");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Num extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class ThreadClass {
    public static void  main(String[] lt){

        Book bk = new Book(); // obj act as the Thread
        Num n = new Num();

        bk.start();
        n.start();
    }
}
