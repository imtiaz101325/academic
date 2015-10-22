//19/10/2015
//Sk. Imtiaz Ahmed || @excalliburbd
//Self practice for CSE220: Datastructure

import static java.lang.System.*;
import java.util.*;

public class BookTesterClass {

	public static void main(String[] args) {

		Scanner input = new Scanner(in);
		BookRecords records = new BookRecords();

		for(int i=0; i<1; i++) {

			out.println("Enter 1 to Add a Record");
			out.println("Enter 2 to Print the Records");
			out.println("Enter 3 to Delete a Record");
			out.println("Enter 4 to Edit a Record");

			int choice = input.nextInt();
			input.nextLine();

			switch (choice) {

				case 1: 

					out.print("Name of the Book: ");
					String n = input.nextLine();
					out.print("ID: ");
					String id = input.nextLine();
					out.print("Author: ");
					String a = input.nextLine();
					out.print("Publisher: ");
					String p = input.nextLine();

					records.addRecord(n, id, a, p);
					break;
				case 2:

					records.printRecord();
					break;

				case 3:

					out.print("Enter an ID: ");
					records.deleteRecord(input.nextLine());
					break;
				case 4:

					out.print("Enter an ID: ");
					String bookID = input.nextLine();

					Book temp = records.editRecord(bookID);

					if(temp != null) {

						out.println("The record is: ");

						out.println(temp.getName());
						out.println(temp.getID());
						out.println(temp.getAuthor());
						out.println(temp.getPublisher());

						out.println("Enter changes: ");

						out.print("Name: ");
						temp.setName(input.nextLine());
						out.print("ID: ");
						temp.setID(input.nextLine());
						out.print("Author: ");
						temp.setAuthor(input.nextLine());
						out.print("Publisher: ");
						temp.setPublisher(input.nextLine());

					}

					break;

				default: 

					out.println("Please enter a valid option ^_^");

			}

			out.println("Continue?(Y/y): ");
			String temp = input.nextLine();

			if(temp.equals("Y") || temp.equals("y")) {

				i--;
			}else {

				i++;
				out.println("Have a nice day :)");
			}



		}
	}
}