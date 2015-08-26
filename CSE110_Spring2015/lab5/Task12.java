//Sk. Imtiaz Ahmed
//March 27, 2015
//Lab task for Md. Shamsul Kaonain CSE110
//Task 12: Write a Java program which adds all numbers that are multiples of 
//either 7 or 9 but not both, up to 600

import static java.lang.System.*;
import java.util.*;

public class Task12
{
	public static void main(String[] args)
	{
		
		int sum=0;//holds the sum of numbers

		for(int i=1; i<=600; i++)//generates numbers upto 600
		{
			if(i%7==0)//either 7
			{
				if(i%9!=0)//but not both
					sum+=i;
			}//or 9
			else if(i%9==0)
				sum+=i;
		}

		out.println(sum);//output

	}
}
