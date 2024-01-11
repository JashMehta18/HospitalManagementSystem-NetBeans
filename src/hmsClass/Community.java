package hmsClass;

public class Community extends Persons {
    public int id;
    public int age;
    
    public String password;
    

    public Community(int id, String name, String email, String contact, String gender, int age, String community,  String password, int adminId,String city,String street,String apartment) {
        super(id,name,email,contact,community,gender,city,street,apartment);
        this.id = id;
        this.age = age;
        this.password = password;
        
    }

}