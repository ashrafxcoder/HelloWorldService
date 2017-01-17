/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import javax.ejb.Singleton;

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
}
