package Beginner_Interview_Question.attend_Interview_questins;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class matrix_order_1 {
    public static void main(String[] args)
    {
        int [][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        int rs = 0;
        int cs = 0;

        int r_end = matrix.length - 1;
        int c_end = matrix[0].length - 1;

        List<Integer> list = new ArrayList<>();
        int num  = 1;

//        while(c_end >= cs) // 3 , 2 , 1 , 0
//        {
//            //top to bottom;
//            for(int i = rs ; i<= r_end ; i++) // row - 0 , 1 ,2 ,3
//            {
//                list.add(matrix[i][c_end]);
//            }
//            c_end--;
//
//            System.out.println(num + " " + list);
//        }

        while(r_end >= rs) {
            for (int i = c_end; i >= cs; i--) {
                list.add(matrix[r_end][i]);
            }
            r_end--;

            System.out.println(num + " " + list);
        }



    }
}
