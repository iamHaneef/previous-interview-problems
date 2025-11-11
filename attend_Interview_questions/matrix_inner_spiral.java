package Beginner_Interview_Question.attend_Interview_questions;

import java.util.ArrayList;
import java.util.List;

public class matrix_inner_spiral {

    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4,5,6},
                {7,8,9,10,11,12},
                {13,14,15,16,17,18},
                {19,20,21,22,23,24},
                {25,26,27,28,29,30},
                {31,32,33,34,35,36}
        };

        List<Integer> list = new ArrayList<>();

        int layers = Math.min(matrix.length, matrix[0].length) / 2;

        for(int layer = 0 ; layer < layers ; layer++)
        {
            count_elements(matrix , layer , list);
        }

        for (int num : list)
        {
            System.out.print(num + " ");
        }

    }

    public static void count_elements(int[][] matrix , int layer,  List<Integer>  list)
    {


        int top = layer; // 0
        int left = layer;  // 0

        int bottom = matrix.length - layer - 1; // 5
        int right = matrix.length - layer - 1; // 5

        // top
        for(int i = left ; i<= right ; i++)
        {
            list.add(matrix[top][i]);
        }
        top++;

        // right
        for(int i=top ; i<= bottom ; i++)
        {
            list.add(matrix[i][right]);
        }
        right--;

        //bottom
        for(int i=right ; i >= left ; i--)
        {
            list.add(matrix[bottom][i]);
        }
        bottom--;

        //left
        for(int i = bottom ; i >= top ; i--)
        {
            list.add(matrix[i][left]);
        }



    }

}
