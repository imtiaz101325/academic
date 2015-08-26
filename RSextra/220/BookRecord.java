import static java.lang.System.*;
import java.util.*;

public class BookRecord
{
	Book[] BookArray = new Book[100];

	public void AddRecord()
	{
		Boolean empty = True;

		Book temp = new Book();

		out.println("Enter the books name:");
		temp.Name = input.next();
		out.println("Enter the books id:");
		temp.Id = input.next();
		out.println("Enter the books.Author:");
		temp.Author = input.next();
		out.println("Enter the books Publisher:");
		temp.Publisher = input.next();


		for(int i = 0; i<BookArray.length; i++)
		{
			if(BookArray[i] == Null)
			{
				BookArray[i] = temp;
				empty = True;
			}
			else
			{
				
			}

				
		}
	}

	public void PrintRecord()
	{

	}

	public void DeleteRecord()
	{

	}

	public void EditRecord()
	{

	}


}