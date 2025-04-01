package nl.test;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import nl.test.builders.FerrariBuilder;
import nl.test.builders.RenaultBuilder;
import nl.test.director.CarDirector;
import nl.test.interfaces.Car;
import nl.test.interfaces.CarBuilder;
import nl.test.model.PriceRange;

@Path("/build")
public class BuilderResource {

    @Inject
    CarDirector carDirector;

    @Path("ferrari")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Car buildFerrari() {
        CarBuilder builder = new FerrariBuilder();
        return carDirector.makeCar(builder, PriceRange.EXPENSIVE);
    }

    @Path("renault")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Car buildRenault() {
        CarBuilder builder = new RenaultBuilder();
        return carDirector.makeCar(builder, PriceRange.EXPENSIVE);
    }
}
