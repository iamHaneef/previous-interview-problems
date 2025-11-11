package Beginner_Interview_Question.attend_Interview_questins;

import java.util.Arrays;
import java.util.Scanner;

public class Rotate_matrix_2 {
    public static void main(String[] args)
    {
        int [][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of times need to rotate : ");
        int X = sc.nextInt();

        for(int i=0 ; i<X ; i++)
        {
            rotate_matrix(matrix);
        }

        print_matrix(matrix);
    }
    public static void rotate_matrix(int[][] matrix)
    {
        int n = matrix.length;
        int layers = Math.min(matrix.length,matrix[0].length)/2;
        for(int layer = 0 ; layer < layers ; layer++) // 0 , 1 ,2 ,3--> just i
        {
            int start = layer;
            int end = n - layer - 1;

            for(int i = start ; i < end ; i++)  // --> just  j
            {
                // right rotate
                int temp = matrix[start][i];
                matrix[start][i] = matrix[n-i-1][start] ;
                matrix[n-i-1][start] =  matrix[end][n-i-1];
                matrix[end][n-i-1] = matrix [i][end];
                matrix [i][end] = temp;

            }
        }

         /*
                // left rotate

                int temp = matrix[start][i];
                matrix[start][i] = matrix[i][end] ;
                matrix[i][end] = matrix[end][n-i-1];
                matrix[end][n-i-1] = matrix[n-i-1][start];
                matrix[n-i-1][start] = temp;


         */

    }
    public static void print_matrix(int[][] matrix)
    {
        for(int[] row : matrix)
        {
            System.out.println(Arrays.toString(row     ));
        }
    }
}
