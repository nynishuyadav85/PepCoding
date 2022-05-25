package Patterns;

import java.util.Scanner;

public class P15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int nsp = n / 2;
		int nst = 1 ; 
		int val = 1;
		int row = 1 ; 
		while(row <= n) {
			
			for(int csp = 1 ; csp <= nsp ; csp++) {
				System.out.print("\t");
			}
			int cval = val ; 
			for(int cst = 1 ; cst <= nst ; cst++) {
				System.out.print(cval + "\t");
				
				if(cst <= nst / 2 ) {
					cval++;
				}else {
					cval--;
				}
			}
			if(row <= n /2 ) {
				nsp--;
				nst +=2;
				val++;
			}else {
				nsp++;
				nst -=2;
				val--;
				
			}
			
			System.out.println();
			
			row++;
			
		}
	}

}
