package Patterns;

import java.util.Scanner;

public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int nst = n / 2 + 1;
		int nsp = 1;
		
		
		int row = 1 ; 
		while(row <= n ) {
			for (int cst = 1 ; cst <= nst ; cst++){
				System.out.print("*\t");
			}
			
			for(int csp = 1 ; csp <= nsp ; csp++) {
				System.out.print("\t");
			}
			for (int cst = 1 ; cst <= nst ; cst++){
				System.out.print("*\t");
			}
			if (row  <= n / 2 ) {
				nst-- ; 
				nsp += 2;
			} else {
				nst++;
				nsp -=2;
			}
			
			System.out.println();
			row++;
			
		}

	}

}
