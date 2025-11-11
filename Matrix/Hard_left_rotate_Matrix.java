
package Beginner_Interview_Question.Matrix;

public class Hard_left_rotate_Matrix {

    public static void main(String [] args)
    {
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        //right rotate
        int layers = Math.min(matrix.length , matrix[0].length) / 2;
        int n=matrix.length;

        //outer loop
        for(int layer = 0 ; layer < layers ; layer++)
        {

            //inner loop
            int start = layer;
            int end = n-layer-1;

            for(int i=start ; i<end ; i++)
            {
                int temp = matrix[start][i];
                matrix[start][i] = matrix[i][end];
                matrix[i][end] = matrix[end][n-i-1];
                matrix[end][n-i-1] = matrix[n-i-1][start];
                matrix[n-i-1][start] = temp;


            }



        }

        for(int [] row : matrix)
        {
            for(int num : row)
            {
                System.out.print(num + "  ");
            }
            System.out.println("\n");
        }

    }

}
