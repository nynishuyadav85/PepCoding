import java.io.*;
import java.util.*;

public class findElementInAnArray
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
        int n  = scn.nextInt();
        int arr [] = new int[n];

        for(int i = 0 ; i < arr.length ;  i++)
        {
            arr[i] = scn.nextInt();
            // System.out.println(arr[i]);
        }
        int find = scn.nextInt();

        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] == find){
                System.out.println(i);
                return;
            }
            
               
        }
         System.out.println("-1");
            
    }
}