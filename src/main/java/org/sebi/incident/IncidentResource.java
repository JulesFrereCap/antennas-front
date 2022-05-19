package org.sebi.incident;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.List;
import java.util.Set;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("rest/incidents")
public class IncidentResource {

    @Inject
    @RestClient
    IncidentClient incidentClient;

    @ConfigProperty(name = "APIKEY")
    String apiKEY;
    
    @GET
    public Set<Incident> getIncidents(){
       return incidentClient.getIncidents(apiKEY);
    } 
}
