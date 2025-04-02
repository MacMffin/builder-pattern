package nl.test.builders;

import nl.test.interfaces.Builder;
import nl.test.model.ComputerManual;

public class ComputerManualBuilder implements Builder {
    private ComputerManual computerManual = new ComputerManual();

    @Override
    public void reset() {
        computerManual = new ComputerManual();
    }

    @Override
    public Builder withRAM(String ram) {
        this.computerManual.setRam(ram);
        return this;
    }

    @Override
    public Builder withCPU(String cpu) {
        this.computerManual.setCpu(cpu);
        return this;
    }

    @Override
    public Builder withMemory(int memory) {
        this.computerManual.setMemory(memory);
        return this;
    }

    @Override
    public Builder withOperatingSystem(String operatingSystem) {
        this.computerManual.setOperatingSystem(operatingSystem);
        return this;
    }

    public ComputerManual getResult() {
        return computerManual;
    }
}
