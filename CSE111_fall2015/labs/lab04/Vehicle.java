//14/10/15
//Sk. Imtiaz Ahmed
//CSE111 lab tasks for Tamal Adhikary BRAC University
//Lab04
//Task 08:Design a “Vehicle” class

public class Vehicle {
    
    public int xCo;
    public int yCo;
    
    public void moveUp() {
        
        yCo++;
    }
    
    public void moveDown() {
        
        yCo--;
    }
    
    public void moveLeft() {
        
        xCo--;
    }
    
    public void moveRight() {
        
        xCo++;
    }
    public String toString() {
        
        return "("+xCo+", "+yCo+")";
    }
}