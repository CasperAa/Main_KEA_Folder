package Files_Exceptions.StarWars;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StarWars {
    public static void main(String[] args) throws FileNotFoundException {

        File StarWars = new File("files/star-wars-lore.csv");
        Scanner readStarWars = new Scanner(StarWars);

        ArrayList<Characters> allCharacters = new ArrayList<Characters>();

        //skipping the metadata on row 1
        readStarWars.nextLine();
        int row = 0;
        while (readStarWars.hasNext()) {

            String currentCharacter = readStarWars.nextLine();

            //Using the split method to divide a rows data, and storing it in a list
            String[] convertToArray = currentCharacter.split(";");
            //Storing the lists data in two different Strings using their index location

                    String name = checkForValue(convertToArray[0].trim());
                    int height = checkForInteger(convertToArray[1].trim());
                    int mass = checkForInteger(convertToArray[2].trim());
                    String hair_color = checkForValue(convertToArray[3].trim());
                    String eye_color = checkForValue(convertToArray[4].trim());
                    String birth_year = checkForValue(convertToArray[5].trim());
                    String gender = checkForValue(convertToArray[6].trim());
                    String homeWorld = checkForValue(convertToArray[7].trim());
                    String species = checkForValue(convertToArray[8].trim());

                    //Creating a instance of a student with the String data from above
                    Characters newCharacter = new Characters(name, height, mass, hair_color, eye_color, birth_year, gender, homeWorld, species);
                    //Adding the student to the ArrayList
                    allCharacters.add(newCharacter);

                    System.out.println(row);
                    System.out.println(newCharacter.getName());
                    System.out.println(newCharacter.getSpecies());
                    row++;

        }
    }
    public static int checkForInteger(String text){
        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException e){
            return 0;
        }
    }
    public static String checkForValue(String text){
        if (text == null) {
            return " ";
        } else {
            return text;
        }
    }
}