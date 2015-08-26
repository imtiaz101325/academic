//prints the product of three integers, Sk. Imtiaz Ahmed, 2/12/14 11:07pm

import java.util.Scanner;

public class Product



{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );

		int x, y, z, result;

		System.out.print( "Enter first integer: ");
		x = input.nextInt();

		System.out.print( "Enter second integer: " );
		y = input.nextInt();

		System.out.print("Enter third integer: ");
		z = input.nextInt();

		result = x*y*z;

		System.out.printf( "The product of %d, %d and %d is %d\n", x, y, z, result);


	}

}
