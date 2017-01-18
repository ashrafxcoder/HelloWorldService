/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ashraf-XCODER
 */
public class PeopleDOA {
    private List<Person> people = new ArrayList<Person>();
    
    
    public List<Person> getPeople(){
        
        people.add(new Person("Bob", 21));
        people.add(new Person("Tom", 21));
        people.add(new Person("Jack", 21));
        people.add(new Person("Jill", 21));
        people.add(new Person("Jessie", 21));
        people.add(new Person("Tabor", 21));
        people.add(new Person("William", 21));
        
        return people;
    }
    
    
    
    
}
