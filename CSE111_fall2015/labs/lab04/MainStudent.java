//14/10/15
//Sk. Imtiaz Ahmed
//CSE111 lab tasks for Tamal Adhikary BRAC University
//Lab04
//Task 10:Design a “Student” class
//Tester class

public class MainStudent {
    
    public static void main(String[] args){
        
        Student john = new Student();
        Student mike = new Student();
        Student carol = new Student();
        
        john.setName("John Cena");
        john.setID("126423");
        john.setAddress("34, Manhatten, Murica");
        john.setCGPA(2.0);
        
        mike.setName("Mike Tyson");
        mike.setID("152375");
        mike.setAddress("35, Manhatten, Murica");
        mike.setCGPA(2.5);
        
        carol.setName("Carol Lewis");
        carol.setID("124565");
        carol.setAddress("22, Manhatten, Murica");
        carol.setCGPA(3.5);
        
        System.out.println(john.getName());
        System.out.println(john.getID());
        System.out.println(john.getAddress());
        System.out.println(john.getCGPA());
        
        System.out.println(mike.getName());
        System.out.println(mike.getID());
        System.out.println(mike.getAddress());
        System.out.println(mike.getCGPA());
        
        System.out.println(carol.getName());
        System.out.println(carol.getID());
        System.out.println(carol.getAddress());
        System.out.println(carol.getCGPA());
        
        
    }
    
}