package org.sebi.incident;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import java.util.List;

@RegisterRestClient(baseUri = "http://antennas-incident-hackathon-j2-3.rhd-ams03-may16-412318946-4c50a18a6ae19b704aa10d04d75751f8-0000.ams03.containers.appdomain.cloud")
public interface IncidentClient {

    @GET
    @Path("/rest/incidents")
    List<Incident> getIncidents(@QueryParam("api_key") String key);
}
