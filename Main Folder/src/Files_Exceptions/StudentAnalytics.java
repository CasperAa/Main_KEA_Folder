package Files_Exceptions;
import java.util.ArrayList;

public class StudentAnalytics {

    public static String findLongestName(ArrayList <Students> allStudents){
        //Starting from the top row of list as csv file doesn't contain metadata
        String nameOfThePersonWithLongestName = allStudents.get(0).getStudentName();

        for(int i = 1; i < allStudents.size(); i++){
            // if the current name in the ArrayList is longer than the stored name, then the current name will be stored
            if (allStudents.get(i).getStudentName().length() > nameOfThePersonWithLongestName.length()){
                nameOfThePersonWithLongestName = allStudents.get(i).getStudentName();
            }
        }
        return nameOfThePersonWithLongestName;
    }


    public static int howManySimons(ArrayList <Students> allStudents){
        int amountOfSimons = 0;
        //If any name in the ArrayList consist of the name Simon, then the value of amountOfSimon increases
        for(int i = 1; i < allStudents.size(); i++) {
            if (allStudents.get(i).getStudentName().contains("Simon")){
                amountOfSimons++;
            }
        }
        return amountOfSimons;
    }

    public static int averageNameLength(ArrayList <Students> allStudents){
        int amountOfTotalLetters = 0;
        //Adding the amount of letters of the current name to value of amountOfTotalLetters
        for(int i = 1; i < allStudents.size(); i++) {
            amountOfTotalLetters += allStudents.get(i).getStudentName().trim().length();
        }
        //Calculating the average amount of letters by dividing total amount of letters with the ArrayList size
        return (amountOfTotalLetters / allStudents.size());
    }

    public static int maxAmountOfNames(ArrayList <Students> allStudents){

        //Creating a list of the first individual name(word) in the ArrayList
        String[] startName = allStudents.get(0).getStudentName().trim().split(" ");

        //Comparing the length (amount of words) in the stored list to the current list length in the ArrayList,
        // and replacing the stored list if current list length is of grater value
        for(int i = 1; i < allStudents.size(); i++) {
            String[] currentName = allStudents.get(i).getStudentName().trim().split(" ");
                    if( currentName.length > startName.length ) {
                        startName = currentName;
                    }
        }
        return startName.length;
    }
}
