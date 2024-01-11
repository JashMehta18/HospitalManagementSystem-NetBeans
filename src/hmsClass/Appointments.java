package hmsClass;

public class Appointments {
    public int id;
    public int patientID;
    public String patientName;
    public String patientEmail;
    public String appointmentDoctor;
    public String reason;
    public String date;
    public String time;

    public Appointments(int id, int patientID, String patientName, String patientEmail, String appointmentDoctor, String reason, String date, String time) {
        this.id = id;
        this.patientID = patientID;
        this.patientName = patientName;
        this.patientEmail = patientEmail;
        this.appointmentDoctor = appointmentDoctor;
        this.reason = reason;
        this.date = date;
        this.time = time;
    }
    
}
