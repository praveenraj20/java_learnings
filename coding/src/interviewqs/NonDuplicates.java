package interviewqs;
import java.util.HashMap;

public class NonDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,1,2};
        HashMap<Integer,Integer> integerHashMap = new HashMap<>();
        for(int num: arr){
            integerHashMap.put(num,integerHashMap.getOrDefault(num,0)+1);
        }

        for (int num: arr){
            if(integerHashMap.get(num)==1){
                System.out.print(num+ " ");
            }
        }
    }
}
