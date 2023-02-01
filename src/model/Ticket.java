package model;

import java.util.ArrayList;

public class Ticket {
    int ticket_id;
    int ticket_no;
    ArrayList<seat> seat;
    ArrayList<user> user;

    public Ticket(int ticket_id, int ticket_no, ArrayList<model.seat> seat, ArrayList<model.user> user) {
        this.ticket_id = ticket_id;
        this.ticket_no = ticket_no;
        this.seat = seat;
        this.user = user;
    }

    public void Get_tickets(ArrayList<model.seat> seat){
        this.seat=seat;
    System.out.println("Seat List:"+this.seat);

}
}
