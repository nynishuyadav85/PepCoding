package Q;

import java.util.Scanner;

public class DigitsOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int digit = sc.nextInt();

		int div = 0;
		int count = 0;

		while (digit != 0) {
			digit = digit / 10;
			System.out.println(digit);
			count++;
		}
		

	}

}
