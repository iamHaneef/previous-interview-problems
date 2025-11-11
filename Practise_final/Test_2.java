package Beginner_Interview_Question.Practise_final;

import java.text.SimpleDateFormat;
import java.util.*;

public class Test_2 {
    public static void main(String[] args)
    {
        // array same -- hard method
        int [] a = {1,5,71,99,22};
        int [] b = {71,99,1,5,22,77};

        HashMap<Integer,Integer> map = new HashMap<>();
        int count=0;
        if(a.length != b.length)
        {
            System.out.println("Array is differ length");
        }
        for(int i=0 ; i<a.length ; i++)
        {
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }

        for(int i=0 ; i<b.length ; i++)
        {
            if(map.containsKey(b[i]) && map.get(b[i]) > 0)
            {
                map.put(b[i],map.get(b[i])-1);
            }
            else {
                count=-1;
                break;
            }
        }

        for(int i=0 ; i<a.length ; i++)
        {
            if(map.containsKey(a[i]) && map.get(a[i]) == 0)
            {
                count = count + map.get(a[i]);
            }
            else {
                count = -1;
                break;
            }
        }
        if(count == 0)
        {
            System.out.println("Array is same");
        }
        else{
            System.out.println("Different");
        }
        System.out.println("--------------------------------");
        //date
        String pattern = "dd-MM-yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        String answer = sdf.format(new Date());
        System.out.println("date : " +answer);

        //general sorting
        int arr[] = {3,21,0,88,5,991,2};

        for(int i=0 ; i< arr.length-1 ; i++)
        {
            for(int j=i+1 ; j< arr.length ; j++)
            {
                if(arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("sorted array : " + Arrays.toString(arr));

        //multiverse comparison
        int arr1[] = {9,72,45,19,19,99,1001,4};
        System.out.println("Multiverse comparion : " +Arrays.toString(multiverse(arr1)));

        //odd num
        int no = 19;
        if(no % 2 ==0)
        {
            System.out.println("no is " + "even");
        }
        else {
            System.out.println("number is " + "odd");
        }

        //remove whitespace
        String str = " h i my de ar fr  i e  n d";
        StringBuilder sb = new StringBuilder();
        for(int i=0 ; i<str.length() ; i++)
        {
            if(!Character.isWhitespace(str.charAt(i)))
            {
                sb.append(str.charAt(i));
            }
        }
        System.out.println("remove whitespace : " + sb.toString());

        //random swap
        int array[] = {0, 99, 22, 5, 8};
        Random rand = new Random();
        int pick = rand.nextInt(array.length);
        for(int i=0 ; i<array.length ;i++)
        {
            int temp = array[i];
            array[i] = array[pick];
            array[pick] = temp;
        }
        System.out.println("random swap : " + pick);
        System.out.println(Arrays.toString(array));

        //reverse alphabetic match
        String str1 = "abcvvxyz";
        System.out.print("alphabetic match : " ); alphabatic(str1);

        //twitter feature
        String str_1 = "701";
        String str_2 = "305";
        twitter(str_1,str_2);

    }

    public static void twitter(String str1 , String str2)
    {
        int m = str1.length()-1;
        int n = str2.length()-1;

        int sum = 0;
        int carry = 0;
        int a =0 , b=0;

        StringBuilder sb = new StringBuilder();

        while(m >=0 || n>=0)
        {
            if(m>=0 && n>=0)
            {
                a = str1.charAt(m) - '0';
                b = str2.charAt(n) - '0';
            }
            else if(m >= 0 && n<0)
            {
                a = str1.charAt(m) - '0';
                b = 0;
            }
            else if (m<0 && n>=0)
            {
                a=0;
                b = str2.charAt(n) - '0';
            }

            sum = a+b+carry;
            sb.append(sum % 10);

            carry = sum / 10;
            m--;
            n--;


        }
        if(carry != 0)
        {
            sb.append(carry);

        }
        System.out.println("twitter features : " + sb.reverse().toString());
    }

    public static void alphabatic(String str)
    {
        int count=0;
        for(int i=0 ; i<str.length() / 2 ; i++)
        {
            char left = str.charAt(i);
            char right = str.charAt(str.length()-i-1);

            char reverse = (char) ('z' - (left - 'a'));

            if(right != reverse)
            {
                System.out.println("No alphabetic match");
                break;
            }
            else {
                count ++;
            }


        }
        if(count == str.length() / 2)
        {
            System.out.println("perfect match");
        }
    }

    public static int[] multiverse(int[] arr)
    {
        int n = arr.length;
        int[] result = new int[arr.length];
        for(int i=0 ; i<n ; i++)
        {
            result[i] = -1;
            int first = count(arr[i]);
            for(int j=i+1 ; j<n ; j++)
            {
                int second = count(arr[j]);

                if(first == second && arr[i] < arr[j])
                {
                    result[i] = arr[j];
                    break;
                }
                else if(first < second)
                {
                    result[i] = arr[j];
                    break;
                }
            }
        }
        return result;
    }
    public static int count(int n)
    {
        int sum =0;
        while(n != 0)
        {
            int digit = n%10;
            sum = sum + digit;
            n=n/10;
        }
        return sum;
    }
}
