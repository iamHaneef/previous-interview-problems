package RND;

public class FibonacciSeries {
    public static int fibonacci(int count) {
        if(count <=1 )
        {
            return count;
        }
        return fibonacci(count-1)+fibonacci(count-2);
    }



    public static void main(String[] args)
    {
        int length=10; // 0 1 2 3 4
        for(int i=0;i<length;i++)  //2
        {
            System.out.print(fibonacci(i)+" ");
        }
    }
}
