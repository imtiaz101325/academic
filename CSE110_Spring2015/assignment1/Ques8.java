import static java.lang.System.*;
import java.util.*;

public class Ques8
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(in);

		out.printf("Please provide a year: ");

		int year = input.nextInt();

		out.printf("How many times to show the year: ");

		int times = input.nextInt();

		for(int i=0; i<times; i++)
			out.printf("%d\n",year);

	}
}
