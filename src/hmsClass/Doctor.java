package hmsClass;


public class Doctor extends Persons{

    public String hospital; 
    public String password;
    public Doctor(int id, String name, String email,String gender,String hospital,String community,String contact, String password,String city,String street,String apartment) {
        super(id,name,email,contact,community,gender,city,street,apartment);
        
        this.hospital=hospital;
        this.password=password;
    }
    
    
    
}
