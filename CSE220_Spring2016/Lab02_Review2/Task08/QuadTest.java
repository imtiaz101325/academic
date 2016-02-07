import java.util.Scanner;

public class QuadTest{

	public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
		
              System.out.println("Enter the co-efficients of a quadratic equation: ");
       System.out.print("a :");
       int coOne = input.nextInt();
       System.out.println();
       System.out.print("b :");
       int coTwo = input.nextInt();
       System.out.println();
       System.out.print("c :");
       QuadEqn qn = new QuadEqn(coOne, coTwo, input.nextInt());
       System.out.println();
       
       System.out.println("The quadratic equation is: "+qn);
       System.out.println("The first root of the equation is: "+qn.firstRoot());
    }
}