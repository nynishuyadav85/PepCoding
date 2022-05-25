package Q;

import java.util.Scanner;

public class CountDigitsInANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		
		int nod = 0;
		int digit = n;
		
		while (digit != 0) {
			digit = digit / 10;
			nod++;
		}
		int div = (int)Math.pow(10, nod-1);
		while (n != 0) {
			int q = n / div;
			System.out.println(q);
			n = n % div;
			div = div /10;
		}
				

	}

}
