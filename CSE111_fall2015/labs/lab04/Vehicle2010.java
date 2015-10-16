//14/10/15
//Sk. Imtiaz Ahmed
//CSE111 lab tasks for Tamal Adhikary BRAC University
//Lab04
//Task 09:Design a “Vehicle2010” class

public class Vehicle2010 extends Vehicle {
    
    public void moveUpperRight() {
        
        xCo++;
        yCo++;
    }
    
    public void moveUpperLeft() {
        
        xCo--;
        yCo++;
    }
    
    public void moveLowerRight() {
        
        xCo++;
        yCo--;
    }
    
    public void moveLowerLeft() {
        
        xCo--;
        yCo--;
    }
    
    public boolean equals(Vehicle car) {
        
        return (car.xCo == xCo && car.yCo == yCo);
    }
}