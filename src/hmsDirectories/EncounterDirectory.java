package hmsDirectories;



import java.util.ArrayList;
import hmsClass.Encounters;


public class EncounterDirectory {
    private static ArrayList<Encounters> encounterDirectory = new ArrayList<>();
    
    public static void addArrayListItem(int id,int patientID,String patientName,String patientEmail,int doctorID,String doctorName,String doctorEmail,String date,String time,String reason,String vitalsigns,String Hospital){
        encounterDirectory.add(new Encounters(id,patientID,patientName,patientEmail,doctorID,doctorName,doctorEmail,date,time,reason,vitalsigns,Hospital));
        
    }
    
    public static ArrayList<Encounters> arrayReturn(){
        return encounterDirectory;
    }
    
    public static int arrayListLength(){
        return encounterDirectory.size();
    }
}
