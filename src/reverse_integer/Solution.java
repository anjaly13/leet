package reverse_integer;

/*
Given a 32-bit signed integer, reverse digits of an integer.

Input: 120
Output: 21

Input: 123
Output: 321

Input: -123
Output: -321

 */
public class Solution {

    public static void main(String args[]){

        Solution solution= new Solution();
        solution.reverse(1534236469);
        //1534236469
    }


    public int reverse(int x) {
        int result = 0;
        while(x!=0){
            int remaining = x%10;
            result = (result*10) + remaining;
            if ((result%10) != remaining){
                System.out.println(0);
            }
            x= x/10;
        }

        System.out.println(result);
        return 0;
    }
}
