package helloworld;

import java.util.Arrays;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Ashraf
 */

@Stateless
@Path("/greeting")
public class HelloWorldResource {

    @EJB
    private NameStorageBean nameStorage;
    
    @GET
    @Produces("text/html")
    public String getGreeting() {
        return "<html><body><h1>Hello "+ nameStorage.getName()+ "!</h1></body></html>";
    }
    
    @PUT
    @Consumes("text/plain")
    public void setName(String content) {
        nameStorage.setName(content);
    }    
}
