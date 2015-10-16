//09-09-15 Wednessday
//Sk. Imtiaz Ahmed
//CSE11 lab work for Tamal Adhikary BRAC University
// PROBLEM 1) Number Line
// Sample input:
// 6
// Sample output
// 123456

import static java.lang.System.*;
import java.util.*;

public class Prob01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(in);

		out.print("Enter number: ");
		int n = input.nextInt();


		for(int i=0; i<n; i++) {

			out.print(i+1);
		}

		out.println();
	}
}