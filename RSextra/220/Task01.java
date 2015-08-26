import static java.lang.System.*;
import java.util.*;

public class Task01
{

	public static void main(String[] args)
	{

		Scanner input = new Scanner(in);
		BookRecord rec = new BookRecord();

		out.println("BU Book Records");

		Boolean cont = True;

		while cont
		{
			out.println("Enter 1 to Add a Record");
			out.println("Enter 2 to Print the Records");
			out.println("Enter 3 to Delete a Record");
			out.println("Enter 4 to Edit a Record");

			int choice = input.nextInt();

			switch(choice)
			{
				case 1:
					rec.AddRecord();
					break;

				case 2:
					rec.PrintRecord();
					break;

				case 3:
					rec.DeleteRecord();
					break;

				case 4:
					rec.EditRecord();
					break;

				default:
					out.println("Select form 1-4");
					break;

			}

			out.println("Do you want to continue?(y/n)");

			String marker = input.next();

			if(marker.equals("y")
			{
				cont = True;
			}
			else
			{
				cont = False;
			}

		}

	}
}