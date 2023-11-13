public abstract class Passenger {
    private String name;
    private String id;
    private double tripCost;
    private Car c;

    public Passenger(String name, String id, double tripCost, Car c) {
        this.name = name;
        this.id = id;
        this.tripCost = tripCost;
        this.c = c;
    }

    public Passenger(String name, String id) {
        this.name = name;
        this.id = id;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getTripCost() {
        return tripCost;
    }

    public void setTripCost(double tripCost) {
        this.tripCost = tripCost;
    }

    public Car getC() {
        return c;
    }

    public void setC(Car c) {
        this.c = c;
    }


    public abstract void reserve(Car c) throws Exception;

    public abstract void display();


}

