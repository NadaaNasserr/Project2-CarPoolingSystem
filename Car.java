public class Car {
    private String code;
    private Route route;
    private int maxCapacity;

    public Car(String code, Route route, int maxCapacity) {
        this.code = code;
        this.route = route;
        this.maxCapacity = maxCapacity;
    }

    public Route getRoute() {
        return route;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }





    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }


    public String display() {
        return "Car{" +
                "Code='" + code + '\'' +
                ", Route=" + route +
                ", Max Capacity=" + maxCapacity +
                '}';
    }
}
