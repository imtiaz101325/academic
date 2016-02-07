public class Vehicle {
    
    private int xCo = 0;
    private int yCo = 0;
    
    public void moveUp(){
        
        yCo++;
    }
    
    public void moveDown(){
        
        yCo--;
    }
    
    public void moveLeft(){
        
        xCo--;
    }
    
    public void moveRight(){
        
        xCo++;
    }
    
    public String toString(){
        
        return "("+xCo+", "+yCo+")";
    }
}
