package hackerRank;

import java.util.HashMap;
import java.util.Map;

public class TwoSumTarget {

 //    Output: [0,1]

//    public int[] twoSum(int[] nums, int target){
//        return nums;
//    }
    public static void main(String[] args) {
        TwoSumTarget obj = new TwoSumTarget();

        int[] nums = {1, 2, 3, 4, 5};
        int l = nums.length;
        System.out.println("length " + nums[0]);
        int  target = 5;
//        obj.twoSum(nums,target);
        Map<Integer,Integer> hashMap = new HashMap<>();
        hashMap.put(1,1);
        hashMap.put(2,3);



        for(int i=0; i<l;i++){
            for(int j=1;j<l;j++){
                if(nums[i]+nums[j]==target){
                    System.out.println(nums[i]+"  " +nums[j]);
                }
            }
        }
    }
}
