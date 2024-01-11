package hmsDirectories;
import hmsClass.Doctor;
import java.util.ArrayList;


public class DoctorDirectory {
    private static ArrayList<Doctor> doctorDirectory = new ArrayList<>();
    
    public static void addArrayListItem(int id,String doctorName,String doctorEmail,String doctorGender,String doctorContact,String doctorHospital,String doctorCommunity,String doctorPassword, String doctorCity, String doctorStreet, String doctorApartment){
        doctorDirectory.add(new Doctor(id, doctorName, doctorEmail, doctorGender, doctorHospital, doctorCommunity,doctorContact, doctorPassword,doctorCity,doctorStreet,doctorApartment));
        System.out.println(doctorDirectory);
    }
    
    public static ArrayList<Doctor> arrayReturn(){
        return doctorDirectory;
    }
    
    public static int arrayListLength(){
        return doctorDirectory.size();
    }
}
