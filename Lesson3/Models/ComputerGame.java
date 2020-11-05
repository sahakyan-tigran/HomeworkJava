package Lesson3.Models;

public class ComputerGame {
    private String name;
    private double memoryUsing;
    private String genre;
    private String name_hero;
    private int countOfHeroes;
    private boolean isAboutWar;

    public ComputerGame(String name, double memoryUsing, String genre, String name_hero, int countOfHeroes, boolean isAboutWar) {
        this.name = name;
        this.memoryUsing = memoryUsing;
        this.genre = genre;
        this.name_hero = name_hero;
        this.countOfHeroes = countOfHeroes;
        this.isAboutWar = isAboutWar;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMemoryUsing() {
        return memoryUsing;
    }

    public void setMemoryUsing(double memoryUsing) {
        this.memoryUsing = memoryUsing;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getName_hero() {
        return name_hero;
    }

    public void setName_hero(String name_hero) {
        this.name_hero = name_hero;
    }

    public int getCountOfHeroes() {
        return countOfHeroes;
    }

    public void setCountOfHeroes(int countOfHeroes) {
        this.countOfHeroes = countOfHeroes;
    }

    public boolean isAboutWar() {
        return isAboutWar;
    }

    public void setAboutWar(boolean aboutWar) {
        isAboutWar = aboutWar;
    }


}
