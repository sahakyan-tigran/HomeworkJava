package OOP_FinalProject.menu;

import OOP_FinalProject.service.DefenderService;
import OOP_FinalProject.service.ForwardService;
import OOP_FinalProject.service.GoalKeeperService;

import java.util.Scanner;

public class AthleteMenu {
    private static final Scanner s = new Scanner(System.in);

    public static void startMenu() {
        boolean flag = true;
        while (flag) {
            System.out.println("Hi");
            System.out.println("-----------------------------------------------");
            System.out.println("For goalkeepers menu enter 1");
            System.out.println("For defenders menu enter 2");
            System.out.println("For forwards menu enter 3");
            System.out.println("For exit enter 4");
            int n = s.nextInt();
            switch (n) {
                case 1:
                    goalkeepersMenu();
                    break;
                case 2:
                    defendersMenu();
                    break;
                case 3:
                    forwardsMenu();
                    break;
                case 4:
                    System.out.println("Menu is closing,bye.");
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid number,enter from 1 - 4.");
                    break;
            }
        }
    }

    public static void goalkeepersMenu() {
        GoalKeeperService gks = GoalKeeperService.getInstance();
        boolean flag = true;
        while (flag) {
            System.out.println("You are on goalkeepers menu");
            System.out.println("-----------------------------------------------");
            System.out.println("1.Create goalkeeper");
            System.out.println("2.Print all goalkeepers");
            System.out.println("3.Print goalkeepers bigger than 25");
            System.out.println("4.Print goalkeepers whose speed is less than 15km/h");
            System.out.println("5.Print goalkeepers by rating");
            System.out.println("6.Print goalkeepers whose saves are more than 5");
            System.out.println("7.Go to start menu");
            int n = s.nextInt();
            switch (n) {
                case 1:
                    gks.create();
                    break;
                case 2:
                    gks.printAll(gks.getAllGoalKeepers());
                    break;
                case 3:
                    gks.printBiggerThan25(gks.getAllGoalKeepers());
                    break;
                case 4:
                    gks.printWithSpeedLessThan15(gks.getAllGoalKeepers());
                    break;
                case 5:
                    gks.printByRating(gks.getAllGoalKeepers());
                    break;
                case 6:
                    gks.printWith5AndMoreSaves(gks.getAllGoalKeepers());
                    break;
                case 7:
                    System.out.println("Going to start menu");
                    flag = false;
                    break;
                default:
                    System.out.println("Please, enter valid number");
                    break;
            }
        }
    }

    public static void defendersMenu() {
        DefenderService dfs = DefenderService.getInstance();
        boolean flag = true;
        while (flag) {
            System.out.println("You are on defenders menu");
            System.out.println("-----------------------------------------------");
            System.out.println("1.Create defender");
            System.out.println("2.Print all defenders");
            System.out.println("3.Print defenders bigger than 25");
            System.out.println("4.Print defenders whose speed is less than 15km/h");
            System.out.println("5.Print defenders by rating");
            System.out.println("6.Print all tall defenders");
            System.out.println("7.Go to start menu");
            int n = s.nextInt();
            switch (n) {
                case 1:
                    dfs.create();
                    break;
                case 2:
                    dfs.printAll(dfs.getAllDefenders());
                    break;
                case 3:
                    dfs.printBiggerThan25(dfs.getAllDefenders());
                    break;
                case 4:
                    dfs.printWithSpeedLessThan15(dfs.getAllDefenders());
                    break;
                case 5:
                    dfs.printByRating(dfs.getAllDefenders());
                    break;
                case 6:
                    dfs.printAllTallDefenders(dfs.getAllDefenders());
                    break;
                case 7:
                    System.out.println("Going to start menu");
                    flag = false;
                    break;
                default:
                    System.out.println("Please, enter valid number");
                    break;
            }
        }
    }

    public static void forwardsMenu() {
        ForwardService fws = ForwardService.getInstance();
        boolean flag = true;
        while (flag) {
            System.out.println("You are on forwards menu");
            System.out.println("-----------------------------------------------");
            System.out.println("1.Create forward");
            System.out.println("2.Print all forwards");
            System.out.println("3.Print forwards bigger than 25");
            System.out.println("4.Print forwards whose speed is less than 15km/h");
            System.out.println("5.Print forwards by rating");
            System.out.println("6.Print forwards with more than 10 goals");
            System.out.println("7.Go to start menu");
            int n = s.nextInt();
            switch (n) {
                case 1:
                    fws.create();
                    break;
                case 2:
                    fws.printAll(fws.getAllForwards());
                    break;
                case 3:
                    fws.printBiggerThan25(fws.getAllForwards());
                    break;
                case 4:
                    fws.printWithSpeedLessThan15(fws.getAllForwards());
                    break;
                case 5:
                    fws.printByRating(fws.getAllForwards());
                    break;
                case 6:
                    fws.printWith10AndMoreGoals(fws.getAllForwards());
                    break;
                case 7:
                    System.out.println("Going to start menu");
                    flag = false;
                    break;
                default:
                    System.out.println("Please, enter valid number");
                    break;
            }
        }
    }
}