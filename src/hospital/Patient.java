package hospital;

import javax.naming.Name;
import java.sql.SQLOutput;
import java.util.Date;

public class Patient {
    public static int TotalNumberOfPatient = 0;  //keeping track of total number of the patients

    private String patientID;
    private String name;
    private long contactNumber;
    private String address;
    private String sex;
    private String dob;
    private String bedNumber;
    private boolean needSpecialist;
    private boolean diagnosed;


    public String getName() {
        return name;
    }
    public void setName(String patientName) {
        name = patientName;          //set is setup without 'this', just to understand
    }


    public long getContactNumber() {
        return contactNumber;
    }
    public void setContactNumber(int patientContactNumber) {
        contactNumber = patientContactNumber;       //set is setup without 'this', just to understand
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String patientAddress) {
        address = patientAddress;        //set is setup without 'this', just to understand
    }


    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {this.sex = sex;}


    public String getDob() { return dob;}
    public void setDob(String dob) {this.dob = dob;}


    public String getBedNumber() {
        return bedNumber;
    }
    public void setBedNumber(String bedNumber){this.bedNumber = bedNumber;}


    public boolean getNeedSpecialist() {
        return needSpecialist;
    }
    public void setNeedSpecialist(boolean needSpecialist) {
        this.needSpecialist = needSpecialist;
    }


    public boolean getDiagnosed() {
        return diagnosed;
    }
    public void setDiagnosed(boolean diagnosed) {
        this.diagnosed = diagnosed;
    }


    public Patient(){
        needSpecialist = false;
        diagnosed = false;
        TotalNumberOfPatient++;
    }
    public Patient(String s){
        sex = s;
       needSpecialist = false;
       diagnosed = false;
        TotalNumberOfPatient++;

    }

    public Patient (String P_name, String P_address, String P_sex, String P_bedNumber,
                    long P_contactNumber, boolean P_needSpecialist, boolean P_diagnosed){
       name = P_name;
       address = P_address;
       sex = P_sex;
       bedNumber = P_bedNumber;
       contactNumber = P_contactNumber;
       needSpecialist = P_needSpecialist;
       diagnosed = P_diagnosed;
       TotalNumberOfPatient++;
    }

    // to print patient summary for all patients in a single method
    public void printSummary(){
        //System.out.println();
        // to print a blank line \n is used
        System.out.println("\nPatient's Summary");
        System.out.println("==================");
        System.out.println("Name                    : " + name);
        System.out.println("Address                 : " + address);
        System.out.println("Sex                     : " + sex);
        System.out.println("Bed Number              : " + bedNumber);
        System.out.println("Contact Number          : " + contactNumber);
        String pneedSpecialist;
        if (needSpecialist == false) { pneedSpecialist = "No";}
        else {pneedSpecialist = "Yes";}
        System.out.println("Need Specialist Doctor  : " + pneedSpecialist);
        String pdiagnosed;
        if (diagnosed == false) { pdiagnosed = "No";}
        else {pdiagnosed = "Yes";}
        System.out.println("Patient Diagnosed       : " + pdiagnosed);
    }
}


class RunPatient {
public static void main(String[]args) {
    Patient p1 = new Patient("Jonathon", "90-38 170 Street Apt 1B Jamaica NY-11432",
            "Male", "203A", 7187953584L, true, true);
    Patient p2 = new Patient("Robledo", "90-22 170 Street Apt 2C Jamaica NY-11432",
            "Female", "109B", 7187953583L, true, false);
    Patient p3 = new Patient();
    p3.setName("Mikel");
    p3.setAddress("90-22 170 Street Apt 2C Jamaica NY-11432");
    Patient p4 = new Patient("Male");
    p4.setNeedSpecialist(false);
    p4.setDiagnosed(true);
    // to avoid lot
    p1.printSummary();
    p2.printSummary();
    p3.printSummary();
    p4.printSummary();
    System.out.println("\nTotal Number of Patient till now : " + Patient.TotalNumberOfPatient);



//        p1.setName("Jonathon");
//        p1.setBedNumber("203A");
//
//        p2.setName("Ahmed");
//        p2.setBedNumber("109B");
//
//        System.out.println("Patient 1 Info");
//        System.out.println("==============");
//        System.out.println("Name: "+ p1.getName());
//        System.out.println("Sex: " + p1.getSex());
//        System.out.println("Bed: "+ p1.getBedNumber());
//        String specialist;
//        if (p1.getNeedSpecialist() == false) { specialist = "No";}
//        else {specialist= "Yes";}
//        System.out.println("Need Specialist: " + specialist);
//        String temporary;
//        if (p1.getDiagnosed() == false) { temporary = "No";}
//        else {temporary = "Yes";}
//        System.out.println("Diagnosed :" + temporary);
//        System.out.println();
//        System.out.println("Patient 2 Info");
//        System.out.println("==============");
//        System.out.println("Name: "+p2.getName());
//        System.out.println("Bed: "+p2.getBedNumber());
//        System.out.println("Need Specialist: " + p2.getNeedSpecialist());
//        System.out.println("Diagnosed :" + p2.getDiagnosed());
//
//        }

//    System.out.println("Patient#1 information:");
//    System.out.println("=======================");
//    System.out.println("Name                   : " + p1.getName());
//    System.out.println("Address                : " + p1.getAddress());
//    System.out.println("Sex                    : " + p1.getSex());
//    System.out.println("Bed Number             : " + p1.getBedNumber());
//    System.out.println("Contact Number         : " + p1.getContactNumber());
//    String p1specialistDr;
//    if (p1.getNeedSpecialist() == false) { p1specialistDr = "No";}
//    else {p1specialistDr = "yes";}
//    System.out.println("Need Specialist Doctor : " + p1specialistDr);
//    String diagnosed;
//    if (p1.getDiagnosed() == false) { diagnosed = "No";}
//    else {diagnosed = "Yes";}
//    System.out.println("Patient Diagnosed      : " + diagnosed);
//
//    System.out.println("Patient#2 information:");
//    System.out.println("=======================");
//    System.out.println("Name                   : " + p2.getName());
//    System.out.println("Address                : " + p2.getAddress());
//    System.out.println("Sex                    : " + p2.getSex());
//    System.out.println("Bed Number             : " + p2.getBedNumber());
//    System.out.println("Contact Number         : " + p2.getContactNumber());
//    String p2specialistDr;
//    if (p2.getNeedSpecialist() == false) { p2specialistDr = "No";}
//    else {p2specialistDr = "yes";}
//    System.out.println("Need Specialist Doctor : " + p2specialistDr);
//    String p2diagnosed;
//    if (p2.getDiagnosed() == false) { p2diagnosed = "No";}
//    else {p2diagnosed = "Yes";}
//    System.out.println("Patient Diagnosed      : " + p2diagnosed);
//    System.out.println();
//    System.out.println("Patient#3 information:");
//    System.out.println("=======================");
//
//    System.out.println("Name                   : " + p3.getName());
//    System.out.println("Address                : " + p3.getAddress());
//
//    System.out.println();
//    System.out.println("Patient#3 information:");
//    System.out.println("=======================");
//    System.out.println("Sex                   : " + p4.getSex());
//    String p4diagnosed;
//    if (p4.getDiagnosed() == false) { p4diagnosed = "No";}
//    else {p4diagnosed = "Yes";}
//    System.out.println("Patient Diagnosed     : " + p4diagnosed);
}

}
//why boolean variables don't work?????
