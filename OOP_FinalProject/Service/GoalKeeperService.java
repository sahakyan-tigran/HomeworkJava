package Service;

import Model.GoalKeeper;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.Scanner;

public class GoalKeeperService extends AthleteService {
    public void create() throws IOException {
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

        GoalKeeper gk = new GoalKeeper(name, achievement, age, rating, speed, club, national_team, countOfSaves);
        String data = String.join(",", gk.getName(), gk.getAchievement(), Integer.toString(gk.getAge()), Double.toString(gk.getRating()),
                Double.toString(gk.getSpeed()), gk.getClub(), gk.getNational_team(), Integer.toString(gk.getCountOfSaves()));

        Files.write(Paths.get("C:\\Users\\User\\Desktop\\FootballPlayers\\goalkeepers.txt"), data.getBytes(), StandardOpenOption.APPEND);

    }

    public GoalKeeper[] getAllGoalKeepers() throws IOException {
        String[] lines = Files.readAllLines(Paths.get("C:\\Users\\User\\Desktop\\FootballPlayers\\goalkeepers.txt")).toArray(new String[0]);
        GoalKeeper[] goalKeepers = new GoalKeeper[lines.length];
        for (int i = 0; i < goalKeepers.length; ++i) {
            String[] str = lines[i].split(",");
            goalKeepers[i] = new GoalKeeper(str[1], str[2], Integer.parseInt(str[3]), Double.parseDouble(str[4]),
                    Double.parseDouble(str[5]), str[6], str[7], Integer.parseInt(str[8]));
        }
        return goalKeepers;
    }

    public void printWith5AndMoreSaves(GoalKeeper[] goalKeepers){
        if(goalKeepers.length == 0){
            System.out.println("There is not goalkeeper");
            return;
        }
        for(GoalKeeper goalKeeper : goalKeepers){
            if(goalKeeper.getCountOfSaves() >= 5){
                System.out.println(goalKeeper);
            }
        }
    }
}