import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.*;


public class Main {


    public static void main(String[] args) {
        int [] nums = new int []{3,2,4};
//        int [] nums = new int []{2,7,11,15};
        int target = 6;

        Main main = new Main();
        int [] a= main.getCombinations(nums,target);
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }

    public int[] getCombinations (int []nums,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }

        for(int i=0;i<nums.length;i++){
            int num = target - nums[i];
            if(map.containsKey(num) && map.get(num) != i){
                return new int []{i,map.get(num)};
            }
        }
        return null;
    }


}
// for(int i=0;i< (1<< ans.length) ;i++){
//        int sum =0 ;
//        String packet="";
//        ArrayList<Integer> indices = new ArrayList<>();
//
//        for (int j=0;j<ans.length;j++){
//        if ((i & (1<<j))>0){
//        sum = sum + ans[j];
//        packet = packet + ans[j];
//        indices.add(j);
//        }
//        }
//        if (sum == 542 ){
//        if(indices.size()==2){
//        System.out.println(indices);
//        }
//        }
//        }


//        public int[] twoSum(int[] nums, int target) {
//
//
//            for(int i=0;i<nums.length-1;i++){
//                if(nums[i]<target){
//                    for(int j=i+1;j<nums.length;j++){
//                        if(nums[j]<target){
//                            int sum = nums[i]+nums[j];
//                            if (sum == target){
//                                return new int[]{i,j};
//                            }
//                        }
//                        else if (nums[j] == target){
//                            return new int[]{j};
//                        }
//                    }
//                }
//                else if(nums[i] == target){
//                    return new int[]{i};
//                }
//            }
//
//            return null;
//        }





