package Patterns;

import java.util.Scanner;

public class P14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		for(int  i = 1 ; i <= 10 ; i++) {
			int val = n * i;
			System.out.println(n + " * " + i + " = " + val);
		}
	}

}
