//31/3/2015
//Sk. Imtiaz Ahmed
//Assignment 4 for Annajiat Rasel-CSE110
//How to Solve it by Computer -R. G. Dromey
//prime nubers form sieve of Eratosthenes

import static java.lang.System.*;
import java.util.*;

public class Prob3_4
{
    public static void main(String[] args)
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

        
        
        Scanner k = new Scanner(in);//Scanner object
        
        //ask user for target
        out.print("Please enter a number: ");
        int n = k.nextInt();
        
        //unsure about the size of the array. 100 for now
        int[] primes = new int[100];//array of primes
        int[] multiples = new int[100];//array of multiples
        
        //first three primes
        primes[0]=2;
        primes[1]=3;
        primes[2]=5;
        //1 is not a prime
        
        //if n is smaller than 5 check if it's one of the first 3
        for(int i=0;i<3; i++)
        {
            if(primes[i]==n)
                out.println(n+" is a prime.");
        }
        
        
        int limit = 2;//the index of the largest prime less than or equal to root x
        int primeSquareLimit = primes[limit]*primes[limit];//next prime indicator
        int x = 5;//hold the odd serise of possible primes i.e:5, 7, 11, 13, 17
        int dx = 2;//increments x by 2s and 4s
        boolean prime,found=false;//says if current x is prime
        int rootn = (int) Math.sqrt(n);//limit to which matches need to be made
        
        //main loop
        for(int i=2; x<n;)
        {
            x = x+dx;
            dx = 6-dx;           
            
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
                if(x==n)
                {
                    found = true;
                    out.println(n+" is a prime.");
                }
                //if current prime is less than root of n store it
                if(x<=rootn)
                {
                    i++;
                    primes[i]=x;
                }
            }
        }

        if(!found)
            out.println(n+" is not a prime.");
    }
}






