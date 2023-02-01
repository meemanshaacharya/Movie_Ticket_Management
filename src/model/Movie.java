package model;

public class Movie extends Category{
    String name;
    String director;
    int showtime;
    int price;

    public Movie(String sofa, String seat, String genre, String name, String director, int showtime, int price) {
        super(sofa, seat, genre);
        this.name = name;
        this.director = director;
        this.showtime = showtime;
        this.price = price;
    }
    public void GetInfo(){
        System.out.println("Name:"+" "+this.name);
        System.out.println("Director:"+" "+this.director);
        System.out.println("Sofa:"+" "+this.sofa);
        System.out.println("ShowTime:"+" "+this.showtime);
        System.out.println("Genre:"+" "+this.genre);
      System.out.println("Seat:"+" "+this.seat);



    }
    public void getMovies(){
          System.out.println("Name:"+" "+this.name);
          System.out.println("ShowTime:"+" "+this.showtime);
    }


}
