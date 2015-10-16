//09-09-15 Wednessday
//Sk. Imtiaz Ahmed
//CSE11 lab work for Tamal Adhikary BRAC University
// PROBLEM 13) Palindrome
// Sample input:
// 5
// Sample output
// 123454321

import static java.lang.System.*;
import java.util.*;

public class Prob13 {

	public static void main(String[] args) {

		Scanner input = new Scanner(in);

		out.print("Enter number: ");
		int n = input.nextInt();

		int i=1;
		for(; i<=n; i++) {

			out.print(i);
		}

		i-=2;
		for(;i>0; i--) {

			out.print(i);
		}

		out.println();
	}
}