package com.bridgelabz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Hospital {
    static HashMap<String, Hospital> hospitalMap = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    ArrayList<Patient> patientList = new ArrayList<>();

    static Hospital createNewHospital(String hospitalName){
        Hospital hospital = new Hospital();
        hospitalMap.put(hospitalName, hospital);
        return hospital;
    }

    Patient createPatient(){
        Patient patient = new Patient();
        patient.selectPatientDepartment();
        System.out.println("Enter patient name");
        patient.setPatientName(sc.next());
        System.out.println("Enter patient age");
        patient.setPatientAge(sc.nextInt());
        System.out.println("Enter patient phone number");
        patient.setPatientPhoneNumber(sc.next());
        System.out.println("Enter patient city");
        patient.setPatientCity(sc.next());
        System.out.println("Enter patient state");
        patient.setPatientState(sc.next());
        return patient;
    }

    public void addPatient() {
        Patient patient = createPatient();
        patientList.add(patient);
        System.out.println(patient);
        System.out.println("Patient added successfully");
    }
}
