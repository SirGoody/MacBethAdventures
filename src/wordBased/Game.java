/*
 * @Author:             Chase Goodman
 * @Email:              cwgoodman@bsu.edu
 * @Date Started:       April 3rd, 2015
 * @Last Date Modified: April 22nd, 2015
 * @Version:            BETA 1.011
 */

package wordBased;

import java.io.IOException;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(System.in);

        while (true) {
            System.out.print("Do you want to enter the cave?: ");
            String s = kb.nextLine();
            if (s.equalsIgnoreCase("YES")) {
                break;
            } else if (s.equalsIgnoreCase("NO")) {
                System.out.println("You will have no adventure. See you later");
                System.exit(0);
            } else{
                System.out.println("Please enter yes or no.");
                System.out.println("");
            }
        }

        //Creates an object of StringReader class
        StringReader f = new StringReader();

        //Displays text as you enter the cave
        System.out.println("");
        f.main("Starting.txt");
        System.out.println("");

        //Goes into the game, and creates an object of Rooms class
        Rooms r = new Rooms();
        r.Room1();

        //Closes kb to get rid of the warning
        kb.close();
    }

}
