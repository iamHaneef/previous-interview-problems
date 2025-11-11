package Beginner_Interview_Question.Matrix;

import java.util.Arrays;

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

        int X = 2;

        int layers = Math.min(matrix.length,matrix[0].length) / 2;

        for(int layer = 0 ; layer < layers ; layer++)
        {
            rotate_matrix(matrix,layer,X);
        }
        print_matrix(matrix);

    }
    public static void rotate_matrix(int[][] matrix , int layer , int X)
    {
        int top = layer;            int bottom = matrix.length-layer-1;
        int left = layer;           int right = matrix.length-layer-1;

        int size = 2*(right-left+1 ) + 2*(bottom-top-1);

        int[] elements = new int[size];

        int ide = 0; //track

        //logic ---

        //top
        for(int j=left ; j<= right ; j++)
            elements[ide++] = matrix[top][j];

        //right
        for(int i=top+1 ; i<=bottom ; i++)
            elements[ide++] = matrix[i][right];

        //bottom
        for(int j=right-1 ; j>=left ; j--)
            elements[ide++] = matrix[bottom][j];

        //left
        for(int i=bottom-1 ;i>=top+1 ; i--)
            elements[ide++] = matrix[i][left];

        //assign value
        int[] rotate = new int[size];

        for(int i=0 ; i<size ; i++)
        {
            rotate[(i+X) % size] = elements[i];
        }

        // again assign in matrix;
        ide = 0;
        //top

        for(int j=left ; j<= right ; j++)
            matrix[top][j] = rotate[ide++];

        //right
        for(int i=top+1 ; i<=bottom ; i++)
            matrix[i][right] = rotate[ide++];

        //bottom
        for(int j=right-1 ; j>=left ; j--)
            matrix[bottom][j] = rotate[ide++];

        //left
        for(int i=bottom-1 ;i>=top+1 ; i--)
            matrix[i][left] = rotate[ide++];

    }

    public static void print_matrix(int [][] matrix)
    {
        for(int[] row : matrix)
        {
            System.out.println(Arrays.toString(row));
        }
    }
}
