import java.io.*;
import java.util.*;

public class SpanOfArray {
    public static void main(String[] args) {
        try {
            System.setIn(new FileInputStream("../input.txt"));
            System.setOut(new PrintStream(new FileOutputStream("../output.txt")));
        } catch (Exception e) {
            System.err.println("Error");
        }

        Scanner scn = new Scanner(System.in);
        int n  = scn.nextInt();
        int arr [] = new int[n];
		
        for(int i = 0 ; i < arr.length ;  i++){
        	arr[i] = scn.nextInt();
        	// System.out.println(arr[i]);
}
int max = arr[0]; 
        int min = arr[0];
        for (int i = 0 ; i < arr.length ;i++ ) {
        	if(max < arr[i]){
        		max = arr[i];
        	}
        	if(min > arr[i]){
        		min = arr[i];
        	}
        }

        int span = max - min ;
        System.out.println(span);

        

        

      
    }
}