//a programm to return perfect numbers upto 1600

import static java.lang.System.*;

public class PerfectNum
{
  public static void main(String[] args)
  {
    for(int n=1; n<=1600;n++)//main loop
    {
      int b=0;//bucket to store multiples
      
      for(int c=1;c<n;c++)
      {
        if(n%c==0)
          b=b+c;//if a multiple is found, store in bucket
      }
      
      if(b==1)
        out.println(n);//if no multiples were found then print number as perfect
    }
  }
}
