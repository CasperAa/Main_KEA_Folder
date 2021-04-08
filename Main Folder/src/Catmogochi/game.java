package Catmogochi;

import java.util.Random; //It is necessary to import this in order to create random numbers
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
         Scanner nameInput = new Scanner(System.in);

        Random rand = new Random(); //We create a random generator named "rand"
        Menu menu = new Menu();

        //Start menu class
        menu.presentMainChoices();

        boolean didUserWantToExit = false;
        int count = 0; //We create a variable in order to count the number of created cats

        int amountOfCatsToWin = 5;

        while (didUserWantToExit == false) {
            int userInput = menu.fetchUserInput();
            switch (userInput) {
                case 1:
                    System.out.println("You picked number one");

                    //The user is prompted to input a name for the cat
                    System.out.println("\nInput the name of your cat:");
                    String nameOfCat = nameInput.nextLine();

                    //Random values are created and assigned to varieblas.
                    int randomMood = rand.nextInt(10) + 1;
                    int randomHunger = rand.nextInt(10) + 1;
                    int randomEnergy = rand.nextInt(10) + 1;

                    //A cat is created using the name and variables.
                    Cat catOne = new Cat(nameOfCat, randomMood, randomHunger, randomEnergy, 10);
                    System.out.println("Your cat " + catOne.name + " has been created.\nMood: " + catOne.mood + "\nHunger: " + catOne.hungry + "\nEnergy: " + catOne.energy + "\nHealth: " + catOne.health);
                    count++; //We count very time a cat is created
                    //We construct a while-loop that checks the values of the cat. If the cat is low on mood, hungry or energy, it runs
                    if (catOne.mood == 1 || catOne.hungry == 1 || catOne.energy == 1) {
                        didUserWantToExit = true; //This ensures the code is terminated when you die
                        catOne.health = 0; //The cat's health is set to 0 when dying
                        System.out.println("\n" + catOne.name + "'s health is now " + catOne.health + "!"); //The user is told the new status of the health
                        System.out.println("Game over!!! Your cat " + catOne.name + " has died, and I have called the authorities!"); //A game over-message is printed
                        if (count == 1) {
                            System.out.println("You only created " + count + " cat before dying."); //If only one cat is created before dying, this message is printed
                            System.out.println("Game Over!");
                        } else {
                            System.out.println("You created " + count + " cats before dying."); //The final number of created cats is printed when you die
                            System.out.println("Game Over!");
                        }
                    }
                    else{
                        System.out.println("Create one more cat - Meow. Press 1 to do so.");
                    }
                    if (count == amountOfCatsToWin) {
                        didUserWantToExit = true;
                        System.out.println("You've WON! You've created 5 cats without anyone dying.");
                        System.out.println("Your price is to keep all the cats you've just created!");
                    }
                        break;
                case 2: // When user enters the number 2 the program ends
                    System.out.println("You chose to exit the program - goodbye");
                    didUserWantToExit = true;
                    break;
            }
        }
    }
}
