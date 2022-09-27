package com.bridgelabz;

import java.util.Scanner;

public class Patient {
    String patientName;
    int patientAge;
    String patientPhoneNumber;
    String patientCity;
    String patientState;
    PatientDepartment patientDepartment;

    Scanner sc = new Scanner(System.in);
    public enum PatientDepartment{
        ONCOLOGY, NEUROLOGY , CARDIOLOGY , GYNOCOLOGY
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }

    public String getPatientPhoneNumber() {
        return patientPhoneNumber;
    }

    public void setPatientPhoneNumber(String patientPhoneNumber) {
        this.patientPhoneNumber = patientPhoneNumber;
    }

    public String getPatientCity() {
        return patientCity;
    }

    public void setPatientCity(String patientCity) {
        this.patientCity = patientCity;
    }

    public String getPatientState() {
        return patientState;
    }

    public void setPatientState(String patientState) {
        this.patientState = patientState;
    }

    public PatientDepartment getPatientDepartment() {
        return patientDepartment;
    }

    public void setPatientDepartment(PatientDepartment patientDepartment) {
        this.patientDepartment = patientDepartment;
    }

    public void selectPatientDepartment() {
        System.out.println("Select department: \n1.ONCOLOGY \n2.NEUROLOGY \n3.CARDIOLOGY \n4.GYNOCOLOGY");
        int option = sc.nextInt();
        if(option == 1){
            this.patientDepartment = PatientDepartment.ONCOLOGY;
        }else if (option == 2){
            this.patientDepartment = PatientDepartment.NEUROLOGY;
        } else if (option == 3) {
            this.patientDepartment = PatientDepartment.CARDIOLOGY;
        } else if (option == 4) {
            this.patientDepartment = PatientDepartment.GYNOCOLOGY;
        }
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientName='" + patientName + '\'' +
                ", patientAge=" + patientAge +
                ", patientPhoneNumber='" + patientPhoneNumber + '\'' +
                ", patientCity='" + patientCity + '\'' +
                ", patientState='" + patientState + '\'' +
                ", patientDepartment=" + patientDepartment +
                '}';
    }
}
