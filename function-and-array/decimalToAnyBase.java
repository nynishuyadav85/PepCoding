import java.io.*;
import java.util.*;

public class decimalToAnyBase
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
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
    }

    public static int getValueInBase(int n, int b)
    {
        // write code here
        int add = 0;
        int pow = 1 ;
        while(n > 0)
        {
            int dig = n % b ;
            n = n / b ;
            add = add + dig * pow ;
            pow = pow * 10 ;
        }
        return add;
    }
}