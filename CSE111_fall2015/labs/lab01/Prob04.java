//09-09-15 Wednessday
//Sk. Imtiaz Ahmed
//CSE11 lab work for Tamal Adhikary BRAC University
// PROBLEM 4) Triangle - Right Justified
// Draw right angled triangle of given height
// Sample input:
// 4
// Sample output
//    4
//   34
//  234
// 1234
import static java.lang.System.*;
import java.util.*;

public class Prob04 {

	public static void main(String[] args) {

		Scanner input = new Scanner(in);

		out.print("Enter hight: ");
		int h = input.nextInt();

		for(int i=0; i<h; i++) {

			int j=1;
			for(; j<h-i; j++) {

				out.print(" ");
			}

			for(;j<=h;j++) {

				out.print(j);
			}
			out.println();
		}

		out.println();
	}
}