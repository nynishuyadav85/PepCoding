import java.io.*;
import java.util.*;

public class subsetOfArray
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
        int arr [] = new int[n1];

        for(int i = 0 ; i < arr.length ;  i++)
        {
            arr[i] = scn.nextInt();

        }

         int limit = (int) Math.pow (2, arr.length); 
    for (int i = 0; i < limit; i++)
    {
      
      String set = "";
      
      int temp = i;
      
      for (int j = arr.length - 1; j >= 0; --j)
      {
        
        
        int rem = temp % 2;
        temp = temp / 2;
        if (rem == 0)   
        {
          set = "-\t" + set;
        }
        else
        {
          
          set = arr[j] + "\t" + set;
        }
      }
      System.out.println (set);
      
    }

    }
}