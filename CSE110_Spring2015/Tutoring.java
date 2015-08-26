//dui vabe kaaj kora jai

//prothome ekta class banala
//eta jekono file e (eki folder e) thakle cholbe
class EktaClass{
    //ekhon ei class e method banala
    
    //ei method ta return type er na
    //void mane eta kisu ferot dibe na
    public void ektaClassErMethod(){
        System.out.println("Ekta class e shagotom");
    }
    
    //eta ekta return type method
    //eta integer return kore
    //er duita pera ache. perameter ar ki
    // a b
    public int jogKorarMethod(int a, int b){
        
        int sum = a+b;
        
        return sum;
    }
}
//eta arekta class
public class ArektaClass {
    
    //ei class er method ta kintu static
    //apatoto beshi na
    //static main theke call kortesi bole static
    public static void arektaClassErMethod(){
        System.out.println("Arekta class e shagotom. Ashole apni ekhaneri bashinda");
    }
    
    
    public static void main(String[] args) {
        
        //onno class er jonno object lage
        //object chara onno class er methods call kora jay na
        EktaClass ek = new EktaClass();//eta EktaClass er object
        //EktaClass er method take call korlam
        ek.ektaClassErMethod();
        
        
       //etar ki dorkar??koi tumi?? 
        //static method er jonno object banano lage na
        arektaClassErMethod();//eta ei class er method
        //static bole object banano lage na
        
       //ei line er ki dorkar??? 
        //taile oi class theke jog korbo
        int jogfol = ek.jogKorarMethod(2, 3);//eta ekta return type chilo
        //return type kichu return kor
        //oita nie hoy kothao rekhe dite hoy naile use korte hoy
        
        System.out.println(jogfol);

    }
}