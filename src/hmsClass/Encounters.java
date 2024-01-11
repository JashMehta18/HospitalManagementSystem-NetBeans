package hmsClass;


public class Encounters {
    public int id;
    public int patientID;
    public String patientName;
    public String patientEmail;
    public int doctorID;
    public String doctorName;
    public String doctorEmail;
    public String date;
    public String time;
    public String reason;
    public String vitalsigns;
    public String Hospital;

    public Encounters(int id, int patientID, String patientName, String patientEmail, int doctorID, String doctorName, String doctorEmail, String date, String time, String reason, String vitalsigns,String Hospital) {
        this.id = id;
        this.patientID = patientID;
        this.patientName = patientName;
        this.patientEmail = patientEmail;
        this.doctorID = doctorID;
        this.doctorName = doctorName;
        this.doctorEmail = doctorEmail;
        this.date = date;
        this.time = time;
        this.reason = reason;
        this.vitalsigns = vitalsigns;
        this.Hospital=Hospital;
    }
    
    
}
