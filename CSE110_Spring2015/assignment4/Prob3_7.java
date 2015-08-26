//2/4/2015
//Sk. Imtiaz Ahmed
//Assignment 3 for Annajiat Rasel-CSE110
//How to Solve it by Computer -R. G. Dromey
//efficient power generating algorithm
import static java.lang.System.*;
import java.util.*;


public class Prob3_7
{
	public static void main(String[] args) 
	{
		Scanner k = new Scanner(in);

		out.print("Enter base: ");
		int base = k.nextInt();

		out.print("Enter power: ");
		int power = k.nextInt();

		int product = 1;
		int pow = base;

		while(power>0)
		{
			if(power%2==1)
			{
				product *= pow;
			}

			power /= 2;

			pow *= pow;

			
		}

		out.println(product);
		
	}

}
