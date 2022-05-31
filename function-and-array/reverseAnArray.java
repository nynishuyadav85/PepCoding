import java.io.*;
import java.util.*;

public class reverseAnArray
{
    public static void main(String[] args)
    {
        try
        {
            System.setIn(new FileInputStream("../input.txt"));
            System.setOut(new PrintStream(new FileOutputStream("../output.txt")));
        }
        catch (Exception e)
        {
            System.err.println("Error");
        }

        Scanner scn = new Scanner(System.in);
        int n1  = scn.nextInt();
        int arr1 [] = new int[n1];

        for(int i = 0 ; i < arr1.length ;  i++)
        {
            arr1[i] = scn.nextInt();

        }

        int low = 0;
        int high = arr1.length - 1;

        while(low < high)
        {
            int temp = arr1[low];
            arr1[low] = arr1[high];
            arr1[high] = temp ;

            low++;
            high--;
        }

        for(int val : arr1)
        {
            System.out.println(val);
        }


    }
}