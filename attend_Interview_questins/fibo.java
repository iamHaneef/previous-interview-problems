package Beginner_Interview_Question.attend_Interview_questins;

public class fibo {

    public static int fibonacci(int count)
    {
        if(count == 0 || count  == 1)
        {
            return count;
        }

        return fibonacci(count-1) + fibonacci(count-2);
    }

    public static void main(String args[])
    {
        int n = 10;

        for(int i = 0 ; i< n ; i++)
        {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
