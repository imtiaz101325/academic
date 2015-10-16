//08-09-15 Tuesday
//Sk. Imtiaz Ahmed
//excalliburbd@gmail.com
//Assignment for for Md. Shamsul Kaonain CSE111 BRAC University
// Task 21: Change the following System.out.println() to a System.out.printf() method.
// Current output:5.984807753012208
// Desired output after the change: 5.9848

import static java.lang.System.*;
import java.util.*;

public class Task21 {

	public static void main(String[] args) {
		
		double z;
		z = 5+ Math.sin(80*Math.PI/180);
		out.printf("%.4f\n", z);
	}
}