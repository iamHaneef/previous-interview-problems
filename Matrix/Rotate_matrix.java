package Beginner_Interview_Question.Matrix;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Rotate_matrix {
    public static void main(String[] args)
    {
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        int m=matrix.length;
        int n = matrix[0].length;

        for(int i=0 ; i<m ; i++)
        {
            for(int j=i ; j<n ; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i=0 ; i<m ; i++)
        {
            for(int j=0 ; j<n/2 ; j++)
            {
                int temp  = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][m-j-1]= temp;
            }
        }

        for(int [] row : matrix)
        {
            System.out.println(Arrays.toString(row));
        }

    }
}
