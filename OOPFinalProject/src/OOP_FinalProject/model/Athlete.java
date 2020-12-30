package OOP_FinalProject.model;

public abstract class Athlete {
    private String name;
    private String achievement;
    private int age;
    private double rating;
    private double speed;

    public Athlete(String name, String achievement, int age, double rating, double speed) {
        setName(name);
        setAchievement(achievement);
        setAge(age);
        setRating(rating);
        setSpeed(speed);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else System.out.println("Invalid name");
    }

    public String getAchievement() {
        return achievement;
    }

    public void setAchievement(String achievement) {
        if (achievement != null && !achievement.isEmpty()) {
            this.achievement = achievement;
        } else System.out.println("Invalid achievement");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 18 && age < 60) {
            this.age = age;
        } else System.out.println("Invalid age,please enter number between 18 to 60");
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if (rating >= 0.0 && rating <= 100.0) {
            this.rating = rating;
        } else System.out.println("Invalid rating,please enter number between 0 to 100");
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        if (speed > 0.0) {
            this.speed = speed;
        } else System.out.println("Invalid speed");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("name: ").append(name).append("\n").append("age: ").append(age).append("\n").append("achievement: ").
                append(achievement).append("\n").append("rating: ").append(rating).append("\n").append("speed: ").
                append(speed).append("km/h");
        return sb.toString();
    }
}
