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
public class EncounterHistory {
    private ArrayList<Encounter> encounter;
    private PersonDirectory personDirectory;
    private PatientDirectory patientDirectory;
    private City city;

    public EncounterHistory(){
        this.encounter = new ArrayList<Encounter>();
    }
    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public ArrayList<Encounter> getEncounter() {
        return encounter;
    }

    public void setEncounter(ArrayList<Encounter> encounter) {
        this.encounter = encounter;
    }
    
    public Encounter addNewCar(VitalSigns vs){
         Encounter person = new Encounter( vs);
        encounter.add(person);
        return person;
    }
}
