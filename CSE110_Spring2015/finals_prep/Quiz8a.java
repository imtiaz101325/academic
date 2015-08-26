public class Quiz8a{
  int k;
  public  void methodOne(){
    k = 0;
    while (k <= 4){
      System.out.println(k + 1);
      k+=2;
      methodTwo();
      System.out.println(k - 1);      
    }
  }
  public void methodTwo(){
    int j;
    j = k - 1;
    while (j < 7){
      System.out.println(j - k - 1);
      j+=2;
    }
  }  
}