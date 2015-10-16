//14/10/15
//Sk. Imtiaz Ahmed
//CSE111 lab tasks for Tamal Adhikary BRAC University
//Lab04
//Task 10:Design a “Student” class

public class Student {
    
    private String name;
    private String id;
    private String address;
    private double cgpa;
    
    public Student() {
    }
    
    public Student(String n, String i, String a, double c){
        
        name = n;
        id = i;
        address = a;
        cgpa = c;
    }
    
    public String getName() {
        
        return name;
    }
    public String getID() {
        
        return id;
    }
    public String getAddress(){
        
        return address;
    }
    public double getCGPA(){
        
        return cgpa;
    }
    public void setName(String n) {
        
        name = n;
    }
    
    public void setID(String i){
        
        id = i;
    }
    
    public void setAddress(String a){
        
        address = a;
    }
    
    public void setCGPA(double c){
        
        cgpa = c;
    }
    
    
}