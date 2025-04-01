package nl.test.builders;

import nl.test.interfaces.Car;
import nl.test.interfaces.CarBuilder;
import nl.test.model.Renault;

public class RenaultBuilder implements CarBuilder {
    private Renault renault = new Renault();

    @Override
    public void reset() {
        renault = new Renault();
    }

    @Override
    public CarBuilder withColor() {
        this.renault.setColor("Houblon Metallic");
        return this;
    }

    @Override
    public CarBuilder withNiceSeats() {
        this.renault.setSeats("Renault Trafic Fully Tailored Waterproof Front Set Seat Covers 2001 Onwards Heavy Duty Right Hand Drive Beige");
        return this;
    }

    @Override
    public CarBuilder withCompatibleRadio() {
        this.renault.setRadio("CARPURIDE W609 Portable Smart Multimedia Dashboard Console");
        return this;
    }

    @Override
    public CarBuilder withAppropriateRoof() {
        this.renault.setRoof("Just roof");
        return this;
    }

    @Override
    public Car getResult() {
        return renault;
    }
}
