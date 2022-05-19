package org.sebi.incident;
import org.eclipse.microprofile.faulttolerance.Retry;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import java.util.List;
import java.util.Set;

@Path("/rest/incidents")
@RegisterRestClient
public interface IncidentClient {

    @GET
    @Retry(maxRetries = 4)
    Set<Incident> getIncidents(@QueryParam("api_key") String key);
}
