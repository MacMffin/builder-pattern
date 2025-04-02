package nl.test.director;

import jakarta.enterprise.context.ApplicationScoped;
import nl.test.interfaces.Builder;

@ApplicationScoped
public class ComputerDirector {

    public void makeLowBudgetComputer(Builder builder) {
        builder.reset();
        builder.withMemory(100);
        builder.withCPU("AMD Ryzen 7 5700G");
        builder.withRAM("8GB");
        builder.withOperatingSystem("Windows");
    }

    public void makeHighEndComputer(Builder builder) {
        builder.reset();
        builder.withMemory(1000);
        builder.withCPU("AMD Ryzen 7 9800X3D");
        builder.withRAM("32GB");
        builder.withOperatingSystem("Windows");
    }

}
