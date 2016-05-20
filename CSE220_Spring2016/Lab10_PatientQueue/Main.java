
package PatientQueue;

public class Main {

    
    public static void main(String[] args) {
        
        PatientQueue obj = new PatientQueue();
        
        //Register
        obj.RegisterPatient("James");
        obj.RegisterPatient("Sophia");
        obj.RegisterPatient("George");
        obj.RegisterPatient("Mary");
        
        //Serve
        obj.ServePatient();
        obj.ServePatient();
        obj.ServePatient();
        
        //Register
        obj.RegisterPatient("Robb");
        obj.RegisterPatient("Snow");
        
        //can doctor go home
        obj.CanDoctorGoHome();
        
        //show sorted
        obj.ShowAllPatient();
        
        //cancel all
        
        obj.CancelAll();
        
        
        
                
    }
    
}
