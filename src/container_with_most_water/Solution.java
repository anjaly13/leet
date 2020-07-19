package container_with_most_water;

public class Solution {

    public static void main(String args[]){
        Solution solution= new Solution();
        solution.maxArea(new int []{1,2,3,4,5,6,7});
//        for (int i=0;i<nums.length;i++){
//            System.out.print( nums[i] +"\t");
//        }
        System.out.print( solution.maxArea(new int []{1,8,6,2,5,4,8,3,7}));
    }

    public int maxArea(int[] height) {

        if (height.length <=1){
            return 0;
        }

        int l = 0;
        int r= height.length-1;
        int h=0;
        int max=0;

        while (l<r){
            int length = r-l;
            if (height[l]<= height[r]){
                h = height[l];
                l++;
            }
            else if (height[r]<height[l]){
                h = height[r];
                r--;
            }

            int area = length * h;
            if (area > max){
                max = area;
            }

        }

        return max;
    }
}
