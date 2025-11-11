package Previous_Practise_Code;

public class TestPattern {
    public static void main(String[] args)
    {
      int row=5;
      for(int i=1;i<=row;i++)
      {
          int num=i;
          for(int j=1;j<=i;j++)
          {
              System.out.print(num+" ");
              num=row+num-j;
          }
          System.out.println(" ");
      }

    }
}
