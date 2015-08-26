//April 7, 2015
//Sk. Imtiaz Ahmed
//Lab tasks for Md. Shamsul Kaonain CSE110
//Task 02: Student class

import static java.lang.System.*;
import java.util.*;

public class StudentTester
{
	public static void main(String[] args) 
	{
		//three instences of Student
		Student john = new Student();
		Student mike = new Student();
		Student carol = new Student();

		//setting values using public methods
		john.setName("John Lynche");
		john.setID("1504112");
		john.setAddress("31, Wilson Street, West Caroline");
		john.setCGPA(3.5);

		mike.setName("Mike Tyson");
		mike.setID("1504121");
		mike.setAddress("55, Chirchil Avenue, East Cost");
		mike.setCGPA(2.9);

		carol.setName("Carol McLaurance");
		carol.setID("1504877");
		carol.setAddress("100, Downtown Avenue, East Virginia");
		carol.setCGPA(4.0);


		//printing out information
		out.println(john.getName());
		out.println(john.getID());
		out.println(john.getAddress());
		out.println(john.getCGPA());

		out.println();

		out.println(mike.getName());
		out.println(mike.getID());
		out.println(mike.getAddress());
		out.println(mike.getCGPA());

		out.println();

		out.println(carol.getName());
		out.println(carol.getID());
		out.println(carol.getAddress());
		out.println(carol.getCGPA());
	}
}