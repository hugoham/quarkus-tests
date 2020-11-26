package be.district09.sf;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/panache")
public class PanacheResource {

    QuarkusService qs;

    public PanacheResource(QuarkusService qs) {
        this.qs = qs;
    }

    @GET
    @Path("/data")
    @Produces(MediaType.APPLICATION_JSON)
    public List<QuarkusData> getAllDataFromService(@QueryParam("field") String field, @QueryParam("value") String value) {

        if (!field.isBlank()) {

            if (field.equalsIgnoreCase("id")) {
                long id = Long.parseLong(value);
                return QuarkusData.list(field, id);
            }

            return QuarkusData.list(field, value);
        }

        return qs.getAllData();
    }

    @GET
    @Path("/data/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public QuarkusData getDataFromService(@PathParam("id") long id) {
        return qs.getData(id);
    }
}
