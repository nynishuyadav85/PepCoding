package Patterns;

import java.util.Scanner;

public class P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int row = 1 ; 
		while(row <= n ) {
			for(int col = 1 ; col <=n ; col++) {
				if(row == col || row + col == n+1) {
					System.out.print("*\t");
				}
				
				else {
					System.out.print("\t");
				}
			}
			System.out.println();
			row++;
		}

	}

}
