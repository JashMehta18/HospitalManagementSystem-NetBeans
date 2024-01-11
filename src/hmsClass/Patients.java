package hmsClass;

public class Patients extends Persons {
    public int age;
    public String community;
    public String password;
    
    public Patients(int id,String name,String email,String contact,String gender, int age, String community, String password,String city,String street,String apartment){
        super(id,name,email,contact,community,gender,city,street,apartment);
        
        this.age = age;
        this.password = password;
    }
}
