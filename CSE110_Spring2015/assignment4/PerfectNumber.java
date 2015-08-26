import static java.lang.System.*;
import java.util.*;

public class PerfectNumber
{
    public static void main(String[] args)
    {
        for(int n=1; n<=500; n++)
        {
            int bucket = 0;
            
            for(int c=1; c<n; c++)
            {
                if(n%c==0)
                    bucket +=c;
            }
            
            if(n==bucket)
                out.println(n);
        }
    }
}