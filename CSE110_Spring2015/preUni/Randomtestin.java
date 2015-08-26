import java.util.Scanner;

public class Randomtestin
{
	public static int product;

	public static void main( String[] args )
	{


		Scanner input = new Scanner(System.in);
		product = input.nextInt();

		while ( product <= 100 )
			product = 3 * product;
		System.out.println(product);
	
	}

}
