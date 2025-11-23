import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Booking {
    String passengername;
    int busno;
    Date date;

    Scanner sc = new Scanner(System.in);
    Booking(){
        System.out.println("Enter your name:");
        passengername = sc.nextLine();
        System.out.println("Enter the bus no:");
        busno = sc.nextInt();
        sc.nextLine();
        System.out.println("Date (dd-mm-yyyy) :");
        String dateinput = sc.nextLine();
        SimpleDateFormat dateformate = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date = dateformate.parse(dateinput);
        } catch (ParseException e) {
            e.printStackTrace();}
    }
        public boolean isAvailable(ArrayList<Booking> bookings ,ArrayList<Bus> buses){
            int capacity = 0;
            for(Bus bus:buses){
                if(bus.getBusno() == busno){
                    capacity = bus.getCapacity();
                }
            }
            int booked = 0;
            for(Booking b:bookings){
                if(b.busno == busno && b.date.equals(date)){
                    booked++;

            }
        }
        if(booked<capacity){
                return true;
            }
        return false;
    }
}
