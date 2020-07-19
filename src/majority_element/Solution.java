package majority_element;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;


public class Solution {
    public static void main(String args[]){
        Solution solution= new Solution();
        System.out.println(solution.majorityElement(new int []{2,2,1,1,1,2,2}));
    }

    public int majorityElement(int[] nums) {


        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            int chk = 0;
            if (!map.containsKey(nums[i])){
                map.put(nums[i],1);
                chk = 1;
            }
            else {
                chk = map.get(nums[i])+1;
                map.put(nums[i],chk);
            }
            if (chk > nums.length/2){
                return nums[i];
            }
        }
        return 0;
    }
}
