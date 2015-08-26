//takes two integers and shows which is greater, Sk. Imtiaz Ahmed, 5/12/14, 4:49am

import java.util.Scanner;

public class Greater
{
	public static void main( String[] args )
	{
		int x, y;

		Scanner input = new Scanner( System.in );

		System.out.print( "Enter first integer: ");
		x = input.nextInt();

		System.out.print( "Enter second integer: ");
		y = input.nextInt();

		if ( x > y )
			System.out.printf( "%d is greater.\n", x);
		if ( y > x )
			System.out.printf( "%d is greater\n.", y);
		if ( x == y )
			System.out.println( "The numbers are equal.");


	}
}
