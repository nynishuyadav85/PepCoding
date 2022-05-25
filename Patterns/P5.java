package Patterns;

import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int nsp = n / 2;
		int nst = 1 ; 
		
		int row = 1 ; 
		while(row <= n) {
			
			for(int csp = 1 ; csp <= nsp ; csp++) {
				System.out.print("\t");
			}
			
			for(int cst = 1 ; cst <= nst ; cst++) {
				System.out.print("*\t");
			}
			if(row <= n /2 ) {
				nsp--;
				nst +=2;
			}else {
				nsp++;
				nst -=2;
				
			}
			
			System.out.println();
			row++;
		}
	}

}
