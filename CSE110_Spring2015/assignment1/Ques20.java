import static java.lang.System.*;
import java.util.*;

public class Ques20 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(in);

		out.printf("Enter upto what term to print the series: ");

		int n = input.nextInt();

		int series = 1;

		for(int i=0; i<n; i++)
		{
			out.printf("%d\n", series);

			series *= -1;		
		}
	}
}
