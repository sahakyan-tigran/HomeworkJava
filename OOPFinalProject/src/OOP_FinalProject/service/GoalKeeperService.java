package OOP_FinalProject.service;

import OOP_FinalProject.model.GoalKeeper;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoalKeeperService extends AthleteService {

    private static final Path path = Paths.get("C:\\Users\\User\\Desktop\\FootballPlayers\\goalkeepers.txt");

    private static final GoalKeeperService instance = new GoalKeeperService();

    private GoalKeeperService() {
    }

    public static GoalKeeperService getInstance() {
        return instance;
    }

    public void create() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter goalkeeper name");
        String name = s.nextLine();
        System.out.println("Enter goalkeeper achievement");
        String achievement = s.nextLine();
        System.out.println("Enter goalkeeper age");
        int age = s.nextInt();
        System.out.println("Enter goalkeeper rating");
        double rating = s.nextDouble();
        System.out.println("Enter goalkeeper speed");
        double speed = s.nextDouble();
        s.nextLine();
        System.out.println("Enter goalkeeper club");
        String club = s.nextLine();
        System.out.println("Enter goalkeeper national team");
        String national_team = s.nextLine();
        System.out.println("Enter goalkeeper count of saves");
        int countOfSaves = s.nextInt();

        GoalKeeper gk;
        try {
            gk = new GoalKeeper(name, achievement, age, rating, speed, club, national_team, countOfSaves);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }
        String data = String.join(",", gk.getName(), gk.getAchievement(), Integer.toString(gk.getAge()), Double.toString(gk.getRating()),
                Double.toString(gk.getSpeed()), gk.getClub(), gk.getNational_team(), Integer.toString(gk.getCountOfSaves()));
        data = data.concat("\n");
        try {
            Files.write(path, data.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("Can`t write goalkeeper in file");
        }

    }

    public List<GoalKeeper> getAllGoalKeepers() {
        List<String> lines = null;
        try {
            lines = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<GoalKeeper> goalKeepers = new ArrayList<>();
        for (String line : lines) {
            String[] s = line.split(",");
            goalKeepers.add(new GoalKeeper(s[0], s[1], Integer.parseInt(s[2]), Double.parseDouble(s[3]),
                    Double.parseDouble(s[4]), s[5], s[6], Integer.parseInt(s[7])));
        }
        return goalKeepers;
    }

    public void printWith5AndMoreSaves(List<GoalKeeper> goalKeepers) {
        if (goalKeepers.isEmpty()) {
            System.out.println("There is not goalkeeper");
            return;
        }
        for (GoalKeeper goalKeeper : goalKeepers) {
            if (goalKeeper.getCountOfSaves() >= 5) {
                System.out.println(goalKeeper + "\n");
            }
        }
    }
}