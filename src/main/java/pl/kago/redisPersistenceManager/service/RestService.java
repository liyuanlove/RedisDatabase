package pl.kago.redisPersistenceManager.service;

import pl.kago.redisPersistenceManager.api.IPersistenceManager;

import javax.inject.Inject;
import javax.jws.WebParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/persistence")
public class RestService {

    @Inject
    IPersistenceManager persistenceManager;

    @GET
    @Path("/version")
    public Response getVersion() {
        return Response.accepted("1.0-SNAPSHOT").build();
    }

    @GET
    @Consumes(MediaType.TEXT_PLAIN)
    @Path("/insertBatch/{iterations}")
    public Response insertBatch(@PathParam("iterations") int iterations) {
        persistenceManager.updateRowBatch(iterations);
        return Response.ok().build();
    }

}
