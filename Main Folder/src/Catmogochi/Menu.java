package Catmogochi;

import java.util.Scanner;

public class Menu {

    private Scanner menuInput = new Scanner(System.in);


    public void presentMainChoices(){
        System.out.println("Welcome");
        System.out.println("Press 1 to create a cat");
        System.out.println("Press 2 to exit the program");
    }
    //Scanner class asking for user input
    public int fetchUserInput() {
        int userInput = menuInput.nextInt();
        return userInput;
    }
}

