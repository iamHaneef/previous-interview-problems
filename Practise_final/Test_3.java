package Beginner_Interview_Question.Practise_final;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test_3 {
    public static void main(String[] args)
    {

        // char to integer conversion
        char c = '3';
        char d = '5';

        int a = c - '0';
        int b = d - '0';
        System.out.println("Integer add : " + (a+b));
        System.out.println( " a : " + a);
        System.out.println( " b : " + b);

        //integer to char conversion

        int num1 = 3;
        int num2 = 5;

        char ch1 = (char) (num1 + '0');
        char ch2 = (char) (num2 + '0');

        System.out.println("char add : " + (ch1+ch2));
        System.out.println( " ch1 : " + ch1);
        System.out.println( " ch2 : " + ch2);





        // remove duplicates
        String str = "geeks for geeks";
        duplicateI(str);

        String str1 = "hhhaaannnnneeeeffff";
        duplicateII(str1);

        hashmap_duplicate_check(str);

        int n = 1639;
        armstrong(n);

        // count each word and each char
        String[] words = str.split(" ");
        int count_word = 0;
        int count_char = 0;

        for(String s : words)
        {
            count_word++;
            for(char ch : s.toCharArray())
            {
                count_char++;
            }
        }
        System.out.println("count of word : " + count_word);
        System.out.println("count of char : " +count_char);
    }
    public static void armstrong(int num )
    {
        int count = check(num);
        int original = num;
        int ans = 0;

        while(num != 0)
        {
            int digit = num%10;
            ans = ans + calculate(digit , count);
            num = num / 10;

        }
        if(ans == original)
        {
            System.out.println(original + " is a Armstrong");
        }
        else {
            System.out.println(original + " is not a Armstrong");
        }
    }
    public static int calculate(int n , int count)
    {
        int ans = 1;
        for(int i=1 ; i<= count ; i++)
        {
            ans = ans * n;
        }
        return ans;
    }

    public static int check(int n)
    {
        int count = 0;
        while(n!=0)
        {
            count++;
            n=n/10;
        }

        return count;

    }
    //---------------------------------------------------------------------
    public static void duplicateII(String str)
    {

        int j=0;
        StringBuilder sb = new StringBuilder();
        char[] arr = str.toCharArray();
        char[] ans = new char[arr.length];
        int n = arr.length;

        for(int i=0 ; i<n ; i++)
        {
            if(j==0 || j==1 || arr[i] != ans[j-2])
            {
                ans[j] = arr[i];
                j++;
            }
        }
        for(char c : ans)
        {
            sb.append(c);
        }
        System.out.println(sb.toString());
        System.out.println("---------------------------------");
    }
    public static void hashmap_duplicate_check(String str)
    {
        HashMap<Character,Integer> map = new HashMap<>();
        StringBuilder ans = new StringBuilder();
        StringBuilder dup_2 = new StringBuilder();
        for(int i=0 ; i<str.length() ; i++)
        {
            if(!map.containsKey(str.charAt(i)))
            {
                map.put(str.charAt(i),1);
            }
            else {
                dup_2.append(str.charAt(i));
            }
        }
        for(char c : map.keySet())
        {
            ans.append(c);
        }
        System.out.println("value for duplicate remove : " + ans.toString());
        System.out.println("hashmap method for dupliacte : " + dup_2.toString());
        System.out.println("-------------------------------");
    }

    public static void duplicateI(String str)
    {

        int n = str.length();
        StringBuilder sb = new StringBuilder();
        StringBuilder duplicate = new StringBuilder();
        for(int i = 0 ; i<n-1 ; i++)
        {
            if(str.charAt(i) != str.charAt(i+1))
            {
                sb.append(str.charAt(i));
            }
            else
            {
                duplicate.append(str.charAt(i));
            }
        }


        System.out.println("-------------------------------");
        System.out.println("remove duplicate I : ");
        System.out.println("nearby remove duplicate result : " +sb.toString());
        System.out.println("nearby duplicate values : " +duplicate.toString());

        System.out.println("-------------------------------");


    }
}
