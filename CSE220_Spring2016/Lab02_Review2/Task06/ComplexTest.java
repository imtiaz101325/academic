import java.util.Scanner;

public ComplexTest{

	public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
	
       System.out.println("Enter a complex number: ");
       System.out.print("x: ");
       int realPart = input.nextInt();
       System.out.println();
       System.out.print("y: ");
       ComplexNumber xY = new ComplexNumber(realPart, input.nextInt());
       System.out.println();
       }
       
       System.out.println("Entered complex number: "+xY);
       System.out.println("Calling increase value...");
       xY.increaseValue();
       System.out.println("Entered complex number is now: "+xY);
       System.out.println("Polar radius of the complex number is: "+xY.polarRadius());
   }