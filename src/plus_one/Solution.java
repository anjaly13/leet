package plus_one;

import java.util.Arrays;

public class Solution {

    public static void main(String agrs[]){
       Solution solution = new Solution();
       int [] array = solution.plusOne(new int []{9,9,9,9});

        for (int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
    }

    public int[] plusOne(int[] digits) {

        for (int i=digits.length-1;i>=0;i--){
            if (digits[i]!=9){
                digits[i]++;
                return digits;
            }
            else {
                digits[i] = 0;
                if (i==0){
                    int [] array = new int [digits.length+1];
//                    Arrays.fill(array,0);
                    array[0]++;
                    return array;
                }
            }
        }
        return null;
    }
}
