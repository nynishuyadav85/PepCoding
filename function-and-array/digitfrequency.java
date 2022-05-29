import java.io.*;
import java.util.*;

public class digitfrequency {
    public static void main(String[] args) {
        try {
            System.setIn(new FileInputStream("../input.txt"));
            System.setOut(new PrintStream(new FileOutputStream("../output.txt")));
        } catch (Exception e) {
            System.err.println("Error");
        }

        Scanner scn = new Scanner(System.in);
         int n = scn.nextInt();
        int dig = scn.nextInt();
        
        int nod = 0;
        while (n != 0){
        int	div = n % 10;
         n =  n / 10 ; 
         if(div == dig){
         	nod++;
         }
         
         }
         System.out.println(nod);
    }
}