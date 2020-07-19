package remove_duplicate_from_sorted_array;

import java.util.Arrays;

public class Solution {

    public static void main(String args[]){
        System.out.println(new Solution().eliminateDuplicate(new int[]{-3,-1,-1,0,0,0,0,0,2}));
    }

    public int eliminateDuplicate(int [] nums){

        if (nums.length != 0){
            int length =0;
            int lastElement = nums[nums.length-1];

            for (int i=1;i<nums.length;i++){
                if (nums[i]== nums[i-1]){
                    nums[i-1] = 0 * nums[i-1] + lastElement;
                    length++;

                }
            }
            Arrays.sort(nums);
            for (int i=0;i<nums.length;i++){
                System.out.print(nums[i] + " " );
            }
            System.out.println(  " " );
            return nums.length-length;
        }
        return 0;
    }
}
