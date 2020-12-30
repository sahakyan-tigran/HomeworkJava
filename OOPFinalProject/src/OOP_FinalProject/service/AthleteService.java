package OOP_FinalProject.service;

import OOP_FinalProject.model.Athlete;

import java.util.List;

public class AthleteService {
    public void printAll(List<? extends Athlete> athletes) {
        if (athletes.isEmpty()) {
            System.out.println("There are not athletes.");
            return;
        }
        for (Athlete athlete : athletes) {
            System.out.println(athlete + "\n");
        }
    }

    public void printBiggerThan25(List<? extends Athlete> athletes) {
        if (athletes.isEmpty()) {
            System.out.println("There are not athletes.");
            return;
        }
        boolean flag = true;
        for (Athlete athlete : athletes) {
            if (athlete.getAge() > 25) {
                flag = false;
                System.out.println(athlete + "\n");
            }
        }
        if (flag) System.out.println("There is no athlete who`s age is bigger than 25.");
    }

    public void printWithSpeedLessThan15(List<? extends Athlete> athletes) {
        if (athletes.isEmpty()) {
            System.out.println("There are not athletes.");
            return;
        }
        boolean flag = true;
        for (Athlete athlete : athletes) {
            if (athlete.getSpeed() < 15) {
                flag = false;
                System.out.println(athlete + "\n");
            }
        }
        if (flag) System.out.println("There is no athlete who`s speed is less than 15.");
    }

    public void printByRating(List<? extends Athlete> athletes) {
        if (athletes.isEmpty()) {
            System.out.println("There are not athletes.");
            return;
        }
        athletes.sort(((o1, o2) -> (int) (o1.getRating() - o2.getRating())));
        for (Athlete athlete : athletes) {
            System.out.println(athlete + "\n");
        }
    }
}
