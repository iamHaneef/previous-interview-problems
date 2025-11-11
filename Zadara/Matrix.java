package Zadara;

import java.util.Scanner;

public class Matrix {

    public static int[][] process(int[][] matrix, int k) {
        int n=matrix.length;
        for(int m=0;m<k;m++)
        {
            int row=matrix.length;
            int col= matrix[0].length;
            for(int i=0;i<n;i++) {
                for (int j = i; j < n; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n/2;j++)
                {
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[i][n-1-j];
                    matrix[i][n-1-j]=temp;
                }
            }
        }

        return matrix;
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {4, 5, 6, 7, 8, 9, 0, 1},
                {2, 3, 4, 5, 6, 7, 8, 9},
                {2, 3, 4, 5, 6, 7, 8, 9},
                {2, 3, 4, 5, 6, 7, 8, 9},
                {2, 3, 4, 5, 6, 7, 8, 9},
                {2, 3, 4, 5, 6, 7, 8, 9},
                {2, 3, 4, 5, 6, 7, 8, 9},
                {8, 9, 1, 2, 3, 4, 5, 6}
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rotations (k): ");
        int k = sc.nextInt();
        matrix = process(matrix, k);
        System.out.println("Rotated Matrix is :");
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}





