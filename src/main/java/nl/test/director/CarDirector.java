package nl.test.director;

import jakarta.enterprise.context.ApplicationScoped;
import nl.test.interfaces.Car;
import nl.test.interfaces.CarBuilder;
import nl.test.model.PriceRange;

@ApplicationScoped
public class CarDirector {

    public Car makeCar(CarBuilder carBuilder, PriceRange range) {
        carBuilder.reset();

        return switch (range) {
            case CHEAP -> carBuilder.withColor()
                    .getResult();
            case AVERAGE -> carBuilder.withColor()
                    .withNiceSeats()
                    .getResult();
            case EXPENSIVE -> carBuilder.withColor()
                    .withCompatibleRadio()
                    .withNiceSeats()
                    .withAppropriateRoof()
                    .getResult();
        };
    }

}
