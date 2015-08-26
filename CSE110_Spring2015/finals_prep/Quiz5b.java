public class Quiz5b
{  
  public static void main(String args[])
  {
    String test = "";
    int i = 2, j = 0, k = 18;
    while (i < 7){
      test = "-->";
      j = --k;
      while (j > 13 ){
        test = test + i + j;
        System.out.println(test);
        j--;
      }
      i++;
    }
  }
}


