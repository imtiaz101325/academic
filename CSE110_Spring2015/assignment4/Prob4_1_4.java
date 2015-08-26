//2/4/2015
//Sk. Imtiaz Ahmed
//Assignment 3 for Annajiat Rasel-CSE110
//How to Solve it by Computer -R. G. Dromey
//arary with odds and evens (indexes) places together

import static java.lang.System.*;
import java.util.*;


public class Prob4_1_4
{
    public static void main(String[] args) 
    {
        Scanner k = new Scanner(in);
        
        out.print("Please enter how many elements: ");
        int n = k.nextInt();
        
        int[] ara = new int[n];
        
        for(int i=0; i<ara.length; i++)
        {
            out.print("Please enter next number: ");
            ara[i] = k.nextInt();
        }
        
        int halfIndex = ara.length/2;
        int[] odds;
        int[] evens;
        if(ara.length%2!=0)
        {
            odds = new int[halfIndex+1];
            evens = new int[halfIndex];
        }
        else
        {
            odds = new int[halfIndex];
            evens = new int[halfIndex];
        }
        
        for(int i=1,j=0; i<=ara.length; i++)
        {
            if(i%2==0)
            {
                evens[j]=ara[i-1];
                j++;
            }
            else
            {
                odds[j]=ara[i-1];
            }
            
        }
        
        for(int i=0; i<odds.length;i++)
        {
            ara[i]=odds[i];
        }
        for(int i=odds.length,j=0; i<ara.length;i++,j++)
        {
            ara[i]=evens[j];
        }
        
        out.print("[ ");
        for(int each: ara)
        {
            out.print(each+" ");
        }
        out.println("]");
    }
}