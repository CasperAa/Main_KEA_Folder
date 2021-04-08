package Inherance.PettingZoo;

public class Dog extends Animal {

    //Construction of a Dog
    public Dog (String name, int nrOfLegs, boolean isMammal){
        super(name, nrOfLegs, isMammal);
        this.name = name;
        this.nrOfLegs = nrOfLegs;
        this.isMammal = isMammal;
    }

    //Overriding the makeSound method so the logic fits a Dog
    @Override
    public String makeSound(){
        return "Bark";
    }
}
