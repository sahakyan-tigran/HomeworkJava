package Service;

import Model.Forward;
import Model.GoalKeeper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class ForwardService extends AthleteService {
    public void create() throws IOException {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter forward name");
        String name = s.nextLine();
        System.out.println("Enter forward achievement");
        String achievement = s.nextLine();
        System.out.println("Enter forward age");
        int age = s.nextInt();
        System.out.println("Enter forward rating");
        double rating = s.nextDouble();
        System.out.println("Enter forward speed");
        double speed = s.nextDouble();
        s.nextLine();
        System.out.println("Enter forward club");
        String club = s.nextLine();
        System.out.println("Enter forward national team");
        String national_team = s.nextLine();
        System.out.println("Enter forward number of goals");
        int numberOfGoals = s.nextInt();

        Forward fw = new Forward(name, achievement, age, rating, speed, club, national_team, numberOfGoals);
        String data = String.join(",", fw.getName(), fw.getAchievement(), Integer.toString(fw.getAge()), Double.toString(fw.getRating()),
                Double.toString(fw.getSpeed()), fw.getClub(), fw.getNational_team(), Integer.toString(fw.getNumberOfGoals()));

        Files.write(Paths.get("C:\\Users\\User\\Desktop\\FootballPlayers\\forwards.txt"), data.getBytes(), StandardOpenOption.APPEND);
    }

    public Forward[] getAllForwards() throws IOException {
        String[] lines = new String[0];
        lines = Files.readAllLines(Paths.get("C:\\Users\\User\\Desktop\\FootballPlayers\\forwards.txt")).toArray(new String[0]);
        Forward[] forwards = new Forward[lines.length];
        for (int i = 0; i < forwards.length; ++i) {
            String[] str = lines[i].split(",");
            forwards[i] = new Forward(str[1], str[2], Integer.parseInt(str[3]), Double.parseDouble(str[4]),
                    Double.parseDouble(str[5]), str[6], str[7], Integer.parseInt(str[8]));
        }
        return forwards;
    }

    public void printWith10AndMoreGoals(Forward[] forwards) {
        if (forwards.length == 0) {
            System.out.println("There is not forward");
            return;
        }
        for (Forward forward : forwards) {
            if (forward.getNumberOfGoals() >= 10) {
                System.out.println(forward);
            }
        }
    }
}
