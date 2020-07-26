package three_sum;

import java.util.*;
import java.util.stream.Stream;

public class Solution {

    public static void main(String args[]){

        Solution solution= new Solution();
        System.out.println(solution.threeSum(new int []{-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6}));

    }

    public List<List<Integer>> threeSum(int[] nums) {

        int fixedVal = 0;
        List<List<Integer>> mainList = new ArrayList<>();
        if (nums.length < 3){
            return mainList;
        }
        Arrays.sort(nums);
        for (int i = 0;i< nums.length-2 ;i++){

            if (i != 0 && nums[i] == nums[i-1]){
                continue;
            }
             fixedVal = 0 - nums[i];
            int l = i+1;
            int r = nums.length-1;
            String val ="";
            while (l<r){

                if ((nums[l] + nums[r]) > fixedVal){
                    r--;
                }
                else if ((nums[l] + nums[r]) < fixedVal){
                    l++;
                }
                else {
                    List<Integer> subList = new ArrayList<>();
                    subList.add(nums[i]);
                    subList.add(nums[l]);
                    subList.add(nums[r]);

                    if (!val .equalsIgnoreCase(nums[i] +""+nums[l] +""+nums[r])){
                        mainList.add(subList);
                    }
                    val = (nums[i] +""+nums[l] +""+nums[r]);
                    r--;
                    l++;


                }


            }
        }

        return mainList;

    }
}
