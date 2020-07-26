package rotate_image;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {

    public static void main(String args[]){
        Solution solution = new Solution();
        int [][] inputs = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        solution.rotate(inputs);

        for (int i=0;i<inputs.length;i++){
            for (int j=0;j<inputs[0].length;j++){
                System.out.print(inputs[i][j] +"\t");
            }
            System.out.println("");
        }
    }

    public void rotate(int[][] matrix) {
        boolean [][] visitedMatrix = new boolean[matrix.length][matrix[0].length];

        if (matrix.length != matrix[0].length){
            return;
        }
        // transpose of a matrix
        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){

                if (!visitedMatrix[i][j] || !visitedMatrix[j][i]){

                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;


                    visitedMatrix[i][j] = true;
                    visitedMatrix[j][i] = true;
                }
            }
        }

        // rotation
        for (int i =0 ;i<matrix.length;i++){

            int l =0;
            int r = matrix[0].length-1;

            while(l<r){
                int temp = matrix[i][l];
                matrix[i][l] = matrix[i][r];
                matrix[i][r] = temp;

                r--;
                l++;
            }
        }


    }
}
