/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Singleton;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import models.Person;

/**
 *
 * @author Ashraf-XCODER
 */
@Singleton
public class PeopleBean {
    private String[] names = {"Bob", "Tom","Jerry", "Jack", "Jill" };

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }
    
    
    
    
    List<Person> people = new ArrayList<Person>();
    
    public List<Person> getPeople(){
        if (people.size() <= 0) {
            people.add(new Person("Bob", 21));
            people.add(new Person("Tom", 21));
            people.add(new Person("Jack", 21));
            people.add(new Person("Jill", 21));
            people.add(new Person("Jessie", 21));
            people.add(new Person("Tabor", 21));
            people.add(new Person("William", 21));
        }
        
        return people;
    }
    
    
    public void AddPerson(String name, int age){
        if (people != null) {
            people.add(new Person(name, age));
        }
    }
}
