package Patterns;

import java.util.Scanner;

public class P13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int icj;
		for (int i = 0; i < n; i++) {
			icj = 1;
			for (int j = 0; j <= i; j++) {
				System.out.print(icj + "\t");
				int icjp1 = icj * (i-j) / (j+1);
				icj = icjp1;

			}
			System.out.println();
		}

	}

}
