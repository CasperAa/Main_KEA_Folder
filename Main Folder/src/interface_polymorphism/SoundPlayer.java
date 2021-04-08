package interface_polymorphism;

import java.util.ArrayList;

public class SoundPlayer {
    public static void main(String[] args) {

        //Making an object from each class, which is implemented from the playable interface
        Guitar g1 = new Guitar();
        Drums d1 = new Drums();
        Trumpet t1 = new Trumpet();

        //Creating an ArrayList and storing the elements (g1, di & t1) within
        ArrayList <playable> instrumentSounds = new ArrayList<playable>();
        instrumentSounds.add(g1);
        instrumentSounds.add(d1);
        instrumentSounds.add(t1);


        //Printing the argument for each element in the ArrayList
        for (playable instruments : instrumentSounds){
            System.out.println("A " + instruments.nameOfInstrument() + " sounds like \"" + instruments.playSound() + "\"");

        }
    }
}
