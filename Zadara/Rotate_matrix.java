package Zadara;
import java.util.Scanner;

public class Rotate_matrix {

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

//        2 2 4 5 6 7 8 9
//        2 3 3 3 4 5 6 0
//        2 3 4 4 4 5 7 1
//        2 3 4 6 5 6 8 9
//        2 3 5 6 5 7 8 9
//        8 4 6 7 7 7 8 9
//        9 5 6 7 8 8 8 9
//        1 2 3 4 5 6 9 9

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rotations (X): ");
        int X = sc.nextInt();
        int layers = Math.min(matrix.length, matrix[0].length) / 2;
        for (int layer = 0; layer < layers; layer++)
            rotateLayer( matrix, layer, X );

        printMatrix(matrix);
    }

    private static void rotateLayer(int[][] matrix, int layer, int X) {

        int top = layer, bottom = matrix.length - layer - 1;
        int left = layer, right = matrix[0].length - layer - 1;

        int size = 2 * ( right - left + 1 ) + 2 * ( bottom - top - 1 ) ;

        int[] elements = new int[size];

        int idx = 0;

        for (int j = left; j <= right; j++)
            elements[idx++] = matrix[top][j];
        for (int i = top + 1; i <= bottom; i++)
            elements[idx++] = matrix[i][right];
        for (int j = right - 1; j >= left; j--)
            elements[idx++] = matrix[bottom][j];
        for (int i = bottom - 1; i > top; i--)
            elements[idx++] = matrix[i][left];

        int[] rotated = new int[size];
        for (int i = 0; i < size; i++)
            rotated[(i + X) % size] = elements[i];

        idx = 0;
        for (int j = left; j <= right; j++)
            matrix[top][j] = rotated[idx++];
        for (int i = top + 1; i <= bottom; i++)
            matrix[i][right] = rotated[idx++];
        for (int j = right - 1; j >= left; j--)
            matrix[bottom][j] = rotated[idx++];
        for (int i = bottom - 1; i > top; i--)
            matrix[i][left] = rotated[idx++];
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }

}