package hmsClass;

public class Persons extends Residence {

    public int idP;
    public String nameP;
    public String emailP;
    public String contactP;
    public String communityP;
    public String genderP;
    
    public Persons(int id, String name, String email, String contact, String community, String gender,String city, String street, String house){
        super(city,street,house);
        this.idP = id;
        this.nameP = name;
        this.emailP = email;
        this.contactP = contact;
        this.communityP = community;
        this.genderP = gender;
        
//        this.personResidenceHouse = residenceHouse;
//        this.personResidenceCity = residenceCity;
    }

}
