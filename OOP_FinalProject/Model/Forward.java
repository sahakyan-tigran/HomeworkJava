package Model;

import Interface.AttackingStylePlayer;

public class Forward extends FootballPlayer implements AttackingStylePlayer {
    int numberOfGoals;

    public Forward(String name, String achievement, int age, double rating, double speed, String club, String national_team, int numberOfGoals) {
        super(name, achievement, age, rating, speed, club, national_team);
        setNumberOfGoals(numberOfGoals);
    }

    public int getNumberOfGoals() {
        return numberOfGoals;
    }

    public void setNumberOfGoals(int numberOfGoals) {
        if (numberOfGoals >= 0) {
            this.numberOfGoals = numberOfGoals;
        } else System.out.println("Invalid number of goals");
    }

    @Override
    public void play() {
        System.out.println("The forward is scoring goal");
    }

    @Override
    public void train() {
        System.out.println("The forward is training");
    }

    @Override
    public void attack() {
        System.out.println(this.getName() + " is attacking");
    }

    @Override
    public void scoreGoal() {
        if (this.numberOfGoals > 5) {
            System.out.println(this.getName() + " scored goal");
        } else System.out.println(this.getName() + " could not score goal");
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "number of goals: " + numberOfGoals;
    }
}
