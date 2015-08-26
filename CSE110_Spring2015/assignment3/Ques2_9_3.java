//16/3/2015
//Sk. Imtiaz Ahmed
//Assignment 3 for Annajiat Rasel-CSE110
//How to Solve it by Computer -R. G. Dromey
//2.9.3: Given that all ascii codes are less than 128, design an algorithm that reads a
//given set of data and decides whether or not it may contain decimal data

import static java.lang.System.*;
import java.util.*;

public class Ques2_9_3 
{
    public static void main (String[] args) 
    {
        Scanner k = new Scanner (in);
        
        out.print("Enter something: ");
        String data = k.nextLine();//ask the user for set of characters
        
        //establish an array of 128 capacity
        int[] ascii = new int[128];
        boolean hasData = false;//becomes true once we look for decimals
        
        //for each character in the string do the following
        for(int i=0;i<data.length(); i++)
        {
            ascii[(int)data.charAt(i)]++;//casting the character and incrementing
            //consequtive positions int the ascii array
        }
        
        //checks the value of the ascii array for decimal characters
        for(int i=48; i<58; i++)
        {
            if(ascii[i]>0)//if there were decimal data in the string 
                hasData = true;//this happens
        }
        
//         //special case ".123 ... "
//         //checks if the character after the '.' has 0-9
//         //0-9 has the ascii value greater than 47 and less than 58
//         if(data.charAt(0) == '.' && ((int)data.charAt(1)>47 && (int)data.charAt(1)<58))
//          hasData = true; 
        
        if(hasData)//prints out the result
            out.println("The input has some decimal data.");
        else
            out.println("The input dose not have any decimal data.");
    }
} 