//1001
//Sk. Imtiaz Ahmed. @excalliburbd 12/01/15
import java.io.*;
import java.util.*;

class Second
{
	public static void main( String[] args )
	{

		Scanner input = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int init = input.nextInt();

		for( int i=0; i<init; i++)
		{
			int probs = input.nextInt();
			if( probs < 10 )
			{
				System.out.printf("%d %d\n", 0, probs);
				out.flush();
			}
			if( probs >= 10 && probs%2 == 0 )
			{
				probs = probs/2;
				System.out.printf("%d %d\n", probs, probs);
				out.flush();
			}
			if( probs > 10 && probs%2 != 0 )
			{	
				probs = (probs-1)/2;
				System.out.printf("%d %d\n", probs, probs+1);
				out.flush();
			}
			
		}
	
	}
}
