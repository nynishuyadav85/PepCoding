import java.io.*;
import java.util.*;

public class rotateArray
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
        int rot = scn.nextInt();

        rotate(arr1 , rot);
        display(arr1);
       
    }
    public static void display(int [] arr){
        for(int val : arr){
            System.out.println(val);
        }
    }
  
    public static void reverse(int arr1[] , int si , int ei){
        int low = si;
        int high = ei;

        while(low < high)
        {
            int temp = arr1[low];
            arr1[low] = arr1[high];
            arr1[high] = temp ;

            low++;
            high--;
        }
    }

    public static void rotate(int arr1[] , int rot){
        rot = rot % arr1.length;
        reverse(arr1 , 0 , arr1.length-rot-1);
        reverse(arr1 , arr1.length-rot , arr1.length-1);
        reverse(arr1 , 0 , arr1.length-1);
    }
}