package OOP_FinalProject.model;

public class GoalKeeper extends FootballPlayer {
    private int countOfSaves;

    public GoalKeeper(String name, String achievement, int age, double rating, double speed, String club, String national_team, int countOfSaves) {
        super(name, achievement, age, rating, speed, club, national_team);
        setCountOfSaves(countOfSaves);
    }

    public int getCountOfSaves() {
        return countOfSaves;
    }

    public void setCountOfSaves(int countOfSaves) {
        if (countOfSaves >= 0) {
            this.countOfSaves = countOfSaves;
        }
    }


    @Override
    public void play() {
        System.out.println("The goalkeeper stop the other team from scoring by catching.");
    }

    @Override
    public void train() {
        System.out.println("The goalkeeper catching palming and punching the ball from shots, headers and crosses.");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("\n").append("count of saves: ").append(countOfSaves);
        return sb.toString();
    }
}
