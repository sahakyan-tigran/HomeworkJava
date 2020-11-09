package Airport.Model;
public class Plane {
    private String model;
    private String country;
    private int year;
    private double hours;
    private boolean military;
    private String engineType;
    private double weight;
    private double wingspan;
    private double topSpeed;
    private int seats;
    private double cost;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model.length() != 0) {
            this.model = model;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country.length() != 0) {
            this.country = country;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1903 && year <= 2020) {
            this.year = year;
        }
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if (hours >= 0.0 && hours <= 10000.0) {
            this.hours = hours;
        }
    }

    public boolean isMilitary() {
        return military;
    }

    public void setMilitary(boolean military) {
        this.military = military;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        if (engineType.length() != 0) {
            this.engineType = engineType;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight >= 1000.0 && weight <= 160000.0) {
            this.weight = weight;
        }
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        if (wingspan >= 10.0 && wingspan <= 45.0) {
            this.wingspan = wingspan;
        }
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        if (topSpeed >= 0) {
            this.topSpeed = topSpeed;
        }
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        if (seats >= 0) {
            this.seats = seats;
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost >= 0) {
            this.cost = cost;
        }
    }
}
