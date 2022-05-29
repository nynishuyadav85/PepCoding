import java.io.*;
import java.util.*;

public class p {
    public static void main(String[] args) {
        try {
            System.setIn(new FileInputStream("../input.txt"));
            System.setOut(new PrintStream(new FileOutputStream("../output.txt")));
        } catch (Exception e) {
            System.err.println("Error");
        }

        Scanner scn = new Scanner(System.in);
       
        int num = scn.nextInt();
        int rot = scn.nextInt();
        int temp = num ; 
        int nod = 0;
        while (temp != 0){
         temp =  temp / 10 ; 
         nod++;
         }
         rot = rot % nod;
         int divisor = (int)Math.pow(10 , rot);
         int rem = num % divisor;
         int qut = num / divisor;

         int mul = (int) Math.pow(10 , nod - rot);

         int ans = rem * mul + qut;
         System.out.println(ans);
    }
}