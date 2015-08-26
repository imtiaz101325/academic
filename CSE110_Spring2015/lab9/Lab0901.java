//Sk. Imtiaz Ahmed
//March 27, 2015
//Lab task for Md. Shamsul Kaonain CSE110
//Task 01: Change the following System.out.println

import static java.lang.System.*;
import java.util.*;

public class Lab0901
{
    public static void main(String[] args)
    {
    	double z;
        z = 5+ Math.sin(80*Math.PI/180);
        System.out.printf("%f\n",z);//modified printf
        
        z = 5+ Math.sin(80*Math.PI/180);
        System.out.printf("%.4f\n",z);//modified printf     
    }
}