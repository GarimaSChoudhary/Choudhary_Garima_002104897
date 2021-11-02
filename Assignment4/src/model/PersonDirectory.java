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
public class PersonDirectory {
    private ArrayList<Person> people;

    public PersonDirectory(){
            this.people = new ArrayList<Person>();
        }
    public ArrayList<Person> getPeople() {
        return people;
    }

    public void setPeople(ArrayList<Person> people) {
        this.people = people;
    }
    
     public Person addNewCar(int id){
         id++;
        Person person = new Person(String.valueOf(id));
        people.add(person);
        return person;
    }

    public void deleteCar(Person person) {
        people.remove(person);   
    }
}
