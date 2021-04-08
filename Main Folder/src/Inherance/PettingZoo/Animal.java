package Inherance.PettingZoo;

public abstract class Animal {
    //An abstract class with the given attributes
    String name;
    int nrOfLegs;
    Boolean isMammal;

    //An animals constructor
    public Animal (String name, int nrOfLegs, boolean isMammal){
        this.name = name;
        this.nrOfLegs = nrOfLegs;
        this.isMammal = isMammal;
    }

    //A no method body to create a soundMethod
    public abstract String makeSound ();
}
