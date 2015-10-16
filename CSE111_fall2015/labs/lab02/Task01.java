//16-09-15 Wednessday
//Sk. Imtiaz Ahmed
//CSE11 lab work for Tamal Adhikary BRAC University
//Lab 2
//Task 1:
//
//(a) Change the following System.out.println() to a System.out.printf() method so that the 
//output is 5.984807753012208
//
//double z;
//z = 5+ Math.sin(80*Math.PI/180);
//System.out.println(z);
//
//(b) Change the following System.out.println() to a System.out.printf() method so that the 
//output is 5.9848 instead of 5.984807753012208
//
//double z;
//z = 5+ Math.sin(80*Math.PI/180);
//System.out.println(z);

import static java.lang.System.*;
import java.util.*;

public class Task01 {
    
    public static void main(String[] args) {
        
        double z;
        z = 5+ Math.sin(80*Math.PI/180);
        System.out.printf("%.15f\n",z);
        
        z = 5+ Math.sin(80*Math.PI/180);
        System.out.printf("%.4f\n", z);
    }
}