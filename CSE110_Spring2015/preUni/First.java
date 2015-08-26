//1000
//Sk. Imtiaz Ahmed. @excalliburbd 12/01/15
import java.util.*;
import java.io.*;

public class First
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner(System.in);
		PrintWriter out = new PrintWriter( System.out);

		int cases = input.nextInt();
		int result = 0;

		for(int i=0 ; i<cases ; i++)
		{
			result = input.nextInt()+input.nextInt();
			out.printf("Case %d: %d\n", i+1, result);
			out.flush();
		}
	
	}
}
