import model.*;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        MainCategory m1=new MainCategory("sofa","123");
        Category c1=new Category("sofa","123","funny");
        Movie mo1=new Movie("sofa","123","funny","howfunny","meemansha",12,555);
        mo1.GetInfo();

        ArrayList<seat> seat=new ArrayList<>();
        seat s1=new seat(123,true);
        seat s2=new seat(122,false);
        seat s3=new seat(423,true);
        seat.add(s1);
        seat.add(s2);
        seat.add(s3);

        ArrayList<user> user=new ArrayList<>();
        user u1=new user("meemansha","9818122173");
        user u2=new user("Manan","9818145173");
        user u3=new user("melisha","981812890");
        user.add(u1);
        user.add(u2);
        user.add(u3);


        Ticket t1=new Ticket(123,234,seat,user);
        t1.Get_tickets(seat);

        mo1.getMovies();
    }

}
