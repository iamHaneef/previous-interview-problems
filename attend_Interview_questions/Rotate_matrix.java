package Beginner_Interview_Question.attend_Interview_questions;

import java.util.Scanner;

public class Rotate_matrix {
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
        int m = matrix.length;
        int n = matrix.length;
        // transpose
        for(int i=0 ; i< m ; i++) // 0 , 1, 2 , 3
        {
            for(int j=i ; j< n ; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // rotate

        for(int i=0 ; i<m ; i++)
        {
            for(int  j=0 ; j< n/2 ;  j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = temp;
            }
        }
    }
    public static void print_matrix(int[][] matrix)
    {
        for(int[] row : matrix)
        {
            for(int n : row)
            {
                System.out.print(n + " ");
            }
            System.out.println(" ");
        }
    }
}
