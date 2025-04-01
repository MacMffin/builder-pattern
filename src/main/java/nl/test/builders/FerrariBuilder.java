package nl.test.builders;

import nl.test.interfaces.Car;
import nl.test.interfaces.CarBuilder;
import nl.test.model.Ferrari;

public class FerrariBuilder implements CarBuilder {
    private Ferrari ferrari = new Ferrari();

    @Override
    public void reset() {
        ferrari = new Ferrari();
    }

    @Override
    public CarBuilder withColor() {
        this.ferrari.setColor("Ferrari Red");
        return this;
    }

    @Override
    public CarBuilder withNiceSeats() {
        this.ferrari.setSeats("Maranello's Tailor Made");
        return this;
    }

    @Override
    public CarBuilder withCompatibleRadio() {
        this.ferrari.setRadio("Ferrari Genuine 1DIN Infotainment System");
        return this;
    }

    @Override
    public CarBuilder withAppropriateRoof() {
        this.ferrari.setRoof("Open roof");
        return this;
    }

    @Override
    public Car getResult() {
        return ferrari;
    }
}
