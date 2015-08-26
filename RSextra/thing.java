import static java.lang.System.*;
import java.util.*;

public class thing
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(in);
        
        out.print("Enter hight: ");
        int h = sc.nextInt();
        
        for(int i=1; i<=h; i++)
        {
            for(int j=1; j<=h-i; j++)//space loop
            {
                out.print(" ");
            }
            for(int j=1; j<=i; j++)//star loop
            {
                if(j==1 || j==i)
                {
                    out.print("*");
                }
                else if(i==h)
                {
                    out.print("*");
                }
                else
                {
                    out.print(" ");
                }
            }
            for(int j=1; j<=h; j++)
            {
                if(i==1 || i==h)
                {
                    out.print("*");
                }
                else if(j==h)
                {
                    out.print("*");
                }
                else
                {
                    out.print(" ");
                }
            }
            for(int j=2; j<=i; j++)
            {
                if(j==1 || j==i)
                {
                    out.print("*");
                }
                else if(i==h)
                {
                    out.print("*");
                }
                else
                {
                    out.print(" ");
                }
            }
            out.println();
        }
    }
}