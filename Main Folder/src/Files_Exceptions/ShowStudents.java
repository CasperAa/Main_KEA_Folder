package Files_Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ShowStudents {
    public static void main(String[] args) throws FileNotFoundException {

        File students = new File("files/Students.csv");

        //Using the Scanner class to read the file and to ask the user for input
        Scanner readStudents = new Scanner(students);
        Scanner userName = new Scanner(System.in);

        //Asking the user for their name, and storing the input
        System.out.println("What is you first name?");
        String nameOfUser = userName.nextLine();

        //Creating an ArrayList to store the data from the file
        ArrayList<Students> allStudents = new ArrayList<Students>();

        //Using a while loop guarantee all rows in the file is read
        while (readStudents.hasNext()) {

            String currentStudent = readStudents.nextLine();
            if (currentStudent.contains(nameOfUser)) {
                //Using the input from the Scanner to to locate the user in the List
                System.out.println("\n" + currentStudent + " <-- you are here!\n");
            } else {
                System.out.println(currentStudent);
            }

            //Using the split method to divide a rows data, and storing it in a list
            String [] lineAsArray = currentStudent.split(";");
            //Storing the lists data in two different Strings using their index location
            String studentEmail = lineAsArray[0];
            String studentName = lineAsArray[1];
            //Creating a instance of a student with the String data from above
            Students newStudent = new Students(studentEmail, studentName);
            //Adding the student to the ArrayList

            allStudents.add(newStudent);
        }
        //Printing the number of students (elements) in the ArrayList
        System.out.println("\nAll " + allStudents.size() + " students in Dat21v2 is shown above!");

        //Calling all the methods from the StudentAnalytics class
        System.out.println("\nThe longest name in Dat21v2 is: " + StudentAnalytics.findLongestName(allStudents));

        System.out.println("\nDat21v2 consists of : " + StudentAnalytics.howManySimons(allStudents) + " Simons");

        System.out.println("\nDat21v2 average name length consists of " + StudentAnalytics.averageNameLength(allStudents) + " letters");

        System.out.println("\nThe person with the highest amount of names in Dat21v2 has " + StudentAnalytics.maxAmountOfNames(allStudents) + " names");
    }
}

