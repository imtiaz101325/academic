//Program to calculate addition, substraction, product and quotient of two integers, SK. Imtiaz Ahmed, 4/12/14, 2:22pm

import java.util.Scanner;

public class Arithmatic
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );

		int x, y, add, sub, pro, quo;

		System.out.print( "Enter first integer: ");
		x = input.nextInt();

		System.out.print( "Enter second integer: ");
		y = input.nextInt();

		add = x + y;
		sub = x - y;
		pro = x * y;
		quo = x / y;

		System.out.printf( "The addition of %d and %d is %d\n", x, y, add);
		System.out.printf( "The substrastion of %d and %d is %d\n", x, y, sub);
		System.out.printf( "The produst of %d and %d is %d\n", x, y, pro);
		System.out.printf( "The quotient of %d and %d is %d\n", x, y, quo);

	}

}
