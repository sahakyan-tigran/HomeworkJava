package HomeworkJava1.Lesson4.Inheritance;

public class Refrigerator extends Electronic {
    private double degreeOfFreezing;

    public Refrigerator(String name, String model, double cost, String country, int year, double degreeOfFreezing) {
        super(name, model, cost, country, year);
        setDegreeOfFreezing(degreeOfFreezing);
    }

    public double getDegreeOfFreezing() {
        return degreeOfFreezing;
    }

    public void setDegreeOfFreezing(double degreeOfFreezing) {
        this.degreeOfFreezing = degreeOfFreezing;
    }
}
