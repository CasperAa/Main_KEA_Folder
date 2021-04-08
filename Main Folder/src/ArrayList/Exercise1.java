package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {

        //Exercise 1
        ArrayList<String> listOfArrays = new ArrayList<>();

        listOfArrays.add("First");
        listOfArrays.add("Second");
        listOfArrays.add("Third");
        listOfArrays.add("Fourth");
        listOfArrays.add("Fifth");
        //System.out.println("This is my Arraylist: " + listOfArrays);

        //Exercise 2
        //Collections.reverse(listOfArrays);
        //System.out.println("This is my reversed Arraylist: " + listOfArrays);
        //Collections.reverse(listOfArrays);


        //Exercise 3
        //exerciseThree(2, 4, listOfArrays);

        //Exercise 4
        //exerciseFour();

        //Exercise 5
        //exerciseFive(0,4, listOfArrays);

        //Exercise 6
        exerciseSix();

    }

    public static void exerciseThree (int n, int k, ArrayList<String> listOfArray) {
        for (int i = n; i <= k; i++) {
            System.out.println(listOfArray.get(i));
        }
    }

    public static void exerciseFour() {
        System.out.println("Give me a words!");
        System.out.println("NOTE! \nWrite: \" no strings attached \" to terminate program");
        Scanner userString = new Scanner(System.in);
        boolean gameOver = false;
        while (gameOver == false) {   // Loops till the user writes "no strings attached"
            ArrayList<String> userInputStrings = new ArrayList<>();
            String anotherString = userString.nextLine();
            userInputStrings.add(anotherString);

            // using the .equals method to compare the user input and the quit String.
            if(anotherString.equals("no strings attached")){
                System.out.println("Thanks for all the great words!");
                gameOver = true;
            }
        }
    }

    public static void exerciseFive (int n, int k, ArrayList<String> listOfArray){
        // display Array List before swap
        System.out.println("This is before the swap:");
        System.out.println(listOfArray);

        //swapping places
        Collections.swap(listOfArray, n, k);

        // display Array List after swap
        System.out.println("After Swap the ArrayList");
        System.out.println(listOfArray);
    }
    public static void exerciseSix () {
        System.out.println("Write a sentence so i can create an ArrayList");
        Scanner userInput = new Scanner(System.in);
        String userString = userInput.nextLine();

        //converting string to array using split function on spaces
        String stringtoArray[] = userString.split(" ");

        //declare an ArrayList
        List<String> newArray = new ArrayList<String>()
                ;
        //convert string array to ArrayList using asList method
        newArray = Arrays.asList(stringtoArray);

        //print the arraylist, each array on a new line
        for(String i: newArray) {
            System.out.println(i);
        }
    }
}

