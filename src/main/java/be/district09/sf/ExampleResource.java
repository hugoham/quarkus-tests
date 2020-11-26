package be.district09.sf;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/rest")
public class ExampleResource {

    QuarkusService qs;

    public ExampleResource(QuarkusService qs) {
        this.qs = qs;
    }

    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello";
    }

    @GET
    @Path("/service")
    @Produces(MediaType.APPLICATION_JSON)
    public QuarkusData getDataFromService() {
        return qs.getData(1L);
    }

    @GET
    @Path("/data")
    @Produces(MediaType.APPLICATION_JSON)
    public List<QuarkusData> getAllDataFromService() {
        return qs.getAllData();
    }

    @GET
    @Path("/data/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public QuarkusData getDataFromService(@PathParam("id") long id) {
        return qs.getData(id);
    }
}