package HomeworkJava1.Lesson4.Inheritance;

public class Computer extends DigitalElectronic{
    private double RAM;
    private double memory;

    public Computer(String name, String model, double cost, String country, int year, int numberOfPixels, int diagonal,int RAM,int memory) {
        super(name, model, cost, country, year, numberOfPixels, diagonal);
        setRAM(RAM);
        setMemory(memory);
    }

    public double getRAM() {
        return RAM;
    }

    public void setRAM(double RAM) {
        this.RAM = RAM;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }
}
