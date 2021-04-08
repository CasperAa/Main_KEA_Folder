package Array.Exercise;

public class ArraysExercise {
    public static void main(String[] args) {
        //Exercise 2
        String[] stringArray = {"First String", "Second String", "Third String"};
        int n = 1;
        nthIndex(stringArray,n);

        //exercise 3
        int [] numbersInArray = {1,5,2,67,1,2,33,7,32,76,73};
        System.out.println("The highest number in the array is: "+ returnHighestInt(numbersInArray));
    }
    //Method for exercise 2
    public static void nthIndex (String[] text, int number){
        System.out.println("You have printed the " + text[number]);
    }
    //Method for exercise 3
    public static int returnHighestInt (int[] inputArray){
        //A new variable with the value of int[0]
        int highestValue = inputArray[0];
        //for loop going through the array values
        for(int i=1 ; i < inputArray.length ; i++){
            //if the current int is of higher value than the previous int,
            //replace current value "highestValue" with the new value
            if ( inputArray[i] > highestValue){
                highestValue = inputArray[i];
            }
        }
        return highestValue;
    }
}
