import static java.lang.System.*;
import java.util.*;

public class Ques11
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(in);

		out.printf("Enter the starting value of a geometric series: ");

		int start = input.nextInt();

		out.printf("Enter the gometric step by which the series will change: ");

		int change = input.nextInt();

		out.printf("Enter the ending value of the series: ");

		int stop = input.nextInt();

		for(int i=start, j=change; i<=stop; i*=j)
		{
			out.printf("%d\n", i);
		}
	}
}
