import static java.lang.System.*;
import java.util.*;

public class Ques7
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner(in);

		out.printf("Please provide the marks: ");

		double mark = input.nextInt();

		out.printf("Please provide the scale out of which the mark is counted: ");

		int currentscale = input.nextInt();

		out.printf("Please provide the scale to which the mark will be converted: ");

		int targetscale = input.nextInt();

		mark = targetscale*mark/currentscale;

		out.printf("The mark converthed to the scale provided is: %.2f\n", mark);
	}
}
