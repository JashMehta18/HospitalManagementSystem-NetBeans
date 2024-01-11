import java.util.ArrayList;

class PersonDirectory {
    public static ArrayList<Persons> personArrayList = new ArrayList<>();
    
    public static void addArrayItem(int id, String name, String email, String role, String community, String house, String city){
        personArrayList.add(new Persons(id,name,email,role,community,house,city));
    }
    
    public static ArrayList arrayReturn(){
        return personArrayList;
    }
    
    public static int arrayLengthReturn(){
        return personArrayList.size();
    }
}
