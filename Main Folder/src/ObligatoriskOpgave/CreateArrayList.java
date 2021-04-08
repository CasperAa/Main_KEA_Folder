package ObligatoriskOpgave;
import java.util.ArrayList;
import java.util.Scanner;

public class CreateArrayList {
    public static void main(String[] args) {
        //Creating the Arraylist
        ArrayList<Integer> hundredNumbers = new ArrayList<Integer>();
        //A for loop with 100 iterations, adding the value of i to a new array index
        for (int i = 0; i <= 99; i++) {
            hundredNumbers.add(i+1);
            System.out.println(hundredNumbers.get(i));
        }
        // Asking the user for an int
        Scanner userNumber = new Scanner(System.in);
        System.out.println("Write a number");
        int newNumber = userNumber.nextInt();
        //creating a new arraylist based on the multiples based on the user input
        ArrayList<Integer> multiplesNumbers = new ArrayList<Integer>();
        for (int i = 1; newNumber * i <= 100; i++) {
            multiplesNumbers.add(newNumber*i);
            //Removing the values from the multiples arraylist in the original arraylist
            hundredNumbers.remove(multiplesNumbers.get(i-1));
        }
        //adding the userNumber on the declared index number, as it was removed in the for loop
        hundredNumbers.add(newNumber-1,newNumber);
        //printing the new Arraylist
        for (int i : hundredNumbers){
            System.out.println(i);
        }
    }
}


