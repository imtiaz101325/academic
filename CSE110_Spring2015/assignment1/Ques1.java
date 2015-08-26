import static java.lang.System.*;
import java.util.*;

public class Ques1
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner(in);

		out.printf("Enter the hour of the day: ");

		int hour = input.nextInt();

		if(hour > 23)
			out.println("Wrong time");
		else
			if(hour < 0)
				out.println("Wrong time");
		        else
				if(hour <= 3)
					out.println("Patience is a virtue");
				else
					if(hour <= 6)
						out.println("Breakfast");
					else
						if(hour <= 11)
							out.println("Patience is a virtue");
						else
							if(hour <= 13)
								out.println("Lunch");
							else
								if(hour <= 15)
									out.println("Patience is a virtue");
								else
									if(hour <= 17)
										out.println("Snaks");
									else
										if(hour <= 18)
											out.println("Patience is a virtue");
										else
											if(hour <= 20)
												out.println("Dinner");
											else
												out.println("Patience is a virtue");





	}
}
