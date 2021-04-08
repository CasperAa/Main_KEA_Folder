package ArrayList;

import java.util.ArrayList;

public class ArrayListExercise {
    public static void main(String[] args) {
        ArrayList<String> listOfArrays = new ArrayList<String>();

        listOfArrays.add("First");
        listOfArrays.add("Second");
        listOfArrays.add("Third");
        listOfArrays.add("Fourth");
        listOfArrays.add("Fifth");
        listOfArrays.add("Sixth");
        listOfArrays.add("Seventh");
        listOfArrays.add("Eight");
        listOfArrays.add("ninth");
        listOfArrays.add("Tenth");

        System.out.println("This is my Arraylist: " + listOfArrays);
        System.out.println("The size of my arraylist is: " + countArray(listOfArrays));
    }

        public static int countArray (ArrayList <String> listOfArrays){
        return listOfArrays.size();
        }


}
