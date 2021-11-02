/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author choud
 */
public class PatientDirectory {
    
    private ArrayList<Patient> patients;
    
    public PatientDirectory(){
            this.patients = new ArrayList<Patient>();
        }
    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }
    
    public Patient addNewCar(){
        Patient person = new Patient();
        patients.add(person);
        return person;
    }
    
}
