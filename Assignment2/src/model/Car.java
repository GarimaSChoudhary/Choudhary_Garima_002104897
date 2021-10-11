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
public class Car {
    private String carId;
    private String carManufacturer;
    private String carType;
    private String carModel;
    private boolean isAvailable;
    private int carManufacturerYear;
    private int noOfSeats;
    private String carCity;
    private String carMaintainenceCertificate;
    private String carLicenceNo;
    //private String updatedTime;

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getCarManufacturer() {
        return carManufacturer;
    }

    public void setCarManufacturer(String carManufacturer) {
        this.carManufacturer = carManufacturer;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public int getCarManufacturerYear() {
        return carManufacturerYear;
    }

    public void setCarManufacturerYear(int carManufacturerYear) {
        this.carManufacturerYear = carManufacturerYear;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public String getCarCity() {
        return carCity;
    }

    public void setCarCity(String carCity) {
        this.carCity = carCity;
    }

    public String getCarMaintainenceCertificate() {
        return carMaintainenceCertificate;
    }

    public void setCarMaintainenceCertificate(String carMaintainenceCertificate) {
        this.carMaintainenceCertificate = carMaintainenceCertificate;
    }

    public String getCarLicenceNo() {
        return carLicenceNo;
    }

    public void setCarLicenceNo(String carLicenceNo) {
        this.carLicenceNo = carLicenceNo;
    }

//    public String getUpdatedTime() {
//        return updatedTime;
//    }
//
//    public void setUpdatedTime(String updatedTime) {
//        this.updatedTime = updatedTime;
//    }
    
    @Override
    public String toString(){
        return carLicenceNo;
    }
}
