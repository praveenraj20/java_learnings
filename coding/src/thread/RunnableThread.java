package thread;
//class X implements  Runnable{
//    public void run(){
//        for (int i= 0;i<=10;i++){
//            System.out.println("Hi");
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}

class Y implements Runnable {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class RunnableThread {
    public static void main(String[] a) {
        Runnable obj1 = () -> {
            {
                for (int i = 0; i <= 5; i++) {
                    System.out.println("Hi");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        };
        Runnable obj2 = new Y();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

    }
}
