package Patterns;

import java.util.Scanner;

public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int nst = 1 ; 
		int nsp = n-1 ;
		
		
		int row = 1;
		
		while(row <= n) {
			for (int csp = 1 ; csp <= nsp ; csp++) {
				System.out.print("\t");
			}
			
			for (int cst = 1 ; cst <= nst ; cst++) {
				System.out.print("*\t");
			}
			
			System.out.println();
			row++;
			nsp--;
		}


	}

}
