package gfg;
public class PowerOfNumber {
    public static void main(String[] args) {
        int number  = 3;
        int pwr = 2;
        int n = number ;
        int temp;
        for(int i=1;i<pwr;i++){
            temp = n*number;
            n=temp;
        }
        System.out.println(n);
    }
}
