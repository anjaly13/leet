package pascals_triangle;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String agrs[]){

        Solution solution = new Solution();

        List<List<Integer>> list = solution.generate(0);
//
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }

    public List<List<Integer>> generate(int numRows) {



        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> list ;
        if (numRows == 0){
            return triangle;
        }
        List<Integer> tempList = new ArrayList<>();
        for (int i=0;i<numRows;i++){
            list = new ArrayList<>();
            if (i==0 ){
                list.add(1);
            }
            else {
                list.add(1);
                for (int k=1;k<i;k++){
                    list.add(tempList.get(k)+tempList.get(k-1));
                }
                list.add(1);
            }
            triangle.add(list);
            tempList.clear();
            tempList.addAll(list);
        }

        return triangle;
    }
}
