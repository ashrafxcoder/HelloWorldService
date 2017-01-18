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
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import models.PeopleDOA;
import models.Person;

/**
 *
 * @author Ashraf-XCODER
 */
@Stateless
@Path("/people")
public class PeopleResource {

    @Context UriInfo uriInfo;
    @Context Request request;
    
    
    
    
    @EJB
    private PeopleBean peopleBean;

    @GET
    @Produces("text/plain")
    public String getNames() {
        //String joining using Java 8 collectors
        List<String> list = Arrays.asList(peopleBean.getNames());
        return list.stream().collect(Collectors.joining(", "));
    }

    @PUT
    @Consumes("text/plain")
    public void setNames(String[] content) {
        peopleBean.setNames(content);
    }
    
    @GET
    @Path("all")
    @Produces({MediaType.APPLICATION_JSON})
    public List<Person> getPeople(){
        PeopleDOA peopleDoa = new PeopleDOA();
        return peopleBean.getPeople();
    }
    
    
    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.TEXT_PLAIN)
    public Response putPerson(@FormParam("name") String name, @FormParam("age") int age) {
        peopleBean.AddPerson(name, age);
        Response response = Response.created(uriInfo.getAbsolutePath()).build();
        return response;
    }
}
