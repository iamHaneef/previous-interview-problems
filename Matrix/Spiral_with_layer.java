package Beginner_Interview_Question.Matrix;

import java.util.ArrayList;
import java.util.List;

public class Spiral_with_layer {

    public static void main(String[] args)
    {
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        List<Integer> list = new ArrayList<>();
        int layers = Math.min(matrix.length, matrix[0].length)/2;

        for(int layer = 0 ; layer < layers ; layer++)
        {
            count(matrix,layer,list);
        }
    }
    public static void count(int[][] matrix , int layer , List<Integer> list)
    {

        int top = layer;        int bottom = matrix.length-layer-1;
        int left = layer;       int right = matrix.length-layer-1;

        //top

        for(int i=left ; i<=right ; i++)
        {
            list.add(matrix[top][i]);
        }

        //right
        for(int i=top+1 ; i<= bottom ;i++)
        {
            list.add(matrix[i][right]);
        }

        //bottom
        for(int i=right-1 ; i>=left ; i--)
        {
            list.add(matrix[bottom][i]);
        }

        //left
        for(int i=bottom-1 ; i>= top+1 ; i--)
        {
            list.add(matrix[i][left]);
        }

        System.out.println("layer " + layer + " : " + list);

    }
}
