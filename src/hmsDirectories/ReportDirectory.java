package hmsDirectories;


import hmsClass.Reports;
import java.util.ArrayList;


public class ReportDirectory {
    public static ArrayList<Reports> reportDirectory = new ArrayList<>();
    
    public static void addArrayItem(int pId,String pName, String pEmail, int rId, String rTitle, String rDesc, String rVitalSign){
        reportDirectory.add(new Reports(pId,pName,pEmail,rId,rTitle,rDesc,rVitalSign));
    }
    
    public static ArrayList arrayReturn(){
        return reportDirectory;
    }
    
    public static int arrayListLengthReturn(){
        return reportDirectory.size();
    }
}
