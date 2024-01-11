package hmsDirectories;
import hmsClass.Hospitals;
import java.util.ArrayList;


public class HospitalDirectory {
    private static ArrayList<Hospitals> hospitalDirectory = new ArrayList<>();
    
    public static void addArrayListItem(int id,String hospitalName,String hospitalEmail,String hospitalContact,String hospitalCommunity,String communityHead, int adminId, String adminName, String adminEmail,String adminContact, String adminGender, String adminPassword, String adminCity, String adminStreet, String adminApartment  ){
        hospitalDirectory.add(new Hospitals(id,hospitalName,hospitalEmail,hospitalContact,hospitalCommunity,communityHead,adminId,adminName,adminEmail,adminContact,adminGender,adminPassword, adminCity, adminStreet, adminApartment));
        System.out.println(hospitalDirectory);
    }
    
    public static ArrayList<Hospitals> arrayReturn(){
        System.out.println("Array list"+hospitalDirectory);
        return hospitalDirectory;
    }
    
    public static int arrayListLength(){
        return hospitalDirectory.size();
    }
}
    

