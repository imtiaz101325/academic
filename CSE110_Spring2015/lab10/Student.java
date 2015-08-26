//April 7, 2015
//Sk. Imtiaz Ahmed
//Lab tasks for Md. Shamsul Kaonain CSE110
//Task 02: Student class

import static java.lang.System.*;
import java.util.*;

public class Student
{
	//public fields
	public String name;
	public String id;
	public String address;
	public double cgpa;

	//public methods
	public String getName()
	{
		return name;
	}

	public void setName(String n)
	{
		name = n;
	}

	public String getID()
	{
		return id;
	}

	public void setID(String i)
	{
		id = i;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String a)
	{
		address = a;
	}

	public double getCGPA()
	{
		return cgpa;
	}

	public void setCGPA(double c)
	{
		cgpa = c;
	}
}
