/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author choud
 */
public class Encounter {
    private VitalSigns vitalSigns;
    private String lastVisit;
    private boolean normalBP;
   // private Patient patient;

     public Encounter(VitalSigns vital){
        
        this.lastVisit = LocalDate.now().toString();
        this.vitalSigns = vital;

    }

    public boolean isNormalBP() {
        return normalBP;
    }

    public void setNormalBP(boolean normalBP) {
        this.normalBP = normalBP;
    }
     
    public String getLastVisit() {
        return lastVisit;
    }

    public void setLastVisit(String lastVisit) {
        this.lastVisit = lastVisit;
    }

    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }
    
    
}
