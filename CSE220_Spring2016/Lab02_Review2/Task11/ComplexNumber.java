
public class ComplexNumber extends RealNumber{
    
    private double imaginaryValue;
    
    public ComplexNumber() {
        
        this(1);
    }
    
    public ComplexNumber(double i) {
        
        imaginaryValue = i;
    }
    
    public ComplexNumber(double i, double j ) {
        
        super(i);
        imaginaryValue = j;
    }
    
    
    
    public double getImagirayValue() {
        return imaginaryValue;
    }
    
    public void check(){
        
        System.out.println("I'm in ComplexNumber class");
        ping();
        System.out.println("Checking ended.");
        
    }
    
    public void setImaginaryValue(double i) {
        imaginaryValue = i;
    }
    
    public String toString() {
        
        System.out.println(super.toString());
        
        return "ImaginaryPart: "+getImagirayValue();
    }

}
