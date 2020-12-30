package OOP_FinalProject.model;

public abstract class FootballPlayer extends Athlete {
    private String club;
    private String national_team;

    public abstract void play();

    public abstract void train();

    public FootballPlayer(String name, String achievement, int age, double rating, double speed, String club, String national_team) {
        super(name, achievement, age, rating, speed);
        setClub(club);
        setNational_team(national_team);
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        if (club != null && !club.isEmpty()) {
            this.club = club;
        } else System.out.println("Invalid club");
    }

    public String getNational_team() {
        return national_team;
    }

    public void setNational_team(String national_team) {
        if (national_team != null && !national_team.isEmpty()) {
            this.national_team = national_team;
        } else System.out.println("Invalid national_team");
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "club: " + club + "\n" +
                "national team: " + national_team;
    }
}
