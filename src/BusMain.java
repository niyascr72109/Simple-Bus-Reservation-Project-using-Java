import java.util.*;
public class BusMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList <Bus> buses = new ArrayList<Bus>();
        ArrayList <Booking> bookings = new ArrayList<Booking>();

        System.out.println("----Available Buses----");
        
        buses.add(new Bus(1,true,7));
        buses.add(new Bus(9,false,45));
        buses.add(new Bus(4,true,55));
        buses.add(new Bus(5,true,45));
        
        for(Bus b:buses){
            b.displayBusInfo(); 
        }
        int useroption = 1;
        while(useroption==1){
            System.out.println("Enter 1 for Boooking bus ticket and 0 for Exit:");
            Booking booking = new Booking();
            if(booking.isAvailable(bookings,buses)){
                bookings.add(booking);
                System.out.println("Your booking has been Conformed");
            }
            else{
                System.out.println("Sorry, no more bookings are available !");
                System.out.println("Try another Bus.");
            }
        }
        System.out.println("Exited Sucessfully");
        sc.close();

    }
}
