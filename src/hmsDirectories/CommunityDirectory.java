package hmsDirectories;
import hmsClass.Community;
import java.util.ArrayList;


public class CommunityDirectory {
    private static ArrayList<Community> communityDirectory = new ArrayList<>();
    
    public static void addArrayListItem(int id, String name, String email, String contact, String gender, int age, String community, String password,int adminId,String city,String street,String apartment){
        communityDirectory.add(new Community(id, name,email, contact,  gender, age, community, password,adminId,city,street,apartment));
        System.out.println(communityDirectory);
    }
    
    public static ArrayList<Community> arrayReturn(){
        return communityDirectory;
    }
    
    public static int arrayListLength(){
        return communityDirectory.size();
    }
}
