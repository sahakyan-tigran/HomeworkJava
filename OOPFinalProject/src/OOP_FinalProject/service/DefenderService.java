package OOP_FinalProject.service;

import OOP_FinalProject.model.Defender;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DefenderService extends AthleteService {

    private static final Path path = Paths.get("C:\\Users\\User\\Desktop\\FootballPlayers\\defenders.txt");

    private static final DefenderService instance = new DefenderService();

    private DefenderService() {
    }

    public static DefenderService getInstance() {
        return instance;
    }

    public void create() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter defender name");
        String name = s.nextLine();
        System.out.println("Enter defender achievement");
        String achievement = s.nextLine();
        System.out.println("Enter defender age");
        int age = s.nextInt();
        System.out.println("Enter defender rating");
        double rating = s.nextDouble();
        System.out.println("Enter defender speed");
        double speed = s.nextDouble();
        s.nextLine();
        System.out.println("Enter defender club");
        String club = s.nextLine();
        System.out.println("Enter defender national team");
        String national_team = s.nextLine();
        System.out.println("Enter defender number of tackles");
        int numberOfTackles = s.nextInt();
        System.out.println("Enter defender isTall");
        boolean isTall = s.nextBoolean();

        Defender df;
        try {
            df = new Defender(name, achievement, age, rating, speed, club, national_team, numberOfTackles, isTall);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }
        String data = String.join(",", df.getName(), df.getAchievement(), Integer.toString(df.getAge()), Double.toString(df.getRating()),
                Double.toString(df.getSpeed()), df.getClub(), df.getNational_team(), Integer.toString(df.getNumberOfTackles()), Boolean.toString(df.isTall()));
        data = data.concat("\n");
        try {
            Files.write(path, data.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("Can`t write the defender in file");
        }
    }

    public List<Defender> getAllDefenders() {
        List<String> lines = null;
        try {
            lines = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<Defender> defenders = new ArrayList<>();
        for (String line : lines) {
            String[] s = line.split(",");
            defenders.add(new Defender(s[0], s[1], Integer.parseInt(s[2]), Double.parseDouble(s[3]),
                    Double.parseDouble(s[6]), s[5], s[6], Integer.parseInt(s[7]), Boolean.parseBoolean(s[8])));
        }
        return defenders;
    }

    public void printAllTallDefenders(List<Defender> defenders) {
        if (defenders.isEmpty()) {
            System.out.println("There is not defenders");
            return;
        }
        for (Defender defender : defenders) {
            if (defender.isTall()) {
                System.out.println(defender + "\n");
            }
        }
    }
}
