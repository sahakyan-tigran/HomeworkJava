package Service;

import Model.Athlete;

public class AthleteService {
    public void printAll(Athlete[] athletes){
        if(athletes.length == 0){
            System.out.println("There are not athletes.");
            return;
        }
        for(Athlete athlete : athletes){
            System.out.println(athlete);
        }
    }

    public void printBiggerThan25(Athlete[] athletes) {
        if(athletes.length == 0){
            System.out.println("There are not athletes.");
            return;
        }
        boolean flag = true;
        for (Athlete athlete : athletes){
            if(athlete.getAge() > 25){
                flag = false;
                System.out.println(athlete);
            }
        }
        if(flag) System.out.println("There is no athlete who`s age is bigger than 25.");
    }

    public void printWithSpeedLessThan15(Athlete[] athletes){
        if(athletes.length == 0){
            System.out.println("There are not athletes.");
            return;
        }
        boolean flag = true;
        for (Athlete athlete : athletes){
            if(athlete.getSpeed() < 15){
                flag = false;
                System.out.println(athlete);
            }
        }
        if(flag) System.out.println("There is no athlete who`s speed is less than 15.");
    }

    public void printByRating(Athlete[] athletes){
        if(athletes.length == 0){
            System.out.println("There are not athletes.");
            return;
        }
        for (int i = 0; i < athletes.length; i++) {
            for (int j = i + 1; j < athletes.length ; j++) {
                if(athletes[i].getRating() > athletes[j].getRating()){
                    Athlete tmp = athletes[i];
                    athletes[i] = athletes[j];
                    athletes[j] = tmp;
                }
            }
        }
        for(Athlete athlete : athletes){
            System.out.println(athlete);
        }
    }
}
