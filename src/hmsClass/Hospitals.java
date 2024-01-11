package hmsClass;

public class Hospitals extends Persons {
    public int id;
    public String name;
    public String email;
    public String contact;
    public String community;
    public String head;
    
    public String adminPassword;
    
    
     public Hospitals(int id,String name,String email,String contact, String Community, String Head, int adminId, String adminName,String adminEmail, String adminContact, String adminGender, String Password, String city, String street, String apartment){
        super(adminId,adminName, adminEmail, adminContact, Community, adminGender,city, street, apartment);
        this.id = id;
        this.name = name;
        this.email = email;
        this.contact = contact;
        this.community = Community;
        this.head = Head;
        
        this.adminPassword = Password;
        
        
    }
}
