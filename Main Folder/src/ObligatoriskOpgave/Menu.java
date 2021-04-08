package ObligatoriskOpgave;
import java.util.Scanner;

public class Menu {
    public String email, password;

    public void loginMenu (){ //Welcome screen - Asks the user to "log in"
        Scanner loginDetails = new Scanner(System.in);
        System.out.println("Welcome");
        System.out.println("Enter e-mail: ");
        email = loginDetails.nextLine();
        System.out.println("Enter Password: ");
        password = loginDetails.nextLine();
    }

    public void changeLogin (){ //Replace the values of the email & password
        Scanner loginDetails = new Scanner(System.in);
        System.out.println("Write your new Email and Password");
        System.out.println("Enter new e-mail: ");
        email = loginDetails.nextLine();
        System.out.println("Enter new Password: ");
        password = loginDetails.nextLine();
    }

    public static void mainMenu(){ //The main menu of the available options
        System.out.println("Add friend to to your list?         Press 1");
        System.out.println("Show your friends list?             Press 2");
        System.out.println("Show current email and password?    Press 3");
        System.out.println("Change password and email?          Press 4");
        System.out.println("Show menu options again             Press 8");
        System.out.println("To exit HandBook                    Press 9");

    }

    public static int fetchUserInput() { //Scanner class asking for user input
        Scanner menuInput = new Scanner(System.in);
        int userInput = menuInput.nextInt();
        return userInput;
    }
}
