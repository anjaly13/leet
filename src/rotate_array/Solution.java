package rotate_array;

import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String args[]){
        Solution solution= new Solution();
        solution.rotate(new int []{1,2,3,4,5,6,7},21);
//        for (int i=0;i<nums.length;i++){
//            System.out.print( nums[i] +"\t");
//        }
    }
    public void rotate(int[] nums, int k) {
        int shift = 0;
        if (nums.length <= k){
            shift = k % nums.length;
            if(shift == 0)
                return;
        }
        else {
            shift = k;
        }
        swap(nums,0,nums.length-1);
        swap(nums,0,shift-1);
        swap(nums,shift,nums.length-1);
    }

    public void swap(int[] nums,int l,int r){
        while (l<r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }
}
