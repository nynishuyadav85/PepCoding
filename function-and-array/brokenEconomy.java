import java.io.*;
import java.util.*;

public class brokenEconomy
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
        int item = scn.nextInt();

       int lo = 0 ; 
       int high = arr1.length -1 ;
       int ceil = 0 ; 
       int floor = 0;

       while(lo <= high){
        int mid = (lo + high) / 2 ;
        if(item < arr1[mid]){
            high = mid -1 ;
            ceil = arr1[mid];

        } else if(item  > arr1[mid]){
            lo = mid + 1 ; 
            floor = arr1[mid];
        }
        else{
            ceil = arr1[mid];
            floor = arr1[mid];
            break;
        }
       }
             System.out.println(ceil);
             System.out.println(floor);
    }
}