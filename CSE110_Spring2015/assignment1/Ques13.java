import static java.lang.System.*;
import java.util.*;

public class Ques13 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(in);

		out.printf("Enter the number of students: ");

		int num = input.nextInt();

		int count = num;

		for(int i=0; i<num; i++)
		{
			out.printf("Enter the mark: ");
			
			int mark = input.nextInt();

			if(mark<=50)
				count--;
		}

		out.printf("%d number of students passed.\n", count);
	}
}
