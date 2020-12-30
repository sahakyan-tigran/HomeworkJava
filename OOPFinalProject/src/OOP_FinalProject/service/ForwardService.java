package OOP_FinalProject.service;

import OOP_FinalProject.model.Forward;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ForwardService extends AthleteService {

    private static final Path path = Paths.get("C:\\Users\\User\\Desktop\\FootballPlayers\\forwards.txt");

    private static final ForwardService instance = new ForwardService();

    private ForwardService() {
    }

    public static ForwardService getInstance() {
        return instance;
    }

    public void create() {
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

        Forward fw;
        try {
            fw = new Forward(name, achievement, age, rating, speed, club, national_team, numberOfGoals);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }
        String data = String.join(",", fw.getName(), fw.getAchievement(), Integer.toString(fw.getAge()), Double.toString(fw.getRating()),
                Double.toString(fw.getSpeed()), fw.getClub(), fw.getNational_team(), Integer.toString(fw.getNumberOfGoals()));
        data = data.concat("\n");
        try {
            Files.write(path, data.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("Can`t write forward in file");
        }
    }

    public List<Forward> getAllForwards() {
        List<String> lines = null;
        try {
            lines = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<Forward> forwards = new ArrayList<>();
        for (String line : lines) {
            String[] s = line.split(",");
            forwards.add(new Forward(s[0], s[1], Integer.parseInt(s[2]), Double.parseDouble(s[3]),
                    Double.parseDouble(s[4]), s[5], s[6], Integer.parseInt(s[7])));
        }
        return forwards;
    }

    public void printWith10AndMoreGoals(List<Forward> forwards) {
        if (forwards.isEmpty()) {
            System.out.println("There is not forward");
            return;
        }
        for (Forward forward : forwards) {
            if (forward.getNumberOfGoals() >= 10) {
                System.out.println(forward + "\n");
            }
        }
    }
}
