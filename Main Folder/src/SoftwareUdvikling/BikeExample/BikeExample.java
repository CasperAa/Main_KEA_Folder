package SoftwareUdvikling.BikeExample;
public class BikeExample {
    /*
    Implement the DCD below in java.
    The constructors of the classes are omitted from the diagram.
    • The Bike constructor takes gear and speed as input parameters.
    • The MountainBike constructor takes gear, speed and startHeight as input parameters.
    The toString method should print information about the objects of the classes.
    Create a MountainBike object in main to test your implementation.
     */
    public static void main(String[] args) {
        MountainBike Trek = new MountainBike(7, 20, 5);
        MountainBike Cube = new MountainBike(9, 35, 7);
        MountainBike fatBike = new MountainBike(3, 15, 15);

        System.out.println("\nTrek has these attributes: \n" + Trek.toString());
        System.out.println("\nCube has these attributes: \n" + Cube.toString());
        System.out.println("\nfatBike has these attributes: \n" + fatBike.toString());

        System.out.println("\nStorytime!\n");
        System.out.println("The fatBike was out and about on a joyride, suddenly there was a hill!");
        for (int i = 0; i < 15; i++) {
            fatBike.speedUp();
        }
        System.out.println("Speed: " + fatBike.getSpeed());

        System.out.println("\nNow the fatBike was going too fast, and there was a sharp corner ahead. \nIt hit the brakes hard!");
        for (int i = 0; i < 20; i++) {
            fatBike.applyBrake();
        }
        System.out.println("Speed: " + fatBike.getSpeed());
        System.out.println("\nIt made it past the corner smoothly. \nIt stopped at the first hotdog stand to grap a hotdog and adjust the seat height.\n");
        while (fatBike.getSpeed() > 0) {
            fatBike.applyBrake();
        }

        fatBike.seatHeight(10);
        System.out.println(fatBike.toString());
    }
}
class Bike {
    private int gear;
    private int speed;

    public void speedUp() {
        speed++;
    }

    public void applyBrake() {
        speed--;

    }

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

    //GetterX2
    public int getSpeed() {
        return this.speed;
    }
}

class MountainBike extends Bike{
    private int seatHeight;

    public MountainBike(int gear, int speed, int seatHeight){
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

    public void seatHeight (int newSeatHeight){
        seatHeight = newSeatHeight;
    }

    //Getter
    public int getSeatHeight() {
        return this.seatHeight;
    }

    //The toString method should print information about the objects of the classes.
    @Override
    public String toString() {
        super.toString();
        String bikeSeatHeight = String.valueOf(seatHeight);
        return super.toString() + "\nSeat height: " + bikeSeatHeight;
    }
}

