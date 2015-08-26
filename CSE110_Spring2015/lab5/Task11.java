//Sk. Imtiaz Ahmed
//March 27, 2015
//Lab task for Md. Shamsul Kaonain CSE110
//Task 11: Write a Java program which adds all numbers that are multiples of 
//either 7 or 9 up to 600. Ensure that numbers like 63 are added only once in the sum

import static java.lang.System.*;
import java.util.*;

public class Task11
{
	public static void main(String[] args)
	{
		int sum = 0;//holds the sum of numbers

		for(int i=1; i<=600; i++)//generates numbers upto 600
		{
			//either 7
			if(i%7==0)
				sum+=i;
			//or 9
			else if(i%9==0)
				sum+=i;
		}

		out.println(sum);//output


	}
}
