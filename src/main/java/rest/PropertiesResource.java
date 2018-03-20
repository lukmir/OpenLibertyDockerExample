package rest;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("properties")
public class PropertiesResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject getProperties() {

        JsonObjectBuilder jsonObjectBuilder = Json.createObjectBuilder();

        System.getProperties().entrySet().forEach(
                entry -> jsonObjectBuilder.add((String) entry.getKey(),
                        (String) entry.getValue())
        );

        return jsonObjectBuilder.build();
    }
}
