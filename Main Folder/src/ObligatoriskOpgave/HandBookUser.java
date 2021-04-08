package ObligatoriskOpgave;

public class HandBookUser {
    public static void main(String[] args) {
        //Creating instances of the methods in the Menu Class
        //as they are aren't static in their original class
        Menu menu = new Menu();
        Methods methods = new Methods();

        menu.loginMenu();
        menu.mainMenu();

        boolean endProgram = false;

        while (endProgram == false) { //A while loop with a switch to run the menu's and methods
            int userInput = Menu.fetchUserInput();
            switch (userInput) {
                case 1: //Add friend to to your list?
                    methods.addToFriendList();
                    break;
                case 2: //Show your friends list?
                    methods.displayAllFriends();
                    break;
                case 3: //Show current email and password
                    System.out.println(menu.email);
                    System.out.println(menu.password);
                    break;
                case 4: //Change password and email
                    menu.changeLogin();
                    break;
                case 5,6,7,8: //Fail proofing the remaining numbers so they will show the main menu again
                    Menu.mainMenu();
                    break;
                case 9: //To exit HandBook
                    endProgram = true;
                    break;
            }
        }
    }
 }
