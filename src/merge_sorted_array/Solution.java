package merge_sorted_array;

public class Solution {

    public static void main(String agrs[]){

        int [] array = new int[1];
//        array[0]=2;
//        array[1]=4;
//        array[2]=7;
//        for (int i=0;i<array.length;i++){
//            System.out.print(array[i] + " ");
//        }

        Solution solution = new Solution();
        solution.merge(new int[]{0},0,new int[] {1},1);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int length = (m+n)-1;
        int i = m-1;
        int j = n-1;
        boolean flag = false;

        boolean f = m!=0 && n!= 0;
        System.out.println(f);

        if (m==0 && n !=0){
//            nums1 = nums2.clone();
            for (int k=0;k<nums2.length;k++){
                nums1[k] = nums2[k];
            }
        }

        else if (m!=0 && n!= 0){
            while (length >= 0){
                if (nums1 [i] >nums2[j] && flag == false){
                    nums1[length] = nums1[i];
                    i--;
                    if (i< 0){
                        i = 0;
                        flag = true;
                    }
                }
                else {
                    nums1[length] = nums2[j];
                    j--;
                    if (j<0){
                        break;
                    }
                }
                length--;
            }
        }


        for (int k=0;k<nums1.length;k++){
            System.out.print(nums1[k] + " ");
        }
    }
}
