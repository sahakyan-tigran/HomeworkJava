package OOP_FinalProject.model;

import Interface.DefenciveStylePlayer;

public class Defender extends FootballPlayer implements DefenciveStylePlayer {
    private int numberOfTackles;
    private boolean isTall;

    public Defender(String name, String achievement, int age, double rating, double speed, String club, String national_team, int numberOfTackles, boolean isTall) {
        super(name, achievement, age, rating, speed, club, national_team);
        setNumberOfTackles(numberOfTackles);
        this.isTall = isTall;
    }

    public int getNumberOfTackles() {
        return numberOfTackles;
    }

    public void setNumberOfTackles(int numberOfTackles) {
        if (numberOfTackles >= 0) {
            this.numberOfTackles = numberOfTackles;
        } else System.out.println("Invalid number of tackles");
    }

    public boolean isTall() {
        return isTall;
    }

    public void setTall(boolean tall) {
        isTall = tall;
    }

    @Override
    public void play() {
        System.out.println("The defender stop the other's team attack");
    }

    @Override
    public void train() {
        System.out.println("The defender is training");
    }

    @Override
    public void defend() {
        System.out.println(this.getName() + " is defending");
    }

    @Override
    public void scoreWhileCorner() {
        if (isTall()) {
            System.out.println(this.getName() + " scored a goal");
        } else System.out.println(this.getName() + " can`t score a goal");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("\n").append("number of tackles: ").append(numberOfTackles).append("\n").append("isTall: ").append(isTall);
        return sb.toString();
    }
}
