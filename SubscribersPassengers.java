public class SubscribersPassengers extends Passenger {
    public SubscribersPassengers(String name, String id, double tripCost, Car c) {
        super(name, id, tripCost, c);
    }
    public SubscribersPassengers(String name, String id) {
        super(name, id );

    }
    @Override
    public void reserve(Car c) throws Exception
     {

        if (c.getMaxCapacity() == 0){
            throw new Exception("Wrong !! capacity of the car was equal to zero ");
        }
         double discount  = (c.getRoute().getTripPrice() * 50) /100;
            setTripCost((c.getRoute().getTripPrice() - discount));

        System.out.println("The price of the subscribers  trip after 50% discount: $" + getTripCost());
    }

    @Override
    public void display()  {
        System.out.println("Trip Cost: " + super.getTripCost());
        System.out.println("Code Car: " + getC().getCode());
    }


}
