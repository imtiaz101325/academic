//11/04/15
//Sk. Imtiaz Ahemd
//excalliburbd@gmail.com
//Pre-final self pratice work

import static java.lang.System.*;
import java.util.*;

public class QuadEqnUser 
{
    public static void main (String[] args) 
    {
     Scanner input = new Scanner(in);
        QuadEqn q = new QuadEqn();

        out.print("Please enter the there coefficients of a qudratic equation: ");
        q.a = input.nextInt();
        q.b = input.nextInt();
        q.c = input.nextInt();

        out.println(q);

        out.println(q.rootEqn());

    }
}