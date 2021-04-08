package Inherance.PettingZoo;

public class Duck extends Animal{

    //Construction of a Duck
    public Duck (String name, int nrOfLegs, boolean isMammal){
        super(name, nrOfLegs, isMammal);
        this.name = name;
        this.nrOfLegs = nrOfLegs;
        this.isMammal = isMammal;
    }

    //Overriding the makeSound method so the logic fits a Duck
    @Override
    public String makeSound(){
        return "Quack";
    }
}
