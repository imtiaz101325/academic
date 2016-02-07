
public class Test{
  public static int [] removeOdd (int [] input){
	//Your code here
      int[] removed = new int[input.length];
      int size = 0;
      for(int i=0, j=0; i<input.length; i++){
          
          if(input[i]%2==0){
              
              removed[j] = input[i];
              j++;
              size++;
          }
      }
      
      input = new int[size];
      
      for(int i=0; i<input.length; i++){
          
          input[i] = removed[i];
      }
      
      return input;
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
  }
}