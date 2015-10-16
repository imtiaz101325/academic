//16/10/15
//Sk. Imtiaz Ahmed
//CSE111 lab tasks for Tamal Adhikary BRAC University
//Lab 5
//Task 04: Remove odd


public class Task04{
    
    public static int [] removeOdd (int [] input){

        boolean[] hasOdd = new boolean[input.length];//holds indexes of the odd values
                                                    //in the input array
        int hasOddLength = 0;

        //iterate and find odd values
        for(int i=0; i<input.length; i++) {

            if(input[i]%2 != 0) {

                hasOdd[i] = true;
                hasOddLength++;
            }
        }

        int[] newArray = new int[input.length - hasOddLength];//resize

        for(int i=0,j=0; i<input.length; i++) {

            if(!hasOdd[i]) {//exclude odds

                newArray[j] = input[i];
                j++;
            }
        }

        return newArray;
    }
    public static void main(String [] args){
        int [] mixedArray = {21, 33, 44, 66, 11, 1, 88, 45, 10, 9};
        for (int i = 0; i < mixedArray.length; i++) {
            System.out.print(mixedArray[i] + " ");
        }
        System.out.println();
        int [] noOdd = removeOdd(mixedArray);
        for (int i = 0; i < noOdd.length; i++) {
            System.out.print(noOdd[i] + " ");
        }    
        System.out.println();
    }
}