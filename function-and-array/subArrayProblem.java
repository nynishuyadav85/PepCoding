import java.io.*;
import java.util.*;

public class subArrayProblem
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

        for(int i = 0 ; i < arr1.length ; i++)
        {


            for(int j = i ; j < arr1.length ; j++)
            {

                for (int k = i ; k <= j ; k++)
                {
                    System.out.print(arr1[k] + " ");
                }
                System.out.println();
            }


        }
    }
}