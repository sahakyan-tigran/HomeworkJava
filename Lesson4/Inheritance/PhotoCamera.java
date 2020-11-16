package HomeworkJava1.Lesson4.Inheritance;

public class PhotoCamera extends DigitalElectronic {
    int zoomingChance;

    public PhotoCamera(String name, String model, double cost, String country, int year, int numberOfPixels, int diagonal,int zoomingChance) {
        super(name, model, cost, country, year, numberOfPixels, diagonal);
        setZoomingChance(zoomingChance);
    }

    public int getZoomingChance() {
        return zoomingChance;
    }

    public void setZoomingChance(int zoomingChance) {
        this.zoomingChance = zoomingChance;
    }
}
