import static java.lang.System.*;
import java.util.*;

public class Ques19 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(in);

		out.printf("Enter upto what term to print the series: ");

		int n = input.nextInt();

		int sum = 1;

		for(int i = 0,j=10; i<n;i++,j-- )
		{
			out.printf("%d\n", sum);

			sum += i+j;	
	
		}
	}
}
