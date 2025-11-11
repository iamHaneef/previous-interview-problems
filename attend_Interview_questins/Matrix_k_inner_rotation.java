package Beginner_Interview_Question.attend_Interview_questins;

import java.util.Scanner;

public class Matrix_k_inner_rotation {

    public static void main(String[] args)
    {
        int [][] matrix = {
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
        System.out.print("Enter the Number of Rotation : ");
        int X = sc.nextInt();

        int layers = Math.min(matrix.length, matrix[0].length) / 2;
        for(int layer = 0 ; layer < layers ; layer++)
        {
            // 0 , 1 ,2 ,3
            rotate_matrix(matrix , layer , X);
        }
        print_matrix(matrix);

    }
    public static void rotate_matrix(int[][] matrix , int layer , int X)
    {
        int top = layer;
        int bottom = matrix.length - layer - 1;

        int left = layer ;
        int right = matrix.length - layer - 1;

        int size = 2  * (right - left + 1) + 2 * (bottom - top - 1); // 28

        // new array for store layer 0 elements

        int[] elements = new int[size];

        int ide = 0;

        // all four loops top , bottom , left , right

        for(int j = left ; j<= right ; j++)      // top
            elements[ide++ ] = matrix[top][j];

        for(int i = top+1 ; i<= bottom ; i++)
            elements[ide++ ] = matrix[i][right];  // right

        for(int j = right-1 ; j>= left ; j--)
            elements[ide++ ] = matrix[bottom][j]; // bottom

        for(int i = bottom-1 ; i >= top+1 ; i--)
            elements[ide++ ] = matrix[i][left];     // left

        // create new array for rotation of X = 2

        int[] rotation = new int[size];

        for(int i=0 ; i<size  ; i++)
            rotation[(i + X) % size] = elements[i];

        // now again put the element in same position in matrix

        ide = 0 ; // again

        for(int j = left ; j<= right ; j++)      // top
            matrix[top][j] = rotation[ide++];

        for(int i = top+1 ; i<= bottom ; i++)
            matrix[i][right] = rotation[ide++];  // right

        for(int j = right-1 ; j>= left ; j--)
            matrix[bottom][j] = rotation[ide++]; // bottom

        for(int i = bottom-1 ; i >= top+1 ; i--)
            matrix[i][left] = rotation[ide++];     // left

    }
    public static void print_matrix(int[][] matrix)
    {
        for(int [] row : matrix)
        {
            for(int n : row)
            {
                System.out.print(n + " ");
            }
            System.out.println(" ");
        }
    }
}
