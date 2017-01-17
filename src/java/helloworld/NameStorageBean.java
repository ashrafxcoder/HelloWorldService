
package helloworld;

import javax.ejb.Singleton;

/** Singleton session bean used to store the name parameter for "/helloWorld" resource
 *
 * @author Ashraf
 */
@Singleton
public class NameStorageBean {

    // name field
    private String name = "Ashraf";
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
