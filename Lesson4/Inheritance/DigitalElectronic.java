package HomeworkJava1.Lesson4.Inheritance;

public class DigitalElectronic extends Electronic {
    private int numberOfPixels;
    private int diagonal;

    public DigitalElectronic(String name, String model, double cost, String country, int year, int numberOfPixels, int diagonal) {
        super(name, model, cost, country, year);
        setNumberOfPixels(numberOfPixels);
        setDiagonal(diagonal);
    }

    public int getNumberOfPixels() {
        return numberOfPixels;
    }

    public void setNumberOfPixels(int numberOfPixels) {
        if (numberOfPixels > 0) {
            this.numberOfPixels = numberOfPixels;
        } else {
            System.out.println("invalid number of pixels");
        }
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        if (diagonal > 0) {
            this.diagonal = diagonal;
        } else {
            System.out.println("invalid diagonal");
        }
    }
}
