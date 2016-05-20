

package PatientQueue;

public class PatientQueue {
    
    int idCounter = 0;
    //declare reference variable of array queue or list queue
//    ArrayQueue patientQueue = new ArrayQueue();
    ListQueue patientQueue = new ListQueue();
    
    void RegisterPatient(String name)   
    {
        idCounter++;
        Patient p = new Patient(idCounter, name);
        System.out.println("Patient: "+p.patientName+" Id: "+p.patientID+" is waiting in queue.");
       
        //This method assigns an Id (which is auto-generated)
       //to a patient and register him/her to the system. 
       
        try {
            
            patientQueue.enqueue(p);
        } catch (Exception e) {
            
            System.out.println("Too may patientes!");
        }
       
    }
    void ServePatient()
    {
       // This method calls a patient to provide hospital service to him/her.
        //print which name and id is served
        
        try {
            Patient p = (Patient) patientQueue.dequeue();
            
            System.out.println("Patient: "+p.patientName+" Id: "+p.patientID+" is being served.");
    
        } catch (Exception e) {
            
            System.out.println("No patient is waiting!");
        }
    }
    boolean CanDoctorGoHome()
    {
        //print 
        
        if(patientQueue.isEmpty()){
            
            System.out.println("Doctor may go home.");
            return true;
        }
        System.out.println("Doctor may not go home.");
        return false;
    }
    
    void ShowAllPatient()
    {
        Object[] patientList = patientQueue.toArray();
        
        for(int i=patientList.length-1; i >= 0; i--){           
                        
            for(int j=1; j<=i; j++) {
                
                Patient b = (Patient) patientList[j];
                
                Patient a = (Patient) patientList[j-1];
                
                int compare = a.patientName.compareTo(b.patientName);
                
                if (compare > 0) {
                        
                    Object temp = patientList[j];
                    patientList[j] = patientList[j-1];
                    patientList[j-1] = temp;
                }  
            }
        }
        
        System.out.println("Printing patient names in alphabetical order: ");
        for(int i=0; i<patientList.length; i++){
            
            Patient p = (Patient) patientList[i];
            
            System.out.println(i+1+": "+p.patientName);
        }
    }
    
    void CancelAll()
    {
        for(int i=patientQueue.size; i>=0; i--){
            
            try {
            
                Patient p = (Patient) patientQueue.dequeue();

                System.out.println("Patient: "+p.patientName+" Id: "+p.patientID+" has left.");
            
            } catch (Exception e) {
            
                break;
            }
        }
    }
    
    
}
