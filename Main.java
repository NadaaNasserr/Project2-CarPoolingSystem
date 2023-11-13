import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {


        Route r1 = new Route("Route1", "Route4", 1500);
        Route r2 = new Route("Route3", "Route2", 2300);
        Route r3 = new Route("Route2", "Route1", 1100);

        Car c1 = new Car("998", r1, 1);
        Car c2 = new Car("334", r2, 4);
        Car c3 = new Car("110", r3, 2);
        ArrayList<Passenger> passengerArrayList = new ArrayList<>();

        SubscribersPassengers s1 = new SubscribersPassengers("Omar", "13098");
        NonSubscribersPassengers s2 = new NonSubscribersPassengers("Nada", "11902", true);
        NonSubscribersPassengers s3 = new NonSubscribersPassengers("Khaled", "22081", false);
        passengerArrayList.add(s1);
        passengerArrayList.add(s2);
        passengerArrayList.add(s3);

        try {
             s1.reserve(c1);
               s1.display();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            s2.reserve(c2);
            s2.display();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            s3.reserve(c3);
            s3.display();
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }
}


