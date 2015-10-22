//19/10/2015
//Sk. Imtiaz Ahmed || @excalliburbd
//Self practice for CSE220: Datastructure

//Book class
public class Book {
    
    //private feilds 
    private String name;
    private String id;
    private String author;
    private String publisher;
    
    //default constructor
    public Book() {
        
        
    }
    
    //constructor with parameters
    public Book(String n, String i, String a, String p){
        
        name = n;
        id = i;
        author = a;
        publisher = p;
    }
    
    //get methods
    
    public String getName() {
        
        return name;
    }
    
    public String getID() {
        
        return id;
    }
    
    public String getAuthor() {
        
        return author;
    }
    
    public String getPublisher() {
        
        return publisher;
    }
    
    //set methods
    
    public void setName(String n) {
        
        name = n;
    }
    
    public void setID(String i) {
        
        id = i;
    }
    
    public void setAuthor(String a) {
        
        author = a;
    }
    
    public void setPublisher(String p) {
        
        publisher = p;
    }
} 
