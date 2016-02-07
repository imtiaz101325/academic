

package pkg15101054_lab02;


public class ComplexNumber {
    
    private int x;
    private int y;
    
    public ComplexNumber(int realPart, int imaginryPart) {
        
        x = realPart;
        y = imaginryPart;
    }
    
    public void increaseValue() {
        
        x+=2;
        y+=2;
    }
    
    public double polarRadius(){
    
        return Math.pow((Math.pow(x, 2) + Math.pow(y, 2)), 1/2);
    }
    
    public String toString(){
        
        return x+"+"+y+"i";
    }
}
