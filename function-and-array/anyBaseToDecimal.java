import java.io.*;
import java.util.*;

public class anyBaseToDecimal {
    public static void main(String[] args) {
        try {
            System.setIn(new FileInputStream("../input.txt"));
            System.setOut(new PrintStream(new FileOutputStream("../output.txt")));
        } catch (Exception e) {
            System.err.println("Error");
        }

        Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int d = getValueIndecimal(n, b);
      System.out.println(d);
    }
     public static int getValueIndecimal(int n, int b){
      // write your code here
     	int rv = 0 ; 
        int p = 1 ; 
        while(n > 0) {
            int dig = n % 10 ;

            n = n / 10 ;
            rv += dig * p ; 
            p = p * b;
        }
        return rv;
   }
}