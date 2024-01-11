package hmsClass;


public class Reports {
    public int patientId;
    public String patientName;
    public String patientEmail;
    public int reportId;
    public String reportTitle;
    public String reportDescription;
    public String reportVitalSign;

    public Reports(int patientId,
            String patientName,
            String patientEmail,
            int reportId,
            String reportTitle,
            String reportDescription,
            String reportVitalSign) {
        
        this.patientId = patientId;
        this.patientName = patientName;
        this.patientEmail = patientEmail;
        this.reportId = reportId;
        this.reportTitle = reportTitle;
        this.reportDescription = reportDescription;
        this.reportVitalSign = reportVitalSign;
        
    }
}
