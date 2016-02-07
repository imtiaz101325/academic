/*
BRCU CSE220 Spring16
Lab01
Sk. Imtiaz Ahmed
15101054
skimtiazahmedbracu@gmail.com
*/

import java.util.Scanner;

public class LAB01_15101054 {

 
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);//do not comment out this line
        
        /*The lab work is executed in a single main method plese comment out the
        all other tasks to check individually. The arrays used in the main method
        are named txAx to avoid using the same array in different tasks.
        */
        
        /*Task 1:

        Given an array of ints, return true if 6 appears as either the first or.
        Last element in the array. The array will be length 1 or more. 

        firstLast6({1, 2, 6}) → true
        firstLast6({6, 1, 2, 3}) → true
        firstLast6({13, 6, 1, 2, 3}) → false*/
        
        System.out.println("**************** TASK01 ********************");
        
        int[] t1A1 = {1, 2, 6};
        int[] t1A2 = {6, 1, 2, 3};
        int[] t1A3 = {13, 6, 1, 2, 3};
        System.out.println(task01(t1A1));
        System.out.println(task01(t1A2));
        System.out.println(task01(t1A3));
        
        /*Task 2: 
        Read in 10 input from the keyboard, and store them in an array. Find 
        the position (or index) of the maximum and minimum values in the array,
        and swap them (move the biggest element to the position of the smallest,
        and move the smallest element to the position of the biggest) and print 
        that again. If the user enters 7, 13, -5, 10, 6 then your program should
        print 7,-5,13,10,6*/

        
        System.out.println("**************** TASK02 ********************");
        
        int[] t2A1 = new int[10];
        System.out.println("Reading 10 inputs: ");
        
        for(int i =0; i<t2A1.length; i++) {
            
            System.out.print((i+1)+" : ");
            t2A1[i] = input.nextInt();
            
        }
        
        task02(t2A1);
        
        /*Task 3:
        Write a program which reads 5 numbers into an array sorts/arranges the
        numbers from low to high and prints all numbers in the array and the 
        even number in that list.If the user enters 7, 13, 2, 10, 6 then your 
        program should print 13, 10, 7, 6, 2,10 ,6 ,2 .*/
        
        System.out.println("**************** TASK03 ********************");
        
        int[] t3A1 = new int[5];
        System.out.println("Reading 5 inputs: ");
        
        for(int i =0; i<t3A1.length; i++) {
            
            System.out.print((i+1)+" : ");
            t3A1[i] = input.nextInt();
            
        }
        
        task03(t3A1);
        
        /*Task 4:
        Write a Java program that would ask the user to enter ten numbers. As 
        the user enters the ten numbers the program will make sure that all the 
        numbers entered by the user are unique. For example if the user enters 
        2, 3, 4, 6, and then tries to enter 3 again the program will display 
        that 3 is already in among the entered numbers and would ask the user 
        to enter a new number.*/
        

        int[] t4A1 = new int[10];
        System.out.println("Reading 10 inputs: ");
        
        for(int i =0; i<t4A1.length; i++) {
            
            System.out.print((i+1)+" : ");
            int temp = input.nextInt();
            
            for(int j=0; j<i; j++){
                
                if(t4A1[j] == temp) {
                    
                    System.out.println("This has already been entered!");
                    i--;
                    break;
                }
            }
            
            t4A1[i] = temp;
            
        }
        
        System.out.println("**************** TASK05 ********************");
        
        /*Task 5:
        Write a Java program that would ask the user to enter 15 numbers. All 
        the numbers are between 0 to 9.  The program should count how many time
        the number been given.In the Input: 1,1,2,5,6,8,7,2,4,6,9,4,2,5,6
        Output should look like: 
                0 was found 0 times
                1 was found 2 times
                2 was found 3 times
                3 was found 0 times
                4 was found 2 times
                5 was found 2 times
                6 was found 3 times
                7 was found 1 times
                8 was found 1 times
                9 was found 1 times
         Hint: Using an array, use the element a[n] to count 
         frequency / occurrence of the number n.*/

        int[] t5A1 = new int[10];
        System.out.println("Reading 15 inputs between 0-9: ");
        
        boolean okay = false;
        int temp = 0;
        
        for(int i =0; i<15; i++) {
                                   
            okay = false;            
            while(!okay){//for input handeling
                
                System.out.print((i+1)+" : ");                
                temp = input.nextInt();
                
                if(temp > 9 || temp < 0) {
                    
                    System.out.println("Invalid input! Plese enter an integer between 0-9");
                }else {
                    
                    okay = true;
                    t5A1[temp]++;
                }
            }            
        }
        
        System.out.println();
        
        System.out.println("Outputting frequency: ");
        
        for(int i=0; i<10; i++) {
            
            System.out.println(i+" was entered "+t5A1[i]+" times");
        }
        
        /*Task 6:
        An array is a palindrome if it reads the same in both directions. For example,
        3 5 7 2 4 is not a palindrome; however, the following one is. 4 2 6 2 4
        Write a program that reads in an array and checks if it is a palindrome
        */
        
        int[] t6A1 = {1, 2, 3, 2, 1};
        int[] t6A2 = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        int[] t6A3 = {1, 2, 2, 1};
        int[] t6A4 = {1, 2, 2, 1, 4};
        
        task6(t6A1);
        task6(t6A2);
        task6(t6A3);
        task6(t6A4);
        
        /*Task 7:
        Read 10 input from the user, and store them in an array. Then ask the 
        user to give another input between 0 and 9 for choosing an array cell. 
        Display a line with that many "*" characters. Eg. Say if the user enter 
        15,6,7,9,45,2,26,84,8,10 then the user again give input as 3 the output
        will be “ *********”*/

        System.out.println("**************** TASK07 ********************");
        
        int[] t7A1 = new int[10];
        System.out.println("Reading 10 inputs: ");
        
        for(int i =0; i<t7A1.length; i++) {
            
            System.out.print((i+1)+" : ");
            t7A1[i] = input.nextInt();
            
        }
        
        System.out.print("Enter an index: ");
        
        boolean interupt = false;
        int keep = 0;
        while(!interupt){
            
            keep = input.nextInt();
            
            if(keep<0 || keep>9){
                
                System.out.println("Invalid input! Index ranges from 0-9");
            }else{
                
                interupt = true;
            }
            
        }
        
        task7(t7A1[keep]);
        
        System.out.println("**************** TASK08 ********************");
        
        /*Task 8:

        Ask user for dimension/size of two row matrices, take all values in each matrix and print
        the summation. If matrices are A and B, then you need to calculate C=5A-B. For 
        example, if the user enters 3, then size of each matrix is 3. Then you need to take 3 values 
        for first matrix which will form A=[5  6  7]. Then take 3 values for second matrix, B=[2  
        3  4]. You need to print result, C=[23  27  31]. The output will be 23  27  31. You must 
        use array, loop (while or for), and array.length for this program.*/
        
        System.out.println("Enter the dimentions of the row matrices.");
        int dim = input.nextInt();
        
        int[] t8A1 = new int[dim];
        
        System.out.println("Reading matrix A inputs: ");
        
        for(int i =0; i<t8A1.length; i++) {
            
            System.out.print("A"+(i+1)+" : ");
            t8A1[i] = input.nextInt();
            
        }
        
        int[] t8A2 = new int[dim];
        
        System.out.println("Reading matrix B inputs: ");
        
        for(int i =0; i<t8A2.length; i++) {
            
            System.out.print("B"+(i+1)+" : ");
            t8A2[i] = input.nextInt();
            
        }
                
        task8(t8A1, t8A2);
       
        System.out.println("**************** TASK09 ********************");        
        
        /*Task 9: 
        Write a Java Code of a program that declares an array of integer type of 
        size 10 and takes input of your choice. Have the program print the 
        values, square all the values, and then display the new values. Write a 
        static method (in the same class as main method) to do the displaying 
        and a second static method to find out the squares. Have the methods 
        take the array name and the array size as arguments.*/
        
        System.out.println("Declaring integer array of size 10...");
        
        int[] t9A1 = new int[10];
        
        System.out.println("Reading 10 inputs: ");
        
        for(int i =0; i<t9A1.length; i++) {
            
            System.out.print((i+1)+" : ");
            t9A1[i] = input.nextInt();
            
        }
        
        System.out.println("Calling static method...");        
        task9(t9A1);
        
        
        System.out.println("**************** TASK10 ********************");        
        
        /*Task 10:
        Write a method named season that takes two integers as parameters 
        representing a month and day and that returns a String indicating the 
        season for that month and day. Assume that months are specified as an 
        integer between 1 and 12 (1 for January, 2 for February, and so on) and 
        that the day of the month is a number between 1 and 31. If the date 
        falls between 12/16 and 3/15, you should return "Winter". If the date 
        falls between 3/16 and 6/15, you should return "Spring". If the date 
        falls between 6/16 and 9/15, you should return "Summer". And if the date
        falls between 9/16 and 12/15, you should return "Fall".
        */
        
        boolean stop = false;
        int month=0, day=0;
        
        while(!stop) {
            System.out.print("Enter month(1-12): ");
            month = input.nextInt();
                       
            if(month < 1 || month > 12) {
                System.out.println("Invalid input! Month ranges from 1 to 12.");
            }else{
                
                stop = true;
            }
        }
        
        stop = false;
        
        while(!stop) {
            System.out.print("Enter day(1-12): ");
            day = input.nextInt();
            
            if(!(month == 1 || month == 3 || month == 5 || month == 7 || month == 8
                     || month == 10 || month == 12) && day == 31 ){
                
                System.out.println("Invalid input!"+"This month consists of 30 days.");
                
            }else if(month == 2){
                
                if(day == 30 || day == 31){
                    
                    System.out.println("Invalid input! February cannot have more than 29 days!");
                
                }else if(day == 29){
                    
                    System.out.println("Hope this is a leap year!");
                    stop = true;
                    
                }else{
                    
                    stop = true;
                    
                }
                
            }else if(day < 1 || day > 31) {
                System.out.println("Invalid input! Day ranges from 1 to 31.");
            }else{
                
                stop = true;
            }
        }
        
        season(month, day);
        
        System.out.println("**************** TASK11 ********************");        
        
        /*Task 11:
        Write a method named allDigitsOdd that returns whether every digit of a 
        positive integer is odd. Your method should return true if the number 
        consists entirely of odd digits and false if any of its digits are even.
        0, 2, 4, 6, and 8 are even digits, and 1, 3, 5, 7, 9 are odd digits.
        For example, allDigitsOdd(135319) returns true but allDigitsOdd(9145293)
        returns false.
        */
        
        System.out.print("Enter a positive integer: ");        
        int integer = input.nextInt();
        
        if(allDigitsOdd(integer)){
            
            System.out.println("All digits in this number are odd.");
        
        }else{
            
            System.out.println("All digits in this number are NOT odd.");
        }
        
        System.out.println("**************** TASK12 ********************");        
        
        /*Task 12:
        Write a method before that takes as parameters two month/day combinations 
        and that returns whether or not the first date comes before the second date 
        (true if the first month/day comes before the second month/day, false 
        if it does not). The method will take four integers as parameters that 
        represent the two month/day combinations. The first integer in each pair 
        represents the month and will be a value between 1 and 12 (1 for Janua  ry, 
        2 for February, etc, up to 12 for December). The second integer in each 
        pair represents the day of the month (a value between 1 and 31). One date 
        is considered to come before another if it comes earlier in the year.
        */
        
        int[][] t12A1 = new int[2][2];
        
        stop = false;
        
        for(int i=0; i<t12A1.length; i++) {
            
            stop = false;
                        
            while(!stop) {
                System.out.print("Enter month(1-12): ");
                t12A1[i][0] = input.nextInt();

                if(t12A1[i][0] < 1 || t12A1[i][0] > 12) {
                    System.out.println("Invalid input! Month ranges from 1 to 12.");
                }else{

                    stop = true;
                }
            }
            
            stop = false;

            while(!stop) {
                System.out.print("Enter day(1-12): ");
                t12A1[i][1] = input.nextInt();

                if(!(t12A1[i][0] == 1 || t12A1[i][0] == 3 || t12A1[i][0] == 5 || t12A1[i][0] == 7 || t12A1[i][0] == 8
                         || t12A1[i][0] == 10 || t12A1[i][0] == 12) && t12A1[i][1] == 31 ){

                    System.out.println("Invalid input!"+"This month consists of 30 days.");

                }else if(t12A1[i][0] == 2){

                    if(t12A1[i][1] == 30 || t12A1[i][1] == 31){

                        System.out.println("Invalid input! February cannot have more than 29 days!");

                    }else if(t12A1[i][1] == 29){

                        System.out.println("Hope this is a leap year!");
                        stop = true;

                    }else{

                        stop = true;

                    }

                }else if(t12A1[i][1] < 1 || t12A1[i][1] > 31) {
                    System.out.println("Invalid input! Day ranges from 1 to 31.");
                }else{

                    stop = true;
                }
            }
        }
        
        if(before(t12A1[0][0],t12A1[0][1], t12A1[1][0], t12A1[1][1])){
            
            System.out.println("First pair comes before.");
        }else{
            
            System.out.println("Second pair comes before.");
        }
        
        System.out.println("**************** TASK13 ********************");        
        
        /*Task 13:
        Write the removeOdd method bellow which take in an array of numbers that
        has even and odd numbers mixed. This function removes the odd numbers and
        returns a compact array which only has the even numbers. For example output
        of the following code is:
        21 33 44 66 11 1 88 45 10 9 
        44 66 88 10
        */
        int [] mixedArray = {21, 33, 44, 66, 11, 1, 88, 45, 10, 9};
        
        for (int i = 0; i < mixedArray.length; i++) {
          System.out.print(mixedArray[i] + " ");
        }
        
        System.out.println();
        
        int [] noOdd = removeOdd(mixedArray);
        
        for (int i = 0; i < noOdd.length; i++) {
          System.out.print(noOdd[i] + " ");
        }
        
   }
    
    static boolean task01(int[] numArray) {
        
        if(numArray[0] == 6 || numArray[numArray.length-1] == 6) {
            
            return true;
        } else {
            
            return false;
        }
    }

    static void task02(int[] ara) {
        
        System.out.println("Finding the index of the maximum value...");
        
        int maxPos = 0;
        
        for(int i=0; i<ara.length; i++) {
            
            if(ara[i] > ara[maxPos]) {
                
                maxPos = i;
            }
        }
        
        System.out.println("Index found "+maxPos);
        
        System.out.println("Finding the index of the minimum value...");
        
        int minPos = 0;
        
        for(int i=0; i<ara.length; i++) {
            
            if(ara[i] < ara[minPos]) {
                
                minPos = i;
            }
        }
        
        System.out.println("Index found "+minPos);
        
        System.out.println("Swapping...");
        
        int temp = ara[maxPos];
        ara[maxPos] = ara[minPos];
        ara[minPos] = temp;
        
        
        System.out.println("Printing new array....");
        
        System.out.print("[");
        for(int i=0; i<ara.length; i++) {
            
            if(i != ara.length-1){
                
                System.out.print(ara[i]+", ");
            }else {
                System.out.print(ara[i]);
            }
            
        }
        System.out.println("]");
        
    }

    static void task03(int[] ara) {
        
        System.out.println("Sorting array using bubble sort");
        
        for(int i=0; i<ara.length; i++) {
            for(int j=1; j<ara.length-i; j++){
                
                if(ara[j-1] > ara[j]){
                    
                    int temp = ara[j-1];
                    ara[j-1] = ara[j];
                    ara[j] = temp;
                }
                
            }
        }
        
        System.out.println("Printing the sorted array...");
        
        System.out.print("[");
        for(int i=0; i<ara.length; i++) {
            
            if(i != ara.length-1){
                
                System.out.print(ara[i]+", ");
            }else {
                System.out.print(ara[i]);
            }
            
        }
        System.out.println("]");
        
        System.out.println("Printing even values....");
        
        System.out.print("[");
        for(int i=0; i<ara.length; i++) {
            
            if(ara[i]%2==0){
                   System.out.print(ara[i]+" ");
            }
            
        }
        System.out.println("]");
    }

    static void task6(int[] ara) {
        
        boolean status = true;
        
        for(int i=0,j=ara.length-1; i<ara.length/2; i++, j--) {
            
            if(ara[i] != ara[j]) {
                
                System.out.println("Not a palindrome!");
                status = false;
                break;
            }
        }
        
        if(status) {
            System.out.println("Palindrome!");
        }
    }

    static void task7(int lineLength) {
        
        for(int i=0; i<lineLength; i++) {
        
            System.out.print("*");
        }
        
        System.out.println();
    
    }

    static void task8(int[] ara1, int[] ara2) {
        
        int[] ans = new int[ara1.length];
        
        System.out.println("Calculating summation...");
        
        for(int i=0; i<ara1.length; i++){
            
            ans[i] = (5*ara1[i]-ara2[i]);
        }
        
        System.out.println("Printing out the summation...");
        System.out.println("Printing even values....");
        
        System.out.print("[");
        for(int i=0; i<ans.length; i++) {
            
            if(i != ans.length-1){
                
                System.out.print(ans[i]+" ");
            }else {
                System.out.print(ans[i]);
            }
        }
        System.out.println("]");
    }
    
    private static void task9(int[] ara) {
        
        System.out.println("Finding squares...");
        
        for(int i=0; i<ara.length; i++){
            
            ara[i] *= ara[i];
        }
        
        System.out.println("Calling display method...");
        display(ara);
    }
    

    private static void display(int[] ara) {
        
        System.out.println("Printing out array...");
        
        System.out.print("[");
        for(int i=0; i<ara.length; i++) {
            
            if(i != ara.length-1){
                
                System.out.print(ara[i]+", ");
            }else {
                System.out.print(ara[i]);
            }
            
        }
        System.out.println("]");
    }

    static void season(int month, int day) {
        
        if(((month==12) && (day > 15 && day < 32)) || 
                ((month > 0 && month < 3)) ||
                ((month == 3) &&(day > 0 && day < 16))) {
            
            System.out.println("It's Winter!");
            
        }else if(((month==3) && (day > 15 && day < 32)) || 
                ((month == 4 || month == 5)) ||
                ((month == 6) &&(day > 0 && day < 16))){
            
            System.out.println("It's Spring!");
            
        }else if(((month==6) && (day > 15 && day < 31)) || 
                ((month == 7 || month == 8)) ||
                ((month == 9) &&(day > 0 && day < 16))){
            
            System.out.println("It's Summer!");
        }else{
            
            System.out.println("It's Fall!");
        }
    }

    static boolean allDigitsOdd(int num) {
        
        boolean odd = true;
        
        while(num > 0){
            
            if((num%10)%2 == 0){
                
                odd = false;
            }
            
            num/=10;
        }
        
        return odd;
    }

    static boolean before(int month1, int day1, int month2, int day2) {
        
        if(month1 > month2){
            
            return false;
        
        }else if(month1==month2){
            
            if(day1 > day2) {
                
                return false;
            }else if(day1==day2){
                
                return false;
            }else{
    
                return true;
            }
        }else{
            
            return true;
        }
    
    }
    
      static int [] removeOdd (int [] input){
          
          int size = 0;
          
          int[] newAra = new int[input.length];
          
          for(int i=0; i<input.length; i++){
              
              if(input[i]%2==0){
                  
                  newAra[size] = input[i];
                  size++;
              }
          }
          
          int[] output = new int[size];
          
          for(int i=0; i<output.length; i++){
              
              output[i] = newAra[i];
          }
          
          return output;
      }
    
    
}
