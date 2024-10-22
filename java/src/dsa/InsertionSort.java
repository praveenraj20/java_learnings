package dsa;

public class InsertionSort {
    public static void main(String[] args){
        int[] arr = {3,6,2,1,4};
        int size = arr.length;

        for(int i=1;i<size;i++){
            int key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j]>key){
                arr[j+1] =arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        for(int num: arr){
            System.out.print(num+ " ");
        }
    }
}
