package model;

public class Category extends MainCategory{
String genre;

    public Category(String sofa, String seat, String genre) {
        super(sofa, seat);
        this.genre = genre;
    }
}
