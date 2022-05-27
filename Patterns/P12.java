package Patterns;

import java.util.Scanner;

public class P12 {

	public static void main(String[] args) {
		try {
            System.setIn(new FileInputStream("../input.txt"));
            System.setOut(new PrintStream(new FileOutputStream("../output.txt")));
        } catch (Exception e) {
            System.err.println("Error");
        }
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a = 0 ;
		int b = 1 ;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(a + "\t");
				int c = a+b;
				a = b ; 
				b = c ;
			}
			System.out.println();
		}

	}

}
