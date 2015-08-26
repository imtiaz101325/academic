import static java.lang.System.*;
import java.util.*;

public class Ques10
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(in);

		out.printf("Enter the starting value of an arithmatic series: ");

		int start = input.nextInt();

		out.printf("Enter the arithmatic step by which the series will change: ");

		int change = input.nextInt();

		out.printf("Enter the ending value of the series: ");

		int stop = input.nextInt();

		for(int i=start; i <= stop; i=i+change )
		{
			out.printf("%d\n", i);
		}
	}
}
