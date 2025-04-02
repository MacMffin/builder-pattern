package nl.test.interfaces;

public interface Builder {
    void reset();

    Builder withRAM(String ram);

    Builder withCPU(String cpu);

    Builder withMemory(int memory);

    Builder withOperatingSystem(String operatingSystem);
}
