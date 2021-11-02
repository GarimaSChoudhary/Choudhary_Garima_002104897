/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author choud
 */
public class VitalSigns {
    private float systolic;
    private float diastolic;
    private String normalBP;
    private String lastVisit;

    public VitalSigns(float systolic, float diastolic, String normalBP, String lastVisit) {
        this.systolic = systolic;
        this.diastolic = diastolic;
        this.normalBP = normalBP;
        this.lastVisit = lastVisit;
    }

    public String getLastVisit() {
        return lastVisit;
    }

    public void setLastVisit(String lastVisit) {
        this.lastVisit = lastVisit;
    }
    
    public String getNormalBP() {
        return normalBP;
    }

    public void setNormalBP(String normalBP) {
        this.normalBP = normalBP;
    }
    
    

    

    public float getSystolic() {
        return systolic;
    }

    public void setSystolic(float systolic) {
        this.systolic = systolic;
    }

    public float getDiastolic() {
        return diastolic;
    }

    public void setDiastolic(float diastolic) {
        this.diastolic = diastolic;
    }

   
    
}
