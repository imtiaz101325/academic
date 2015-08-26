import static java.lang.System.*;
import java.util.*;
public class Probnob{
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        out.println("Enter number");
        int number = sc.nextInt();
        int prime = 0;
        int count=2;
        int i = 1;
        while (i<number) {
            
            if (number%count==0) {
                prime++;
            }
            count++;
            i++;
        }
        if (number==1){
            out.println("Prime number");
        }
        else if(prime==1){
            out.println("Prime number");
        }
        else {
            out.println("Not a prime number");
        }     
    }
}