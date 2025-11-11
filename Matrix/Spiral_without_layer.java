package Beginner_Interview_Question.Matrix;

import java.util.ArrayList;
import java.util.List;

public class Spiral_without_layer {

    public static void main(String[] args)
    {
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        int rs = 0;
        int cs = 0;
        int r_end = matrix.length-1;    //bcoz rend = 4
        int c_end = matrix[0].length-1;

        List<Integer> list = new ArrayList<>();

        // without leyer

        while(rs <= r_end && cs <= c_end)
        {

            for(int i=cs ; i<=c_end ; i++)
            {
                list.add(matrix[rs][i]);
            }
            rs++;

            for(int i=rs ; i<= r_end ; i++)
            {
                list.add(matrix[i][c_end]);
            }
            c_end--;

            if(rs <= r_end)
            {
                for(int i=c_end ; i>= cs ; i--)
                {
                    list.add(matrix[r_end][i]);
                }
            }
            r_end--;


            if(cs <= c_end)
            {
                for(int i=r_end ; i>= rs ; i--)
                {
                    list.add(matrix[i][cs]);
                }
            }
            cs++;

        }

        System.out.println(list);
    }

}
