package interface_polymorphism;

public class Drums implements playable {

    //Making specific methods to fit the Drums Class
    @Override
    public String nameOfInstrument(){
        return "Drum";
    }

    @Override
    public String playSound(){
        return "da-bum-bum-CHING";
    }
}
