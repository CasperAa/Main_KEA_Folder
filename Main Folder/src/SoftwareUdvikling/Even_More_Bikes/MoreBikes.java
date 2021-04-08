package SoftwareUdvikling.Even_More_Bikes;

public class MoreBikes {
    public static void main(String[] args) {
    MountainBike fatBike = new MountainBike(15, 20,5);
    RacingBike Speedster = new RacingBike(18,50,true);
    CityBike Kildemoes = new CityBike(3,15,"Red");

    System.out.println("\nfatBike has these attributes:\n" + fatBike.toString());
    System.out.println("\nSpeedster has these attributes:\n" + Speedster.toString());
    System.out.println("\nKildemoes has these attributes:\n" + Kildemoes.toString());

    System.out.println("\nService prices:\n ");
    System.out.println("Mountain bike: " + fatBike.calculateServicePrice() +" DKk");
    System.out.println("Racing Bike: " + Speedster.calculateServicePrice() +" DKk");
    System.out.println("City Bike: " + Kildemoes.calculateServicePrice() +" DKk");

    }
}

abstract class Bike {
    private int gear;
    private int speed;

    public void speedUp(int increment) {
        speed += increment;
    }
    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    abstract public double calculateServicePrice();

    //The toString method should print information about the objects of the classes.
    public String toString() {
        String bikeGear = String.valueOf(gear);
        String bikeSpeed = Integer.toString(speed);
        return "Speed: " + bikeSpeed + "\nGear: " + bikeGear;
    }

    //Constructor
    public Bike(int gear, int speed){
        this.gear = gear;
        this.speed = speed;
    }

    //Getter
    public int getSpeed() {
        return this.speed;
    }

    //Getter
    public int getGear() {
        return this.gear;
    }
}

class MountainBike extends Bike {
    private int seatHeight;

    public MountainBike(int gear, int speed, int seatHeight){
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

    public void seatHeight (int newValue){
        seatHeight = newValue;
    }

    //Getter
    public int getSeatHeight() {
        return this.seatHeight;
    }

    @Override
    public double calculateServicePrice(){
        double startPrice = 250 * 1.1;
        double gearPrice = this.getGear() + 7;
        double mountainBikeServicePrice = (startPrice + gearPrice) * 1.25;
        return mountainBikeServicePrice;
    }

    //The toString method should print information about the objects of the classes.
    @Override
    public String toString() {
        super.toString();
        String bikeSeatHeight = String.valueOf(seatHeight);
        return super.toString() + "\nSeat height: " + bikeSeatHeight;
    }

}

class CityBike extends Bike {
    private double calculateServicePrice;
    private String color;

    public CityBike(int gear, int speed, String color){
        super(gear, speed);
        this.color = color;

    }

    //Getter
    public double getCalculateServicePrice() {
        return this.calculateServicePrice;
    }

    //The toString method should print information about the objects of the classes.
    @Override
    public double calculateServicePrice() {
        double servicePrice;
        double startFee = 200;
        double priceGear = 7;
        double tax = 1.25;

        super.toString();
        servicePrice = (startFee + this.getGear()*priceGear)*tax;
        return servicePrice;
    }
}

class RacingBike extends Bike {
    private Boolean carbonFrame;

    //Constructor
    public RacingBike(int gear, int speed, Boolean carbonFrame){
        super(gear, speed);
        this.carbonFrame = carbonFrame;
    }

    //Getter
    public Boolean getCarbonFrame() {
        return this.carbonFrame;
    }

    /*
    The price for service depends on a start-up fee and the number of gears each additional gear adds 7 dkr. to the price.
    For a city bike gears the start-up fee is 200 dkr.
    (example service price for a city bike with 2 gears = 214 dkr +tax)
     */
    @Override
    public double calculateServicePrice(){
        double servicePrice;
        double startFee = 250;
        double priceGear = 7;
        double tax = 1.25;
        servicePrice = (startFee + this.getGear()*priceGear)*tax;
        return servicePrice;
    }

    @Override
    public String toString() {
        super.toString();
        String bikeCarbonFrame;
        if (this.carbonFrame) {
            bikeCarbonFrame = "The bike has a carbon frame.";
        } else {
            bikeCarbonFrame = "The bike does not have a carbon frame.";
        }
        return super.toString() + "\n" + bikeCarbonFrame;
    }

}
