package nl.test.model;

import lombok.Getter;

@Getter
public class ComputerManual {
    private String ram;
    private String cpu;
    private String memory;
    private String operatingSystem;

    public void setRam(String ram) {
        this.ram = "The computer manages a total of %s in RAM".formatted(ram);
    }

    public void setCpu(String cpu) {
        this.cpu = "The computer uses a %s CPU".formatted(cpu);
    }

    public void setMemory(int memory) {
        this.memory = "The computer has a total of %s GB HDD memory".formatted(memory);
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = "The computer runs a %s operating system".formatted(operatingSystem);
    }
}
