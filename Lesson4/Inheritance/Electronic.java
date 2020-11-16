package HomeworkJava1.Lesson4.Inheritance;

public class Electronic {
    private String name;
    private String model;
    private double cost;
    private String country;
    private int year;

    public Electronic(String name, String model, double cost, String country, int year) {
        setName(name);
        setModel(model);
        setCost(cost);
        setCountry(country);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("invalid name");
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model != null && !model.isEmpty()) {
            this.model = model;
        } else {
            System.out.println("invalid model");
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost >= 0) {
            this.cost = cost;
        } else {
            System.out.println("invalid cost");
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country != null && !country.isEmpty()) {
            this.country = country;
        } else {
            System.out.println("invalid country");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1976 && year <= 2020) {
            this.year = year;
        } else {
            System.out.println("invalid year");
        }
    }
}
