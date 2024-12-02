package thread;

class Table{
    synchronized void printTable(int n){
        for (int i=1;i<=5;i++){
            System.out.println(i*n);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class SyncronizationThread{
    public static void main(String[] arg) {
        Table tb = new Table();

        Thread t1 = new Thread(){
            public void run(){
                tb.printTable(1);
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                tb.printTable(10);
            }
        };

        t1.start();
        t2.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Bye");
    }
}
