

package pkg15101054_lab02;

public class QuadEqn {
    
    private int a;
    private int b;
    private int c;
    
    public QuadEqn(int first, int second, int third) {
        
        a = first;
        b = second;
        c = third;
    }
    
    public double firstRoot(){
        
        return (Math.pow((Math.pow(b, 2)+(4*a*c)), 1/2)-b)/(2.0*a);
    }
    
    public String toString(){
        
        return a+"x+"+b+"y+"+c;
    }
    
}
