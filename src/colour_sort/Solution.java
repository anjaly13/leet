package colour_sort;

public class Solution {

    public static void main(String args[]){
        Solution solution = new Solution();
        int [] inputs = new int [] {2,0,2,1,1,0};

        solution.sortColors(inputs);
        for (int i=0;i<inputs.length;i++){
            System.out.print(inputs[i] +"\t");
        }
    }

    public void sortColors(int[] nums) {

        if (nums.length == 0){
            return;
        }
        int[] count = new int[]{0,0,0};
        for (int i=0;i<nums.length;i++){
            if (nums[i]==0){
                count[0]++;
            }
            else if (nums[i]==1){
                count[1]++;
            }
            else if (nums[i]==2){
                count[2]++;
            }
            else {
                return;
            }
        }

        int counting =0;
        int tillCount = 0;
        for (int i=0;i<count.length;i++){

            tillCount = count[i] + tillCount;

            for (int j=counting;j<tillCount;j++){
                nums[j] = i;
                counting++;
            }
        }
    }
}
