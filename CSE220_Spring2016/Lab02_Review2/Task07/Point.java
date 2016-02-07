
package pkg15101054_lab02;


public class Point {
    
    private int xCo;
    private int yCo;
    
    public Point(int x, int y) {
        
        xCo = x;
        yCo = y;
        
    }
    
    public double distanceFromOrigin() {
        
        return Math.pow((Math.pow(xCo, 2) + Math.pow(yCo, 2)), 1/2);
    }
    
    public String toString() {
        
        return "("+xCo+", "+yCo+")";
    }
    
}
