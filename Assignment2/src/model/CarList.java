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
public class CarList {
       
        private ArrayList<Car> listOfCars;
        private String updatedTime;

        public CarList(){
            this.listOfCars = new ArrayList<Car>();
        }

    public ArrayList<Car> getListOfCars() {
        return listOfCars;
    }

    public void setListOfCars(ArrayList<Car> listOfCars) {
        this.listOfCars = listOfCars;
    }

    public String getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }
       
    public Car addNewCar(){
        Car car = new Car();
        listOfCars.add(car);
        return car;
    }

    public void deleteCar(Car car) {
        listOfCars.remove(car);   
    }
    
}
