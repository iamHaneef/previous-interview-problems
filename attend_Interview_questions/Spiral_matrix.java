package Beginner_Interview_Question.attend_Interview_questions;

import java.util.ArrayList;
import java.util.List;

public class Spiral_matrix {
    public static void main(String[] args)
    {
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int num = 1;
        // rs , r-end ?
        // cs , c-end ?
        int rs = 0 , cs = 0;
        int r_end = matrix.length-1;
        int c_end = matrix[0].length-1;

        List<Integer> list= new ArrayList<>();

        while(rs <= r_end && cs <= c_end)
        {
            // left to right - top
            for(int i=cs ; i<= c_end ; i++)
            {
                list.add(matrix[rs][i]);
            }
            rs++;

            System.out.println(num++ + " " + list);

            // top to bottom - right

            for(int i=rs ; i<= r_end ; i++)
            {
                list.add(matrix[i][c_end]);
            }
            c_end--;

            System.out.println(num + " " + list);

            //right to left - bottom
            if(rs <= r_end)
            {
                for(int i=c_end ; i>=cs ; i--)
                {
                    list.add(matrix[r_end][i]);
                }
                r_end--;
            }

            System.out.println(num + " " + list);


            //bottom to top - left

            if(cs <= c_end)
            {
                for(int i=r_end ; i>= rs ; i--)
                {
                    list.add(matrix[i][cs]);
                }
                cs++;
            }

            System.out.println(num + " " + list);


        }

        System.out.println(num + " Final " + list);
    }
}
