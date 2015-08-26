//1/4/2015
//Sk. Imtiaz Ahmed
//Assignment 4 for Annajiat Rasel-CSE110
//How to Solve it by Computer -R. G. Dromey
//Finding prime factors(modified)

import static java.lang.System.*;
import java.util.*;

public class Prob3_5_1mod
{
    public static int eratosthenes(int current)
    {
        //algo
        /*1.Intialize first 3 primes. 
         Also initialize the square of the third prime
         2.Initialize x to 5
         3.While x less than n do 
          (a)get next x value excluding multiples of 2 and 3
          (b)if not past end of multiples list then
           1.if x is >= square of largest prime then
            a)include next prime multiple as its square
            b)update square by squaring next prime > root of x
          (c)while have not established x is non-prime with valid prime multiples do
          1. while current prime multiple is less than x, increament by current 
          prime value doubled
           2. do prime test by comparing x with current multiple
          (d)if current x prime then write out x and if it is less that root of n store it
                   
               
        //This problem has two parts
        // 1.generate x and test against all primes less than equal to root x
        // 2.store if less than equal root n
        */

        int n = 10000;

        //unsure about the size of the array. 100 for now
        int[] primes = new int[100];//array of primes
        int[] multiples = new int[100];//array of multiples
        
        //first three primes
        primes[0]=2;
        primes[1]=3;
        primes[2]=5;
        //1 is not a prime
        
        //if n is smaller than 5 check if it's one of the first 3
        if(current==2)
            return primes[1];
        else if(current==3)
            return primes[2];
        
        
        int limit = 2;//the index of the largest prime less than or equal to root x
        int primeSquareLimit = primes[limit]*primes[limit];//next prime indicator
        int x = 5;//hold the odd serise of possible primes i.e:5, 7, 11, 13, 17
        int dx = 2;//increments x by 2s and 4s
        boolean prime, flag=false;//says if current x is prime
        int rootn = (int) Math.sqrt(n);//limit to which matches need to be made
        //int set=1;
        //main loop
        for(int i=2; x<n;)
        {
            x = x+dx;
            dx = 6-dx;   

            if(current==5)
                return x;        
            
            //when testing x for prime 
            //a condition to use the next prime for tesiting x if limit exceeds
            if(limit<=i && x>=primeSquareLimit)
            { 
                multiples[limit] = primeSquareLimit;
                limit++;
                if(limit<=i)
                {
                    primeSquareLimit = primes[limit]*primes[limit]; 
                }
            }
            
            //a number theroy result to test if prime exists is 
            //primes[i]<(primes[i-1]*primes[i-1])
            
            //prime checking mechanism
            //needs an array 'multiple'
            //generate multiple of prime by prime + 2*prime 
            //if currtent multiple is not x then prime
            prime = true;
            for(int j=2; prime && j<limit; j++)
            {
                if(multiples[j]<x)
                    multiples[j] += (primes[j]*2);
                
                prime = x!=multiples[j];

            }
            
            if(prime)
            {

                if(flag)
                {
                    return x;
                }
                //if(x==n)
                //    return n;
                //if current prime is less than root of n store it
                if(x<=rootn)
                {
                    if(x==current)
                    {
                        flag = true;
                    }
                    i++;
                    primes[i]=x;
                }
            }
        }
    return 1;
    }

    public static void main(String[] args) 
    {
        /*algo
        1.Establish n the number whose prime factors are sought
        2.Compute the reaminder r and quotient q for the first prime
        3.while it is not established that n is prime do
            a) if current prime is an exact divisor of n then
                1. save current prime as a factor f
                2. reduce n by current prime
            b) Compute the reaminder r and quotient q for current n and prime
        4.if n is greater than 1 then
            add n to list as prime factor f
        5.return prime factor

        */

        Scanner k = new Scanner(in);
        out.print("Enter number: ");
        int n = k.nextInt();//the number to find prime factor

        int nextprime =2;

        int q = n/nextprime;
        int r = n%nextprime;
        int i = -1;
        int[] factors = new int[100];

        while(n!=nextprime)
        {
            out.println(n);
            out.println(q);
            out.println(r);
            if(r==0)
            {
                i++;
                factors[i]= nextprime;
                n = q;
                q = n/nextprime;
                r = n%nextprime;
            }
            else
            {
                nextprime = eratosthenes(nextprime);
                q = n/nextprime;
                r = n%nextprime;
            }
        }

        out.println(n);
        out.println(q);
        out.println(r);

        if(n>1)
        {
            i++;
            factors[i]=n;
        }

        for(int each: factors)
        {
            if(each!=0)
            {
                out.print(each+" ");
            }
            else
            {
                out.println();
                break;
            }
        }
        
    }
}
