import java.text.MessageFormat;

public class NonSubscribersPassengers extends Passenger {

    private boolean discountCoupon;

    public NonSubscribersPassengers(String name, String id,  boolean discountCoupon) {
        super(name, id );
        this.discountCoupon = discountCoupon;
    }

    public NonSubscribersPassengers(String name, String id, double tripCost, Car c, boolean discountCoupon) {
        super(name, id, tripCost, c);
        this.discountCoupon = discountCoupon;
    }



    public boolean isDiscountCoupon() {
        return discountCoupon;
    }

    public void setDiscountCoupon(boolean discountCoupon) {
        this.discountCoupon = discountCoupon;
    }

    @Override
    public void reserve(Car c) throws Exception{
       if(c.getMaxCapacity() == 0) {
           throw new Exception("Wrong !! capacity of the car was equal to zero ");
       } if(discountCoupon == true){

            double discount  = (c.getRoute().getTripPrice() * 10) /100;
            setTripCost((c.getRoute().getTripPrice() - discount));
            System.out.println("The price of the trip for passengers non-subscribers who have the 10% discount Coupon: $" + getTripCost());
        }

else if (discountCoupon != true){

    setTripCost(c.getRoute().getTripPrice());
            System.out.println("passengers non-subscribers doesn't have a discount coupon: $" + getTripCost());
        }

    }


    @Override
    public void display() {
        System.out.println("Trip Cost: " + getTripCost());
        System.out.println("Code Car: " + getC().getCode());;


    }

}
