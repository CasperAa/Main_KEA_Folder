package interface_polymorphism;

public class Guitar implements playable {

    //Making specific methods to fit the Drums Class
    @Override
    public String nameOfInstrument(){
        return "Guitar";
    }
    @Override
    public String playSound(){
        return "dee-Tzzzzuuuhhh";
    }
}
