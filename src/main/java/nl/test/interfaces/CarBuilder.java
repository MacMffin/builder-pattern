package nl.test.interfaces;

public interface CarBuilder {
    void reset();

    CarBuilder withColor();

    CarBuilder withNiceSeats();

    CarBuilder withCompatibleRadio();

    CarBuilder withAppropriateRoof();

    Car getResult();
}
