package Service;

import Model.Defender;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class DefenderService extends AthleteService{
    public void create() throws IOException {
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

        Defender df = new Defender(name, achievement, age, rating, speed, club, national_team, numberOfTackles, isTall);
        String data = String.join(",", df.getName(), df.getAchievement(), Integer.toString(df.getAge()), Double.toString(df.getRating()),
                Double.toString(df.getSpeed()), df.getClub(), df.getNational_team(), Integer.toString(df.getNumberOfTackles()), Boolean.toString(df.isTall()));

        Files.write(Paths.get("C:\\Users\\User\\Desktop\\FootballPlayers\\defenders.txt"), data.getBytes(), StandardOpenOption.APPEND);
    }

    public Defender[] getAllDefenders() throws IOException {
        String[] lines = new String[0];
        lines = Files.readAllLines(Paths.get("C:\\Users\\User\\Desktop\\FootballPlayers\\defenders.txt")).toArray(new String[0]);
        Defender[] defenders = new Defender[lines.length];
        for (int i = 0; i < defenders.length; ++i) {
            String[] str = lines[i].split(",");
            defenders[i] = new Defender(str[1], str[2], Integer.parseInt(str[3]), Double.parseDouble(str[4]),
                    Double.parseDouble(str[5]), str[6], str[7], Integer.parseInt(str[8]), Boolean.parseBoolean(str[9]));
        }
        return defenders;
    }

    public void printAllTallDefenders(Defender[] defenders){
        if (defenders.length == 0){
            System.out.println("There is not defenders");
            return;
        }
        for(Defender defender : defenders){
            if(defender.isTall()){
                System.out.println(defender);
            }
        }
    }
}
