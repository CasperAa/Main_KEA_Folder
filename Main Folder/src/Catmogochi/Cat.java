package Catmogochi;

public class Cat {

    //The cats attributes
    String name;
    int mood;
    int hungry;
    int energy;
    int health;

    //Constructor
    public Cat(String nameOfCat, int moodOfCat, int hungerOfCat, int energyOfCat, int healthOfCat){
        this.name = nameOfCat;
        this.mood = moodOfCat;
        this.hungry = hungerOfCat;
        this.energy = energyOfCat;
        this.health = healthOfCat;
    }
}