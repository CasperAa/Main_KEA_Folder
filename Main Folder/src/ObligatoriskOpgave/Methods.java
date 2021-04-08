package ObligatoriskOpgave;

import java.util.ArrayList;
import java.util.Scanner;
public class Methods {

    public ArrayList<String> listOfFriends = new ArrayList<String>();

    public void addToFriendList() {
        System.out.println("Add friend to your friend list");
        Scanner friendName = new Scanner(System.in);
        boolean noMoreFriends = true;
        //While loop for adding Strings (friends), stops when the user writes "STOP"
        while (noMoreFriends == true) {
            System.out.println("Write the name of the friend you wanna add:");
            System.out.println("When done write: \"STOP\"");
            String newFriend = friendName.nextLine();
            //Adding the input to the Arraylist
            listOfFriends.add(newFriend);
            //Adding if statement to change the boolean value
            if (newFriend.equals("STOP")) {
                //Removes the last String (STOP) from Arraylist
                int removeLastElement = listOfFriends.size() - 1;
                listOfFriends.remove(removeLastElement);
                //prints the added friends
                System.out.println(listOfFriends);
                noMoreFriends = false;
            }
        }
    }

    public void displayAllFriends() {
        //Prints for every value in the Arraylist
        for (String i : listOfFriends) {
            System.out.println(i);
        }
    }
}
