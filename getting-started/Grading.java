
import java.io.*;
import java.util.*;

public class Grading {

	public static void main(String[] args) {
		try {
            System.setIn(new FileInputStream("../input.txt"));
            System.setOut(new PrintStream(new FileOutputStream("../output.txt")));
        } catch (Exception e) {
            System.err.println("Error");
        }


		Scanner scn = new Scanner(System.in);
		int marks = scn.nextInt();

		if (marks > 90) {
			System.out.println("excellent");
		} else if (marks > 80) {
			System.out.println("good");
		} else if (marks > 70) {
			System.out.println("fair");
		} else if (marks > 60) {
			System.out.println("meets expectations");
		} else {
			System.out.println("below par");
		}

	}

}
