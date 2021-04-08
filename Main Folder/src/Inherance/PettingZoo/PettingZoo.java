package Inherance.PettingZoo;

import java.util.ArrayList;
public class PettingZoo {
    public static void main(String[] args) {
        //Creating an ArrayList to fit all animals
        ArrayList <Animal> animalList = new ArrayList<Animal>();
        Dog dog1 = new Dog("Joey", 4, true);
        Duck duck1 = new Duck("Daisy", 2, false);
        animalList.add(dog1);
        animalList.add(duck1);

        for (Animal typeAnimal : animalList){
            System.out.println(typeAnimal.name + " makes the sound " + "\"" + typeAnimal.makeSound()+"\"");
        }
    }
}
