package Lesson3.Models;

public class Book {
    private String name;
    private String authorName;
    private int countOfPages;
    private int price;
    private int year;
    private String genre;
    private boolean IsInArmenianLanguage;

    public Book(String name, String authorName, int countOfPages, int price, int year, String genre, boolean isInArmenianLanguage) {
        this.name = name;
        this.authorName = authorName;
        this.countOfPages = countOfPages;
        this.price = price;
        this.year = year;
        this.genre = genre;
        this.IsInArmenianLanguage = isInArmenianLanguage;
    }

    public String getName() {
        return name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getCountOfPages() {
        return countOfPages;
    }

    public void setCountOfPages(int countOfPages) {
        this.countOfPages = countOfPages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isInArmenianLanguage() {
        return IsInArmenianLanguage;
    }
}
