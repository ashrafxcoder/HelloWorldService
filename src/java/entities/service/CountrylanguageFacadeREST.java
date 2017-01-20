/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.service;

import entities.Countrylanguage;
import entities.CountrylanguagePK;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.PathSegment;

/**
 *
 * @author Ashraf-XCODER
 */
@Stateless
@Path("entities.countrylanguage")
public class CountrylanguageFacadeREST extends AbstractFacade<Countrylanguage> {
    @PersistenceContext(unitName = "HelloWorldServicePU")
    private EntityManager em;

    private CountrylanguagePK getPrimaryKey(PathSegment pathSegment) {
        /*
         * pathSemgent represents a URI path segment and any associated matrix parameters.
         * URI path part is supposed to be in form of 'somePath;countryCode=countryCodeValue;language=languageValue'.
         * Here 'somePath' is a result of getPath() method invocation and
         * it is ignored in the following code.
         * Matrix parameters are used as field names to build a primary key instance.
         */
        entities.CountrylanguagePK key = new entities.CountrylanguagePK();
        javax.ws.rs.core.MultivaluedMap<String, String> map = pathSegment.getMatrixParameters();
        java.util.List<String> countryCode = map.get("countryCode");
        if (countryCode != null && !countryCode.isEmpty()) {
            key.setCountryCode(countryCode.get(0));
        }
        java.util.List<String> language = map.get("language");
        if (language != null && !language.isEmpty()) {
            key.setLanguage(language.get(0));
        }
        return key;
    }

    public CountrylanguageFacadeREST() {
        super(Countrylanguage.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(Countrylanguage entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") PathSegment id, Countrylanguage entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") PathSegment id) {
        entities.CountrylanguagePK key = getPrimaryKey(id);
        super.remove(super.find(key));
    }

    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public Countrylanguage find(@PathParam("id") PathSegment id) {
        entities.CountrylanguagePK key = getPrimaryKey(id);
        return super.find(key);
    }

    @GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<Countrylanguage> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<Countrylanguage> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces("text/plain")
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
