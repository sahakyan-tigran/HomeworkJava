package Airport.service;

import Airport.Model.Plane;

import java.util.Scanner;

public class PlaneService {
    public void printInformation(Plane p) {
        System.out.println("model - " + p.getModel());
        System.out.println("country - " + p.getCountry());
        System.out.println("year - " + p.getYear());
        System.out.println("hours - " + p.getHours());
        System.out.println("military - " + p.isMilitary());
        System.out.println("engineType - " + p.getEngineType());
        System.out.println("weight - " + p.getWeight());
        System.out.println("wingspan - " + p.getWingspan());
        System.out.println("topSpeed - " + p.getTopSpeed());
        System.out.println("seats - " + p.getSeats());
        System.out.println("cost - " + p.getCost());
    }

    public void printSomeInfo(Plane p) {
        if (p.isMilitary()) {
            System.out.println("cost - " + p.getCost());
            System.out.println("topSpeed - " + p.getTopSpeed());
        } else {
            System.out.println("model - " + p.getModel());
            System.out.println("country - " + p.getCountry());
        }
    }

    public Plane newer(Plane p1, Plane p2) {
        if (p1.getYear() >= p2.getYear()) {
            return p1;
        } else {
            return p2;
        }
    }

    public Plane biggerWingspan(Plane p1, Plane p2) {
        if (p1.getWingspan() > p2.getWingspan()) {
            return p1;
        } else {
            return p2;
        }
    }

    public Plane MostExpensive(Plane p1, Plane p2, Plane p3) {
        if (p1.getCost() >= p2.getCost() && p1.getCost() >= p3.getCost()) {
            return p1;
        } else if (p2.getCost() >= p1.getCost() && p2.getCost() >= p3.getCost()) {
            return p2;
        } else {
            return p3;
        }
    }

    public void printPlaneWithSmallestSeats(Plane p1, Plane p2, Plane p3) {
        if (p1.getSeats() <= p2.getSeats() && p1.getSeats() <= p2.getSeats()) {
            System.out.println(p1.getCountry());
        } else if (p2.getSeats() <= p1.getSeats() && p2.getSeats() <= p3.getSeats()) {
            System.out.println(p2.getSeats());
        } else {
            System.out.println(p3.getSeats());
        }
    }

    public void NotMilitaryPlanes(Plane[] planes) {
        for (Plane p : planes) {
            if (!p.isMilitary()) {
                printInformation(p);
            }
        }
    }

    public void MilitariesMoreThan100Hours(Plane[] planes) {
        for (Plane p : planes) {
            if (p.isMilitary() && p.getHours() > 100) {
                printInformation(p);
            }
        }
    }

    public Plane minimalWeight(Plane[] planes) {
        Plane result = planes[0];
        for (int i = 1; i < planes.length; ++i) {
            if (planes[i].getWeight() >= result.getWeight()) {
                result = planes[i];
            }
        }
        return result;
    }

    public Plane cheapest(Plane[] planes) {
        Plane result = planes[planes.length - 1];
        for (int i = planes.length - 2; i >= 0; --i) {
            if (planes[i].getCost() <= result.getCost()) {
                result = planes[i];
            }
        }
        return result;
    }

    public void printByYear(Plane[] planes) {
        for (int i = 0; i < planes.length - 1; ++i) {
            for (int j = i + 1; j < planes.length; j++) {
                if (planes[i].getYear() > planes[j].getYear()) {
                    Plane tmp = planes[i];
                    planes[i] = planes[j];
                    planes[j] = tmp;
                }
                for (Plane p : planes) {
                    printInformation(p);
                }
            }
        }
    }

    public void printBySeats(Plane[] planes) {
        for (int i = 0; i < planes.length - 1; ++i) {
            for (int j = i + 1; j < planes.length; j++) {
                if (planes[i].getSeats() > planes[j].getSeats()) {
                    Plane tmp = planes[i];
                    planes[i] = planes[j];
                    planes[j] = tmp;
                }
            }
        }
        for (int k = planes.length - 1; k >= 0; --k) {
            if (!planes[k].isMilitary()) {
                printInformation(planes[k]);
            }
        }
    }

    public Plane create() {
        Scanner s = new Scanner(System.in);
        Plane plane = new Plane();
        System.out.println("Enter model");
        plane.setModel(s.nextLine());
        s.nextLine();
        System.out.println("Enter country");
        plane.setCountry(s.nextLine());
        s.nextLine();
        System.out.println("Enter publishing year");
        plane.setYear(s.nextInt());
        System.out.println("Enter hours in air");
        plane.setHours(s.nextInt());
        System.out.println("Enter true if plane is military, otherwise enter false");
        plane.setMilitary(s.nextBoolean());
        s.nextLine();
        System.out.println("Enter engine type");
        plane.setEngineType(s.nextLine());
        System.out.println("Enter weight");
        plane.setWeight(s.nextDouble());
        System.out.println("Enter wingspan");
        plane.setWingspan(s.nextInt());
        System.out.println("Enter topSpeed");
        plane.setTopSpeed(s.nextInt());
        System.out.println("Enter count of seats");
        plane.setSeats(s.nextInt());
        System.out.println("Enter cost");
        plane.setCost(s.nextDouble());
        return plane;
    }

}

