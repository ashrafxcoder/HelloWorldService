/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;

/**
 *
 * @author Ashraf-XCODER
 */
@Stateless
@Path("/people")
public class PeopleResource {

    @EJB
    private PeopleBean peopleBean;

    @GET
    @Produces("text/plain")
    public String getNames() {
        List<String> list = Arrays.asList(peopleBean.getNames());
        return list.stream().collect(Collectors.joining(", "));
    }

    @PUT
    @Consumes("text/plain")
    public void setNames(String[] content) {
        peopleBean.setNames(content);
    }
}
