package interface_polymorphism;

public class Trumpet implements playable{

    //Making specific methods to fit the Drums Class
    @Override
    public String nameOfInstrument(){
        return "Trumpet";
    }
    @Override
    public String playSound() {
        return "Too-too-too-too-toooooom!";
    }
}
