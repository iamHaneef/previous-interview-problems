package Beginner_Interview_Question.Practise_final;

import java.util.Arrays;

public class Test_1 {

    public static int tail(int n , int result)
    {
        if (n==1)
        {
            return result;
        }
        return tail(n-1,result*n);
    }

    public static int factorial(int n)
    {
        if (n == 0 || n==1)
        {
            return 1;
        }
        return n*factorial(n-1);

    }

    public static int fibo(int n)
    {
        if (n==0 || n==1)
        {
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }

    public static int gcd(int a , int b)
    {
        //euclidean algorithm

        if(b==0)
        {
            return a;
        }

        return gcd(b , a%b);

    }

    public static int large_num(int[] arr)
    {
        int first = -1;

        for(int i=0 ; i<arr.length ; i++)
        {
            if(first < arr[i])
            {
                first = arr[i];
            }
        }
        return first;

    }

    public static int second_num(int[] arr)
    {
        int first = -1;
        int second = -1;

        for(int i=0 ; i<arr.length ; i++)
        {
            if(first < arr[i])
            {
                second = first;
                first = arr[i];
            }
            else if (arr[i] < first && arr[i] > second)
            {
                second = arr[i];
            }
        }

        return second;

    }

    public static int vowel(String str)
    {
        int count = 0;

        for(int i=0 ; i<str.length();i++)
        {
            if("aeiou".indexOf(str.charAt(i)) != -1)
            {
                count++;
            }
        }
        return count;
    }

    public static boolean palindrome(String str)
    {

        StringBuilder sb = new StringBuilder();
        for (int i=0 ; i< str.length(); i++ )
        {
            if(Character.isLetterOrDigit(str.charAt(i)))
            {
                sb.append(str.charAt(i));
            }
        }
        String strs = sb.toString();
        int n = strs.length();
        for(int i=0 ; i< strs.length()/2 ; i++)
        {
            if(strs.charAt(i) != strs.charAt(n-i-1))
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        // fact
        int n = 5;
        System.out.println("factorial : " +factorial(n));

        //tail fact
        int result = 1;
        System.out.println("tail factorial : " +tail(n,result));

        //fibo
        int m = 10;
        System.out.println("fibonacci : " );
        for(int i=0 ; i<m ; i++)
        {
            System.out.print(fibo(i)  + " ");
        }
        System.out.println(" ");

        //gcd
        int a=56 , b=98;
        System.out.println("gcd : "+ gcd(a,b));

        // first & sec num in array
        int[] large = {21,34,1,4,99,31};
        System.out.println("first large num : " +large_num(large));
        System.out.println("second large num " + second_num(large));

        //vowels count
        String vowels = "helloo";
        System.out.println("vowels : " +vowel(vowels));

        //palindrome
        String str1 = "si   malayalam is";
        System.out.println("palindrome : " + palindrome(str1));

        //prime
        int num1 = 9;
        System.out.println("prime : " + prime(num1));

        //swap
        int aa = 10;
        int bb = 5;
        aa = aa + bb;
        bb = aa - bb;
        aa = aa - bb;
        System.out.println("swap 2 num : "+ aa +" , "+ bb);

        String str2 = "Im feel lonely";
        System.out.println(" reverse string and char all in one : " + stringreverse(str2));
        System.out.println(" ------------------------------------------------  ");

        int no = 1234;
        System.out.println("Sum of digit : "+ sumofdigit(no) );


        System.out.println(" ------------------------------------------------  ");
        //permutation
        System.out.println("permutation : ");
        String permute = "ABC" ;
        String results = "";
        permutaion(permute,results);


    }

    public static void permutaion(String str , String result) {
        if (str.length() == 0) {
            System.out.println(result);
        }

        for (int i = 0; i < str.length(); i++)
        {
            char c = str.charAt(i);
            String remaining = str.substring(0,i) + str.substring(i+1);
            permutaion(remaining , result+c);
        }
    }

    public static int sumofdigit(int n)
    {
        int reverse = 0;
        int sum = 0;
        while(n != 0)
        {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            sum = sum + digit;
            n=n/10;
        }
        System.out.println("reverse : " + reverse);

        return sum;
    }

    public static String stringreverse(String str)
    {
        String words[] = str.split(" ");
        int n = words.length;

        StringBuilder sb = new StringBuilder();
        System.out.println(" ------------------------------------------------  ");
        System.out.println(Arrays.toString(words));

        for(int i=n-1 ; i>=0 ; i--)
        {
            sb.append(words[i]).append(" ");
        }
        System.out.println(sb.toString());

        sb = new StringBuilder();
        for(int i=0 ; i < n ; i++)
        {
            String word = words[i];

            for(int j=word.length()-1 ; j>=0 ; j--)
            {
                sb.append(word.charAt(j));
            }

            sb.append(" ");
        }
        System.out.println(sb.toString());
        sb = new StringBuilder();
        for(int i=n-1 ; i>=0 ; i--)  //for(int i=0 ; i < n ; i++)
        {
            String word = words[i];

            for(int j=word.length()-1 ; j>=0 ; j--)
            {
                sb.append(word.charAt(j));
            }

            sb.append(" ");
        }

        return sb.toString();




    }
    public static boolean prime(int n)
    {
        if(n==0 || n==1)
        {
            return false;
        }
        for(int i=2 ; i<=Math.sqrt(n);i++)  // for(int i=0 ; i<n/2 ; i++)
        {
            if(n % i ==0)
            {
                return false;
            }
        }
        return true;
    }

}
