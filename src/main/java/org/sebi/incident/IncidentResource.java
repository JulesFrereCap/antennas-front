package org.sebi.incident;

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
    
    @GET
    public Set<Incident> getIncidents(){
       return incidentClient.getIncidents("secret");
    } 
}
