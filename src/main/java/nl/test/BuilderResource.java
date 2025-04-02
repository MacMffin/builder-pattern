package nl.test;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import nl.test.builders.ComputerBuilder;
import nl.test.builders.ComputerManualBuilder;
import nl.test.director.ComputerDirector;
import nl.test.model.Computer;
import nl.test.model.ComputerManual;

@Path("/build")
public class BuilderResource {

    @Inject
    ComputerDirector computerDirector;

    @Path("computer/highend")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Computer buildHighEndComputer() {
        ComputerBuilder builder = new ComputerBuilder();
        computerDirector.makeHighEndComputer(builder);
        return builder.getResult();
    }

    @Path("manual/highend")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ComputerManual buildHighEndComputerManual() {
        ComputerManualBuilder builder = new ComputerManualBuilder();
        computerDirector.makeHighEndComputer(builder);
        return builder.getResult();
    }

    @Path("computer/lowbudget")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Computer buildLowBudgetComputer() {
        ComputerBuilder builder = new ComputerBuilder();
        computerDirector.makeLowBudgetComputer(builder);
        return builder.getResult();
    }

    @Path("manual/lowbudget")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ComputerManual buildLowBudgetComputerManual() {
        ComputerManualBuilder builder = new ComputerManualBuilder();
        computerDirector.makeLowBudgetComputer(builder);
        return builder.getResult();
    }
}
