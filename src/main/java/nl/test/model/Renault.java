package nl.test.model;

import lombok.Getter;
import lombok.Setter;
import nl.test.interfaces.Car;

@Getter
@Setter
public class Renault implements Car {
    private String color;
    private String seats;
    private String radio;
    private String roof;
}
