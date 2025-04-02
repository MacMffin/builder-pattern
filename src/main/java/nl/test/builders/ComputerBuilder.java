package nl.test.builders;

import nl.test.interfaces.Builder;
import nl.test.model.Computer;

public class ComputerBuilder implements Builder {
    private Computer computer = new Computer();

    @Override
    public void reset() {
        this.computer = new Computer();
    }

    @Override
    public Builder withRAM(String ram) {
        this.computer.setRam(ram);
        return this;
    }

    @Override
    public Builder withCPU(String cpu) {
        this.computer.setCpu(cpu);
        return this;
    }

    @Override
    public Builder withMemory(int memory) {
        this.computer.setMemory(memory);
        return this;
    }

    @Override
    public Builder withOperatingSystem(String operatingSystem) {
        this.computer.setOperatingSystem(operatingSystem);
        return this;
    }

    public Computer getResult() {
        return computer;
    }
}
