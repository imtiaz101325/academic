//programm to find avarage of three integers, Sk. Imtiaz Ahmed, 5/12/14, 05:05pm

import java.util.Scanner;

public class Avrg
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );

		int x, y, z, avg;

		System.out.print( "Enter first integer: ");
		x = input.nextInt();

		System.out.print( "Enter second integer: ");
		y = input.nextInt();

		System.out.print( "Enter third integer: ");
		z = input.nextInt();

		avg = (x+y+z)/3;

		System.out.printf( "The average of the three integer is %d.\n", avg);
	
	}


}
