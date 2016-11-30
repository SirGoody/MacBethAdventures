package wordBased;

import java.util.*;

public class Rooms {
    //Keeps track of how many times you visit a room
    int r1C = 0;int r2C = 0;int r3C = 0;int r4C = 0;int r5C = 0;
    int r6C = 0;int r7C = 0;int r8C = 0;int r9C = 0;int r10C = 0;

    //Adds total points
    int tPoints = 0;

    //Calls a scanner for global use
    Scanner kb = new Scanner(System.in);

    //Players inventory
    List<String> inv = new ArrayList<String>();

    //Items in a room
    List<String> r1 = new ArrayList<String>();List<String> r2 = new ArrayList<String>();List<String> r3 = new ArrayList<String>();
    List<String> r4 = new ArrayList<String>();List<String> r5 = new ArrayList<String>();List<String> r6 = new ArrayList<String>();
    List<String> r7 = new ArrayList<String>();List<String> r8 = new ArrayList<String>();List<String> r9 = new ArrayList<String>();
    List<String> r10 = new ArrayList<String>();

    //The pot for the witches
    List<String> pot = new ArrayList<String>();
    //Items in room 2(EYE), 4(LEG), 7(TOE), 8(WING), and 10(HAIR).

    //Creates an object of StringReader class
    StringReader f = new StringReader();

    public void Room1(){
        r1C+=1;
        System.out.println("----You have entered the 1st room----");
        if(r1C==1){
            f.main("Room1FirstV.txt");
            System.out.println("Enter help for instructions");
            tPoints+=1;
        }else{
            f.main("Room1LaterV.txt");
        }

        while(true){
            System.out.print("What would you like to do?: ");
            String d = kb.nextLine();

            if(d.toLowerCase().contains("north") || d.equalsIgnoreCase("N")){
                System.out.println("You have gone North.");
                System.out.println("");
                Room3();
            }else if(d.toLowerCase().contains("east") || d.equalsIgnoreCase("E")){
                System.out.println("You have gone East.");
                System.out.println("");
                Room6();
            }else if(d.toLowerCase().contains("south") || d.equalsIgnoreCase("S")){
                System.out.println("You have gone South.");
                System.out.println("");
                Room8();
            }else if(d.toLowerCase().contains("west") || d.equalsIgnoreCase("W")){
                System.out.println("You have gone West.");
                System.out.println("");
                Room5();
            }
            if(d.equalsIgnoreCase("QUIT")){
                System.out.println("You have sucessfully vanished.");
                System.exit(0);
            }
            if(d.equalsIgnoreCase("HELP")){
                f.main("help.txt");
            }
            if(d.equalsIgnoreCase("INVENTORY") || d.equalsIgnoreCase("INV")){
                if(inv.size() == 0){
                    System.out.println("Your inventory is empty");
                    System.out.println("");
                }else{
                    String s = inv.get(0);
                    System.out.println("You have " + s + " in your inventory.");
                    System.out.println("");
                }
            }if(d.equalsIgnoreCase("LOOK")){
                if(r1.size() == 0){
                    System.out.println("There are three witches doing some mysterious ritual around a boiling cauldron.");
                    System.out.println("");
                }else{
                    String s = r1.get(0);
                    System.out.println("There is " + s + " in this room.");
                    System.out.println("");
                }

            }if(d.equalsIgnoreCase("GRAB")){
                if(r1.size() == 0){
                    System.out.println("You grabbed a witch... You are testing your luck.");
                    System.out.println("");
                }else if(inv.size() >= 1){
                    System.out.println("You are carrying your max amount of items.");
                    System.out.println("");
                }else if(r1.get(0).equals("TOE")){
                    String s = r1.get(0);
                    inv.add(s);
                    r1.remove(0);
                    System.out.println("You put the the frog's toe into your backpack.");
                    System.out.println("");
                }else if(r1.get(0).equals("EYE")){
                    String s = r1.get(0);
                    inv.add(s);
                    r1.remove(0);
                    System.out.println("You put the eye of Newt into your backpack.");
                    System.out.println("");
                }else if(r1.get(0).equals("LEG")){
                    String s = r1.get(0);
                    inv.add(s);
                    r1.remove(0);
                    System.out.println("You put the leg of a lizard into your backpack.");
                    System.out.println("");
                }else if(r1.get(0).equals("WING")){
                    String s = r1.get(0);
                    inv.add(s);
                    r1.remove(0);
                    System.out.println("You put the owlet's wing into your backpack.");
                    System.out.println("");
                }else if(inv.get(0).equals("HAIR")){
                    String s = r1.get(0);
                    inv.add(s);
                    r1.remove(0);
                    System.out.println("You put the cat's hair that used to sing into your backpack.");
                    System.out.println("");
                }
            }if(d.equalsIgnoreCase("DROP")){
                if(inv.size() == 0){
                    System.out.println("You have nothing to drop.");
                    System.out.println("");
                }else if(r1.size() >= 1){
                    System.out.println("This room already has its max amount of items.");
                    System.out.println("Try and drop it off at a differant room.");
                    System.out.println("");
                }else if(inv.get(0).equals("TOE")){
                    String s = inv.get(0);
                    r1.add(s);
                    inv.remove(0);
                    System.out.println("dropped the toe of a frog in room 1.");
                    System.out.println("");
                }else if(inv.get(0).equals("EYE")){
                    String s = inv.get(0);
                    r1.add(s);
                    inv.remove(0);
                    System.out.println("You dropped the eye of a Newt in room 1.");
                    System.out.println("");
                }else if(inv.get(0).equals("LEG")){
                    String s = inv.get(0);
                    r1.add(s);
                    inv.remove(0);
                    System.out.println("You dropped Lizards leg in room 1.");
                    System.out.println("");
                }else if(inv.get(0).equals("WING")){
                    String s = inv.get(0);
                    r1.add(s);
                    inv.remove(0);
                    System.out.println("You dropped owlet's wing in room 1.");
                    System.out.println("");
                }else if(inv.get(0).equals("HAIR")){
                    String s = inv.get(0);
                    r1.add(s);
                    inv.remove(0);
                    System.out.println("You dropped the cat hair in room 1.");
                    System.out.println("");
                }
            }if(d.equalsIgnoreCase("GIVE")){
                if(inv.size() == 0){
                    System.out.println("You do not have anything to give the witch.");
                    System.out.println("");
                }else if(inv.get(0).equals("TOE")){
                    String s = inv.get(0);
                    pot.add(s);
                    inv.remove(0);
                    f.main("Give.txt");
                    f.main("Frog.txt");
                    f.main("Room1LaterV.txt");
                    tPoints+=1;
                }else if(inv.get(0).equals("EYE")){
                    String s = inv.get(0);
                    pot.add(s);
                    inv.remove(0);
                    f.main("Give.txt");
                    System.out.println("You gave the witches the eye of Newt.");
                    f.main("Room1LaterV.txt");
                    System.out.println("");
                    tPoints+=1;
                }else if(inv.get(0).equals("LEG")){
                    String s = inv.get(0);
                    pot.add(s);
                    inv.remove(0);
                    System.out.println("You gave the witches the leg from the larger lizard.");
                    f.main("Room1LaterV.txt");
                    System.out.println("");
                    tPoints+=1;
                }else if(inv.get(0).equals("WING")){
                    String s = inv.get(0);
                    pot.add(s);
                    inv.remove(0);
                    f.main("Give.txt");
                    System.out.println("You gave the witches the owlet's wing.");
                    f.main("Room1LaterV.txt");
                    tPoints+=1;
                }else if(inv.get(0).equals("HAIR")){
                    String s = inv.get(0);
                    pot.add(s);
                    inv.remove(0);
                    f.main("Give.txt");
                    System.out.println("You give the witches the cat hair.");
                    f.main("Room1LaterV.txt");
                    tPoints+=1;
                }
            }if(d.equalsIgnoreCase("SCORE")){
                System.out.println("You have a total of " + tPoints + " points.");
                System.out.println("");
            }if(tPoints >= 15){
                f.main("Room1Win.txt");
                System.exit(0);
            }else if(pot.size() == 5){
                f.main("Room1Win.txt");
                System.exit(0);
            }if(d.equalsIgnoreCase("ITEM")){
                int i = pot.size();
                int iL = 5 - i;
                System.out.println("There are " + iL + " items remaining.");
                System.out.println("");
            }
        }
    }
    public void Room2() {
        r2C += 1;

        System.out.println("----You have entered the 2nd room----");
        if(r2C == 1){
            tPoints += 1;
            r2.add("EYE");
        }
        f.main("Room2Start.txt");

        while(true){
            System.out.print("What would you like to do?: ");
            String d = kb.nextLine();

            if(d.toLowerCase().contains("north") || d.equalsIgnoreCase("N")){
                System.out.println("There are no exits North.");
                System.out.println("");
            }else if(d.toLowerCase().contains("east") || d.equalsIgnoreCase("E")){
                System.out.println("You have gone East.");
                System.out.println("");
                Room3();
                break;
            }else if(d.toLowerCase().contains("south") || d.equalsIgnoreCase("S")){
                System.out.println("You have gone South.");
                System.out.println("");
                Room2();
            }else if(d.toLowerCase().contains("west") || d.equalsIgnoreCase("W")){
                System.out.println("You have gone West.");
                System.out.println("");
                Room2();
            }
            if(d.equalsIgnoreCase("QUIT")){
                System.out.println("You have sucessfully vanished.");
                System.exit(0);
            }
            if(d.equalsIgnoreCase("HELP")){
                f.main("help.txt");
            }
            if(d.equalsIgnoreCase("INVENTORY") || d.equalsIgnoreCase("INV")){
                if(inv.size() == 0){
                    System.out.println("Your inventory is empty");
                    System.out.println("");
                }else{
                    String s = inv.get(0);
                    System.out.println("You have " + s + " in your inventory.");
                    System.out.println("");
                }
            }if(d.equalsIgnoreCase("LOOK")){
                if(r2.size() == 0){
                    f.main("Room2PostA.txt");
                    System.out.println("");
                }else{
                    f.main("Room2PreA.txt");
                    System.out.println("");
                }

            }if(d.equalsIgnoreCase("GRAB")){
                if(r2.size() == 0){
                    System.out.println("There is nothing to grab in this room.");
                    System.out.println("");
                }else if(inv.size() >= 1){
                    System.out.println("You are carrying your max amount of items.");
                    f.main("Room2PostA.txt");
                    System.out.println("");
                }else if(r2.get(0).equals("TOE")){
                    String s = r2.get(0);
                    inv.add(s);
                    r2.remove(0);
                    System.out.println("You put the the frog's toe into your backpack.");
                    System.out.println("");
                }else if(r2.get(0).equals("EYE")){
                    String s = r2.get(0);
                    inv.add(s);
                    r2.remove(0);
                    System.out.println("You put the eye of Newt into your backpack.");
                    System.out.println("");
                }else if(r2.get(0).equals("LEG")){
                    String s = r2.get(0);
                    inv.add(s);
                    r2.remove(0);
                    System.out.println("You put the leg of a lizard into your backpack.");
                    System.out.println("");
                }else if(r2.get(0).equals("WING")){
                    String s = r2.get(0);
                    inv.add(s);
                    r2.remove(0);
                    System.out.println("You put the owlet's wing into your backpack.");
                    System.out.println("");
                }else if(r2.get(0).equals("HAIR")){
                    String s = r2.get(0);
                    inv.add(s);
                    r2.remove(0);
                    System.out.println("You put the cat's hair that used to sing into your backpack.");
                    System.out.println("");
                }

            }if(d.equalsIgnoreCase("DROP")){
                if(inv.size() == 0){
                    System.out.println("You have nothing to drop.");
                    System.out.println("");
                }else if(r2.size() >= 1){
                    System.out.println("This room already has its max amount of items.");
                    System.out.println("Try and drop it off at a differant room.");
                    System.out.println("");
                }else if(inv.get(0).equals("TOE")){
                    String s = inv.get(0);
                    r2.add(s);
                    inv.remove(0);
                    System.out.println("dropped the toe of a frog in room 2.");
                    System.out.println("");
                }else if(inv.get(0).equals("EYE")){
                    String s = inv.get(0);
                    r2.add(s);
                    inv.remove(0);
                    System.out.println("You dropped the eye of Newt in room 2.");
                    System.out.println("");
                }else if(inv.get(0).equals("LEG")){
                    String s = inv.get(0);
                    r2.add(s);
                    inv.remove(0);
                    System.out.println("You dropped Lizards leg in room 2.");
                    System.out.println("");
                }else if(inv.get(0).equals("WING")){
                    String s = inv.get(0);
                    r2.add(s);
                    inv.remove(0);
                    System.out.println("You dropped owlet's wing in room 2.");
                    System.out.println("");
                }else if(inv.get(0).equals("HAIR")){
                    String s = inv.get(0);
                    r2.add(s);
                    inv.remove(0);
                    System.out.println("You dropped the cat hair in room 2.");
                    System.out.println("");
                }
            }if(d.equalsIgnoreCase("SCORE")){
                System.out.println("You have a total of " + tPoints + " points.");
                System.out.println("");
            }if(d.equalsIgnoreCase("ITEM")){
                int i = pot.size();
                int iL = 5 - i;
                System.out.println("There are " + iL + " items remaining.");
                System.out.println("");
            }
        }
    }
    public void Room3() {
        r3C += 1;
        System.out.println("----You have entered the 3rd room----");
        f.main("Room3.txt");
        if(r3C == 1){
            tPoints += 1;
        }

        while(true){
            System.out.print("What would you like to do?: ");
            String d = kb.nextLine();

            if(d.toLowerCase().contains("north") || d.equalsIgnoreCase("N")){
                System.out.println("There is no exit North.");
                System.out.println("");
                Room3();
            }else if(d.toLowerCase().contains("east") || d.equalsIgnoreCase("E")){
                System.out.println("You have gone East.");
                System.out.println("");
                Room4();
            }else if(d.toLowerCase().contains("south") || d.equalsIgnoreCase("S")){
                System.out.println("You have gone South.");
                System.out.println("");
                Room1();
            }else if(d.toLowerCase().contains("west") || d.equalsIgnoreCase("W")){
                System.out.println("You have gone West.");
                System.out.println("");
                Room2();
            }
            if(d.equalsIgnoreCase("QUIT")){
                System.out.println("You have sucessfully vanished.");
                System.exit(0);
            }
            if(d.equalsIgnoreCase("HELP")){
                f.main("help.txt");
            }
            if(d.equalsIgnoreCase("INVENTORY") || d.equalsIgnoreCase("INV")){
                if(inv.size() == 0){
                    System.out.println("Your inventory is empty");
                    System.out.println("");
                }else{
                    String s = inv.get(0);
                    System.out.println("You have " + s + " in your inventory.");
                    System.out.println("");
                }
            }if(d.equalsIgnoreCase("LOOK")){
                if(r3.size() == 0){
                    System.out.println("There is nothing in this room.");
                    System.out.println("");
                }else{
                    String s = r3.get(0);
                    System.out.println("There is " + s + " in this room.");
                    System.out.println("");
                }

            }if(d.equalsIgnoreCase("GRAB")){
                if(r3.size() == 0){
                    System.out.println("There is nothing to grab in this room.");
                    System.out.println("");
                }else if(inv.size() >= 1){
                    System.out.println("You are carrying your max amount of items.");
                    System.out.println("");
                }else if(r3.get(0).equals("TOE")){
                    String s = r3.get(0);
                    inv.add(s);
                    r3.remove(0);
                    System.out.println("You put the the frog's toe into your backpack.");
                    System.out.println("");
                }else if(r3.get(0).equals("EYE")){
                    String s = r3.get(0);
                    inv.add(s);
                    r3.remove(0);
                    System.out.println("You put the eye of Newt into your backpack.");
                    System.out.println("");
                }else if(r3.get(0).equals("LEG")){
                    String s = r3.get(0);
                    inv.add(s);
                    r3.remove(0);
                    System.out.println("You put the leg of a lizard into your backpack.");
                    System.out.println("");
                }else if(r3.get(0).equals("WING")){
                    String s = r3.get(0);
                    inv.add(s);
                    r3.remove(0);
                    System.out.println("You put the owlet's wing into your backpack.");
                    System.out.println("");
                }else if(r3.get(0).equals("HAIR")){
                    String s = r3.get(0);
                    inv.add(s);
                    r3.remove(0);
                    System.out.println("You put the cat's hair that used to sing into your backpack.");
                    System.out.println("");
                }

            }if(d.equalsIgnoreCase("DROP")){
                if(inv.size() == 0){
                    System.out.println("You have nothing to drop.");
                    System.out.println("");
                }else if(r3.size() >= 1){
                    System.out.println("This room already has its max amount of items.");
                    System.out.println("Try and drop it off at a differant room.");
                    System.out.println("");
                }else if(inv.get(0).equals("TOE")){
                    String s = inv.get(0);
                    r3.add(s);
                    inv.remove(0);
                    System.out.println("dropped the toe of a frog in room 3.");
                    System.out.println("");
                }else if(inv.get(0).equals("EYE")){
                    String s = inv.get(0);
                    r3.add(s);
                    inv.remove(0);
                    System.out.println("You dropped the eye of Newt in room 3.");
                    System.out.println("");
                }else if(inv.get(0).equals("LEG")){
                    String s = inv.get(0);
                    r3.add(s);
                    inv.remove(0);
                    System.out.println("You dropped Lizards leg in room 3.");
                    System.out.println("");
                }else if(inv.get(0).equals("WING")){
                    String s = inv.get(0);
                    r3.add(s);
                    inv.remove(0);
                    System.out.println("You dropped owlet's wing in room 3.");
                    System.out.println("");
                }else if(inv.get(0).equals("HAIR")){
                    String s = inv.get(0);
                    r3.add(s);
                    inv.remove(0);
                    System.out.println("You dropped the cat hair in room 3.");
                    System.out.println("");
                }
            }if(d.equalsIgnoreCase("SCORE")){
                System.out.println("You have a total of " + tPoints + " points.");
                System.out.println("");
            }if(d.equalsIgnoreCase("ITEM")){
                int i = pot.size();
                int iL = 5 - i;
                System.out.println("There are " + iL + " items remaining.");
                System.out.println("");
            }
        }
    }
    public void Room4() {
        r4C += 1;
        System.out.println("----You have entered the 4th room----");
        f.main("Room4.txt");
        if(r4C == 1){
            tPoints += 1;
            r4.add("LEG");
        }

        while(true){
            System.out.print("What would you like to do?: ");
            String d = kb.nextLine();

            if(d.toLowerCase().contains("north") || d.equalsIgnoreCase("N")){
                System.out.println("There are no exit North.");
                System.out.println("");
                Room4();
            }else if(d.toLowerCase().contains("east") || d.equalsIgnoreCase("E")){
                System.out.println("You have gone East.");
                System.out.println("");
                Room6();
            }else if(d.toLowerCase().contains("south") || d.equalsIgnoreCase("S")){
                System.out.println("You have gone South.");
                System.out.println("");
                Room6();
            }else if(d.toLowerCase().contains("west") || d.equalsIgnoreCase("W")){
                System.out.println("You cannot go back that way.");
                System.out.println("");
                Room4();
            }
            if(d.equalsIgnoreCase("QUIT")){
                System.out.println("You have sucessfully vanished.");
                System.exit(0);
            }
            if(d.equalsIgnoreCase("HELP")){
                f.main("help.txt");
            }
            if(d.equalsIgnoreCase("INVENTORY") || d.equalsIgnoreCase("INV")){
                if(inv.size() == 0){
                    System.out.println("Your inventory is empty");
                    System.out.println("");
                }else{
                    String s = inv.get(0);
                    System.out.println("You have " + s + " in your inventory.");
                    System.out.println("");
                }
            }if(d.equalsIgnoreCase("LOOK")){
                if(r4.size() == 0){
                    System.out.println("This room is empty.");
                    System.out.println("");
                }else{
                    System.out.println("You see the lizards leg right in front of you.");
                    System.out.println("");
                }

            }if(d.equalsIgnoreCase("GRAB")){
                if(r4.size() == 0){
                    System.out.println("There is nothing to grab in this room.");
                    System.out.println("");
                }else if(inv.size() >= 1){
                    System.out.println("You are carrying your max amount of items.");
                    System.out.println("");
                }else if(r4.get(0).equals("TOE")){
                    String s = r4.get(0);
                    inv.add(s);
                    r4.remove(0);
                    System.out.println("You put the the frog's toe into your backpack.");
                    System.out.println("");
                }else if(r4.get(0).equals("EYE")){
                    String s = r4.get(0);
                    inv.add(s);
                    r4.remove(0);
                    System.out.println("You put the eye of Newt into your backpack.");
                    System.out.println("");
                }else if(r4.get(0).equals("LEG")){
                    String s = r4.get(0);
                    inv.add(s);
                    r4.remove(0);
                    System.out.println("You put the leg of a lizard into your backpack.");
                    System.out.println("");
                }else if(r4.get(0).equals("WING")){
                    String s = r4.get(0);
                    inv.add(s);
                    r4.remove(0);
                    System.out.println("You put the owlet's wing into your backpack.");
                    System.out.println("");
                }else if(inv.get(0).equals("HAIR")){
                    String s = r4.get(0);
                    inv.add(s);
                    r4.remove(0);
                    System.out.println("You put the cat's hair that used to sing into your backpack.");
                    System.out.println("");
                }

            }if(d.equalsIgnoreCase("DROP")){
                if(inv.size() == 0){
                    System.out.println("You have nothing to drop.");
                    System.out.println("");
                }else if(r4.size() >= 1){
                    System.out.println("This room already has its max amount of items.");
                    System.out.println("Try and drop it off at a differant room.");
                    System.out.println("");
                }else if(inv.get(0).equals("TOE")){
                    String s = inv.get(0);
                    r4.add(s);
                    inv.remove(0);
                    System.out.println("dropped the toe of a frog in room 4.");
                    System.out.println("");
                }else if(inv.get(0).equals("EYE")){
                    String s = inv.get(0);
                    r4.add(s);
                    inv.remove(0);
                    System.out.println("You dropped the eye of Newt in room 4.");
                    System.out.println("");
                }else if(inv.get(0).equals("LEG")){
                    String s = inv.get(0);
                    r4.add(s);
                    inv.remove(0);
                    System.out.println("You dropped Lizards leg in room 4.");
                    System.out.println("");
                }else if(inv.get(0).equals("WING")){
                    String s = inv.get(0);
                    r4.add(s);
                    inv.remove(0);
                    System.out.println("You dropped owlet's wing in room 4.");
                    System.out.println("");
                }else if(inv.get(0).equals("HAIR")){
                    String s = inv.get(0);
                    r4.add(s);
                    inv.remove(0);
                    System.out.println("You dropped the cat hair in room 4.");
                    System.out.println("");
                }
            }if(d.equalsIgnoreCase("SCORE")){
                System.out.println("You have a total of " + tPoints + " points.");
                System.out.println("");
            }if(d.equalsIgnoreCase("ITEM")){
                int i = pot.size();
                int iL = 5 - i;
                System.out.println("There are " + iL + " items remaining.");
                System.out.println("");
            }
        }
    }
    public void Room5() {
        r5C += 1;
        System.out.println("----You have entered the 5th room----");
        f.main("Room5.txt");
        if(r5C == 1){
            tPoints += 1;
        }

        while(true){
            System.out.print("What would you like to do?: ");
            String d = kb.nextLine();

            if(d.toLowerCase().contains("north") || d.equalsIgnoreCase("N")){
                System.out.println("There is no exit North.");
                System.out.println("");
                Room5();
            }else if(d.toLowerCase().contains("east") || d.equalsIgnoreCase("E")){
                System.out.println("You have gone East.");
                System.out.println("");
                Room1();
            }else if(d.toLowerCase().contains("south") || d.equalsIgnoreCase("S")){
                System.out.println("There is no exit South.");
                System.out.println("");
                Room5();
            }else if(d.toLowerCase().contains("west") || d.equalsIgnoreCase("W")){
                System.out.println("You have gone West.");
                System.out.println("");
                Room7();
            }
            if(d.equalsIgnoreCase("QUIT")){
                System.out.println("You have sucessfully vanished.");
                System.exit(0);
            }
            if(d.equalsIgnoreCase("HELP")){
                f.main("help.txt");
            }
            if(d.equalsIgnoreCase("INVENTORY") || d.equalsIgnoreCase("INV")){
                if(inv.size() == 0){
                    System.out.println("Your inventory is empty");
                    System.out.println("");
                }else{
                    String s = inv.get(0);
                    System.out.println("You have " + s + " in your inventory.");
                    System.out.println("");
                }
            }if(d.equalsIgnoreCase("LOOK")){
                if(r5.size() == 0){
                    System.out.println("There is nothing in this room.");
                    System.out.println("");
                }else{
                    String s = r5.get(0);
                    System.out.println("There is " + s + " in this room.");
                    System.out.println("");
                }

            }if(d.equalsIgnoreCase("GRAB")){
                if(r5.size() == 0){
                    System.out.println("There is nothing to grab in this room.");
                    System.out.println("");
                }else if(inv.size() >= 1){
                    System.out.println("You are carrying your max amount of items.");
                    System.out.println("");
                }else if(r5.get(0).equals("TOE")){
                    String s = r5.get(0);
                    inv.add(s);
                    r5.remove(0);
                    System.out.println("You put the the frog's toe into your backpack.");
                    System.out.println("");
                }else if(r5.get(0).equals("EYE")){
                    String s = r5.get(0);
                    inv.add(s);
                    r5.remove(0);
                    System.out.println("You put the eye of Newt into your backpack.");
                    System.out.println("");
                }else if(r5.get(0).equals("LEG")){
                    String s = r5.get(0);
                    inv.add(s);
                    r5.remove(0);
                    System.out.println("You put the leg of a lizard into your backpack.");
                    System.out.println("");
                }else if(r5.get(0).equals("WING")){
                    String s = r5.get(0);
                    inv.add(s);
                    r5.remove(0);
                    System.out.println("You put the owlet's wing into your backpack.");
                    System.out.println("");
                }else if(r5.get(0).equals("HAIR")){
                    String s = r5.get(0);
                    inv.add(s);
                    r5.remove(0);
                    System.out.println("You put the cat's hair that used to sing into your backpack.");
                    System.out.println("");
                }

            }if(d.equalsIgnoreCase("DROP")){
                if(inv.size() == 0){
                    System.out.println("You have nothing to drop.");
                    System.out.println("");
                }else if(r5.size() >= 1){
                    System.out.println("This room already has its max amount of items.");
                    System.out.println("Try and drop it off at a differant room.");
                    System.out.println("");
                }else if(inv.get(0).equals("TOE")){
                    String s = inv.get(0);
                    r5.add(s);
                    inv.remove(0);
                    System.out.println("dropped the toe of a frog in room 5.");
                    System.out.println("");
                }else if(inv.get(0).equals("EYE")){
                    String s = inv.get(0);
                    r5.add(s);
                    inv.remove(0);
                    System.out.println("You dropped the eye of Newt in room 5.");
                    System.out.println("");
                }else if(inv.get(0).equals("LEG")){
                    String s = inv.get(0);
                    r5.add(s);
                    inv.remove(0);
                    System.out.println("You dropped Lizards leg in room 5.");
                    System.out.println("");
                }else if(inv.get(0).equals("WING")){
                    String s = inv.get(0);
                    r5.add(s);
                    inv.remove(0);
                    System.out.println("You dropped owlet's wing in room 5.");
                    System.out.println("");
                }else if(inv.get(0).equals("HAIR")){
                    String s = inv.get(0);
                    r5.add(s);
                    inv.remove(0);
                    System.out.println("You dropped the cat hair in room 5.");
                    System.out.println("");
                }
            }if(d.equalsIgnoreCase("SCORE")){
                System.out.println("You have a total of " + tPoints + " points.");
                System.out.println("");
            }if(d.equalsIgnoreCase("ITEM")){
                int i = pot.size();
                int iL = 5 - i;
                System.out.println("There are " + iL + " items remaining.");
                System.out.println("");
            }
        }
    }
    public void Room6() {
        r6C += 1;
        System.out.println("----You have entered the 6th room----");
        f.main("Room6.txt");
        if(r6C == 1){
            tPoints += 1;
        }

        while(true){
            System.out.print("What would you like to do?: ");
            String d = kb.nextLine();

            if(d.toLowerCase().contains("north") || d.equalsIgnoreCase("N")){
                System.out.println("You have gone North.");
                System.out.println("");
                Room4();
            }else if(d.toLowerCase().contains("east") || d.equalsIgnoreCase("E")){
                System.out.println("You have gone East.");
                System.out.println("");
                Room9();
            }else if(d.toLowerCase().contains("south") || d.equalsIgnoreCase("S")){
                System.out.println("You have gone South.");
                System.out.println("");
                Room8();
            }else if(d.toLowerCase().contains("west") || d.equalsIgnoreCase("W")){
                System.out.println("You have gone West.");
                System.out.println("");
                Room1();
            }
            if(d.equalsIgnoreCase("QUIT")){
                System.out.println("You have sucessfully vanished.");
                System.exit(0);
            }
            if(d.equalsIgnoreCase("HELP")){
                f.main("help.txt");
            }
            if(d.equalsIgnoreCase("INVENTORY") || d.equalsIgnoreCase("INV")){
                if(inv.size() == 0){
                    System.out.println("Your inventory is empty");
                    System.out.println("");
                }else{
                    String s = inv.get(0);
                    System.out.println("You have " + s + " in your inventory.");
                    System.out.println("");
                }
            }if(d.equalsIgnoreCase("LOOK")){
                if(r6.size() == 0){
                    System.out.println("There is nothing in this room.");
                    System.out.println("");
                }else{
                    String s = r6.get(0);
                    System.out.println("You notice that it isn't water... It is blood... You don't know where from.");
                    System.out.println("There is " + s + " in this room.");
                    System.out.println("");
                }

            }if(d.equalsIgnoreCase("GRAB")){
                if(r6.size() == 0){
                    System.out.println("There is nothing to grab in this room.");
                    System.out.println("");
                }else if(inv.size() >= 1){
                    System.out.println("You are carrying your max amount of items.");
                    System.out.println("");
                }else if(r6.get(0).equals("TOE")){
                    String s = r6.get(0);
                    inv.add(s);
                    r6.remove(0);
                    System.out.println("You put the the frog's toe into your backpack.");
                    System.out.println("");
                }else if(r6.get(0).equals("EYE")){
                    String s = r6.get(0);
                    inv.add(s);
                    r6.remove(0);
                    System.out.println("You put the eye of Newt into your backpack.");
                    System.out.println("");
                }else if(r6.get(0).equals("LEG")){
                    String s = r6.get(0);
                    inv.add(s);
                    r6.remove(0);
                    System.out.println("You put the leg of a lizard into your backpack.");
                    System.out.println("");
                }else if(r6.get(0).equals("WING")){
                    String s = r6.get(0);
                    inv.add(s);
                    r6.remove(0);
                    System.out.println("You put the owlet's wing into your backpack.");
                    System.out.println("");
                }else if(r6.get(0).equals("HAIR")){
                    String s = r6.get(0);
                    inv.add(s);
                    r6.remove(0);
                    System.out.println("You put the cat's hair that used to sing into your backpack.");
                    System.out.println("");
                }

            }if(d.equalsIgnoreCase("DROP")){
                if(inv.size() == 0){
                    System.out.println("You have nothing to drop.");
                    System.out.println("");
                }else if(r6.size() >= 1){
                    System.out.println("This room already has its max amount of items.");
                    System.out.println("Try and drop it off at a differant room.");
                    System.out.println("");
                }else if(inv.get(0).equals("TOE")){
                    String s = inv.get(0);
                    r6.add(s);
                    inv.remove(0);
                    System.out.println("dropped the toe of a frog in room 6.");
                    System.out.println("");
                }else if(inv.get(0).equals("EYE")){
                    String s = inv.get(0);
                    r6.add(s);
                    inv.remove(0);
                    System.out.println("You dropped the eye of Newt in room 6.");
                    System.out.println("");
                }else if(inv.get(0).equals("LEG")){
                    String s = inv.get(0);
                    r6.add(s);
                    inv.remove(0);
                    System.out.println("You dropped Lizards leg in room 6.");
                    System.out.println("");
                }else if(inv.get(0).equals("WING")){
                    String s = inv.get(0);
                    r6.add(s);
                    inv.remove(0);
                    System.out.println("You dropped owlet's wing in room 6.");
                    System.out.println("");
                }else if(inv.get(0).equals("HAIR")){
                    String s = inv.get(0);
                    r6.add(s);
                    inv.remove(0);
                    System.out.println("You dropped the cat hair in room 6.");
                    System.out.println("");
                }
            }if(d.equalsIgnoreCase("SCORE")){
                System.out.println("You have a total of " + tPoints + " points.");
                System.out.println("");
            }if(d.equalsIgnoreCase("ITEM")){
                int i = pot.size();
                int iL = 5 - i;
                System.out.println("There are " + iL + " items remaining.");
                System.out.println("");
            }
        }
    }
    public void Room7() {
        r7C += 1;
        System.out.println("----You have entered the 7th room----");
        f.main("Room7.txt");
        if(r7C == 1){
            tPoints += 1;
            r7.add("TOE");
        }
        f.main("Room7.txt");

        while(true){
            System.out.print("What would you like to do?: ");
            String d = kb.nextLine();

            if(d.toLowerCase().contains("north") || d.equalsIgnoreCase("N")){
                System.out.println("You have gone North.");
                System.out.println("");
                Room2();
            }else if(d.toLowerCase().contains("east") || d.equalsIgnoreCase("E")){
                System.out.println("There is no exit East.");
                System.out.println("");
                Room7();
            }else if(d.toLowerCase().contains("south") || d.equalsIgnoreCase("S")){
                System.out.println("There is no exit South.");
                System.out.println("");
                Room7();
            }else if(d.toLowerCase().contains("west") || d.equalsIgnoreCase("W")){
                System.out.println("You have gone West.");
                System.out.println("");
                Room5();
            }
            if(d.equalsIgnoreCase("QUIT")){
                System.out.println("You have sucessfully vanished.");
                System.exit(0);
            }
            if(d.equalsIgnoreCase("HELP")){
                f.main("help.txt");
            }
            if(d.equalsIgnoreCase("INVENTORY") || d.equalsIgnoreCase("INV")){
                if(inv.size() == 0){
                    System.out.println("Your inventory is empty");
                    System.out.println("");
                }else{
                    String s = inv.get(0);
                    System.out.println("You have " + s + " in your inventory.");
                    System.out.println("");
                }
            }if(d.equalsIgnoreCase("LOOK")){
                if(r7.size() == 0){
                    System.out.println("There is nothing in this room.");
                    System.out.println("");
                }else{
                    System.out.println("You see the big frogs toe laying on the ground away from the crowd of frogs.");
                    System.out.println("");
                }

            }if(d.equalsIgnoreCase("GRAB")){
                if(r7.size() == 0){
                    System.out.println("There is nothing to grab in this room.");
                    System.out.println("");
                }else if(inv.size() >= 1){
                    System.out.println("You are carrying your max amount of items.");
                    System.out.println("");
                }else if(r7.get(0).equals("TOE")){
                    String s = r7.get(0);
                    inv.add(s);
                    r7.remove(0);
                    System.out.println("You put the the frog's toe into your backpack.");
                    System.out.println("");
                }else if(r7.get(0).equals("EYE")){
                    String s = r7.get(0);
                    inv.add(s);
                    r7.remove(0);
                    System.out.println("You put the eye of Newt into your backpack.");
                    System.out.println("");
                }else if(r7.get(0).equals("LEG")){
                    String s = r7.get(0);
                    inv.add(s);
                    r7.remove(0);
                    System.out.println("You put the leg of a lizard into your backpack.");
                    System.out.println("");
                }else if(r7.get(0).equals("WING")){
                    String s = r7.get(0);
                    inv.add(s);
                    r7.remove(0);
                    System.out.println("You put the owlet's wing into your backpack.");
                    System.out.println("");
                }else if(r7.get(0).equals("HAIR")){
                    String s = r7.get(0);
                    inv.add(s);
                    r7.remove(0);
                    System.out.println("You put the cat's hair that used to sing into your inventory.");
                    System.out.println("");
                }

            }if(d.equalsIgnoreCase("DROP")){
                if(inv.size() == 0){
                    System.out.println("You have nothing to drop.");
                    System.out.println("");
                }else if(r7.size() >= 1){
                    System.out.println("This room already has its max amount of items.");
                    System.out.println("Try and drop it off at a differant room.");
                    System.out.println("");
                }else if(inv.get(0).equals("TOE")){
                    String s = inv.get(0);
                    r7.add(s);
                    inv.remove(0);
                    System.out.println("dropped the toe of a frog in room 7.");
                    System.out.println("");
                }else if(inv.get(0).equals("EYE")){
                    String s = inv.get(0);
                    r7.add(s);
                    inv.remove(0);
                    System.out.println("You dropped the eye of Newt in room 7.");
                    System.out.println("");
                }else if(inv.get(0).equals("LEG")){
                    String s = inv.get(0);
                    r7.add(s);
                    inv.remove(0);
                    System.out.println("You dropped Lizards leg in room 7.");
                    System.out.println("");
                }else if(inv.get(0).equals("WING")){
                    String s = inv.get(0);
                    r7.add(s);
                    inv.remove(0);
                    System.out.println("You dropped owlet's wing in room 7.");
                    System.out.println("");
                }else if(inv.get(0).equals("HAIR")){
                    String s = inv.get(0);
                    r7.add(s);
                    inv.remove(0);
                    System.out.println("You dropped the cat hair in room 7.");
                    System.out.println("");
                }
            }if(d.equalsIgnoreCase("SCORE")){
                System.out.println("You have a total of " + tPoints + " points.");
                System.out.println("");
            }if(d.equalsIgnoreCase("ITEM")){
                int i = pot.size();
                int iL = 5 - i;
                System.out.println("There are " + iL + " items remaining.");
                System.out.println("");
            }
        }
    }
    public void Room8() {
        r8C += 1;
        System.out.println("----You have entered the 8th room----");
        f.main("Room8.txt");
        if(r8C == 1){
            tPoints += 1;
            r8.add("WING");
        }

        while(true){
            System.out.print("What would you like to do?: ");
            String d = kb.nextLine();

            if(d.toLowerCase().contains("north") || d.equalsIgnoreCase("N")){
                System.out.println("There is no exit North.");
                System.out.println("");
                Room8();
            }else if(d.toLowerCase().contains("east") || d.equalsIgnoreCase("E")){
                System.out.println("You have gone East.");
                System.out.println("");
                Room6();
            }else if(d.toLowerCase().contains("south") || d.equalsIgnoreCase("S")){
                System.out.println("There is no exit South.");
                System.out.println("");
                Room8();
            }else if(d.toLowerCase().contains("west") || d.equalsIgnoreCase("W")){
                System.out.println("You cannot go West.");
                System.out.println("");
                Room8();
            }
            if(d.equalsIgnoreCase("QUIT")){
                System.out.println("You have sucessfully vanished.");
                System.exit(0);
            }
            if(d.equalsIgnoreCase("HELP")){
                f.main("help.txt");
            }
            if(d.equalsIgnoreCase("INVENTORY") || d.equalsIgnoreCase("INV")){
                if(inv.size() == 0){
                    System.out.println("Your inventory is empty");
                    System.out.println("");
                }else{
                    String s = inv.get(0);
                    System.out.println("You have " + s + " in your inventory.");
                    System.out.println("");
                }
            }if(d.equalsIgnoreCase("LOOK")){
                if(r8.size() == 0){
                    System.out.println("There is nothing in this room.");
                    System.out.println("");
                }else{
                    String s = r8.get(0);
                    System.out.println("There is " + s + " in this room.");
                    System.out.println("");
                }

            }if(d.equalsIgnoreCase("GRAB")){
                if(r8.size() == 0){
                    System.out.println("There is nothing to grab in this room.");
                    System.out.println("");
                }else if(inv.size() >= 1){
                    System.out.println("You are carrying your max amount of items.");
                    System.out.println("");
                }else if(r8.get(0).equals("TOE")){
                    String s = r8.get(0);
                    inv.add(s);
                    r8.remove(0);
                    System.out.println("You added the the frog's toe into your backpack.");
                    System.out.println("");
                }else if(r8.get(0).equals("EYE")){
                    String s = r8.get(0);
                    inv.add(s);
                    r8.remove(0);
                    System.out.println("You added the eye of Newt into your backpack.");
                    System.out.println("");
                }else if(r8.get(0).equals("LEG")){
                    String s = r8.get(0);
                    inv.add(s);
                    r8.remove(0);
                    System.out.println("You added the leg of a lizard into your backpack.");
                    System.out.println("");
                }else if(r8.get(0).equals("WING")){
                    String s = r8.get(0);
                    inv.add(s);
                    r8.remove(0);
                    System.out.println("You added the owlet's wing into your backpack.");
                    System.out.println("");
                }else if(r8.get(0).equals("HAIR")){
                    String s = r8.get(0);
                    inv.add(s);
                    r8.remove(0);
                    System.out.println("You added the cat's hair that used to sing into your backpack.");
                    System.out.println("");
                }

            }if(d.equalsIgnoreCase("DROP")){
                if(inv.size() == 0){
                    System.out.println("You have nothing to drop.");
                    System.out.println("");
                }else if(r8.size() >= 1){
                    System.out.println("This room already has its max amount of items.");
                    System.out.println("Try and drop it off at a differant room.");
                    System.out.println("");
                }else if(inv.get(0).equals("TOE")){
                    String s = inv.get(0);
                    r8.add(s);
                    inv.remove(0);
                    System.out.println("dropped the toe of a frog in room 8.");
                    System.out.println("");
                }else if(inv.get(0).equals("EYE")){
                    String s = inv.get(0);
                    r8.add(s);
                    inv.remove(0);
                    System.out.println("You dropped the eye of Newt in room 8.");
                    System.out.println("");
                }else if(inv.get(0).equals("LEG")){
                    String s = inv.get(0);
                    r8.add(s);
                    inv.remove(0);
                    System.out.println("You dropped Lizards leg in room 8.");
                    System.out.println("");
                }else if(inv.get(0).equals("WING")){
                    String s = inv.get(0);
                    r8.add(s);
                    inv.remove(0);
                    System.out.println("You dropped owlet's wing in room 8.");
                    System.out.println("");
                }else if(inv.get(0).equals("HAIR")){
                    String s = inv.get(0);
                    r8.add(s);
                    inv.remove(0);
                    System.out.println("You dropped the cat hair in room 8.");
                    System.out.println("");
                }
            }if(d.equalsIgnoreCase("SCORE")){
                System.out.println("You have a total of " + tPoints + " points.");
                System.out.println("");
            }if(d.equalsIgnoreCase("ITEM")){
                int i = pot.size();
                int iL = 5 - i;
                System.out.println("There are " + iL + " items remaining.");
                System.out.println("");
            }
        }
    }
    public void Room9() {
        r9C += 1;
        System.out.println("----You have entered the 9th room----");
        f.main("Room9.txt");
        if(r9C == 1){
            tPoints += 1;
        }
        f.main("Room9.txt");

        while(true){
            System.out.print("What would you like to do?: ");
            String d = kb.nextLine();

            if(d.toLowerCase().contains("north") || d.equalsIgnoreCase("N")){
                System.out.println("You have gone North.");
                System.out.println("");
                Room6();
            }else if(d.toLowerCase().contains("east") || d.equalsIgnoreCase("E")){
                System.out.println("There is no exit East.");
                System.out.println("");
                Room9();
            }else if(d.toLowerCase().contains("south") || d.equalsIgnoreCase("S")){
                System.out.println("There is no exit South.");
                System.out.println("");
                Room9();
            }else if(d.toLowerCase().contains("west") || d.equalsIgnoreCase("W")){
                System.out.println("You have gone West.");
                System.out.println("");
                Room10();
            }
            if(d.equalsIgnoreCase("QUIT")){
                System.out.println("You have sucessfully vanished.");
                System.exit(0);
            }
            if(d.equalsIgnoreCase("HELP")){
                f.main("help.txt");
            }
            if(d.equalsIgnoreCase("INVENTORY") || d.equalsIgnoreCase("INV")){
                if(inv.size() == 0){
                    System.out.println("Your inventory is empty");
                    System.out.println("");
                }else{
                    String s = inv.get(0);
                    System.out.println("You have " + s + " in your inventory.");
                    System.out.println("");
                }
            }if(d.equalsIgnoreCase("LOOK")){
                if(r9.size() == 0){
                    System.out.println("There is nothing in this room.");
                    System.out.println("");
                }else{
                    String s = r9.get(0);
                    System.out.println("There is " + s + " in this room.");
                    System.out.println("");
                }

            }if(d.equalsIgnoreCase("GRAB")){
                if(r9.size() == 0){
                    System.out.println("There is nothing to grab in this room.");
                    System.out.println("");
                }else if(inv.size() >= 1){
                    System.out.println("You are carrying your max amount of items.");
                    System.out.println("");
                }else if(r9.get(0).equals("TOE")){
                    String s = r9.get(0);
                    inv.add(s);
                    r9.remove(0);
                    System.out.println("You put the the frog's toe into your backpack.");
                    System.out.println("");
                }else if(r9.get(0).equals("EYE")){
                    String s = r9.get(0);
                    inv.add(s);
                    r9.remove(0);
                    System.out.println("You put the eye of Newt into your backpack.");
                    System.out.println("");
                }else if(r9.get(0).equals("LEG")){
                    String s = r9.get(0);
                    inv.add(s);
                    r9.remove(0);
                    System.out.println("You put the leg of a lizard into your backpack.");
                    System.out.println("");
                }else if(r9.get(0).equals("WING")){
                    String s = r9.get(0);
                    inv.add(s);
                    r9.remove(0);
                    System.out.println("You put the owlet's wing into your backpack.");
                    System.out.println("");
                }else if(r9.get(0).equals("HAIR")){
                    String s = r9.get(0);
                    inv.add(s);
                    r9.remove(0);
                    System.out.println("You put the cat's hair that used to sing into your backpack.");
                    System.out.println("");
                }

            }if(d.equalsIgnoreCase("DROP")){
                if(inv.size() == 0){
                    System.out.println("You have nothing to drop.");
                    System.out.println("");
                }else if(r9.size() >= 1){
                    System.out.println("This room already has its max amount of items.");
                    System.out.println("Try and drop it off at a differant room.");
                    System.out.println("");
                }else if(inv.get(0).equals("TOE")){
                    String s = inv.get(0);
                    r9.add(s);
                    inv.remove(0);
                    System.out.println("dropped the toe of a frog in room 9.");
                    System.out.println("");
                }else if(inv.get(0).equals("EYE")){
                    String s = inv.get(0);
                    r9.add(s);
                    inv.remove(0);
                    System.out.println("You dropped the eye of Newt in room 9.");
                    System.out.println("");
                }else if(inv.get(0).equals("LEG")){
                    String s = inv.get(0);
                    r9.add(s);
                    inv.remove(0);
                    System.out.println("You dropped Lizards leg in room 9.");
                    System.out.println("");
                }else if(inv.get(0).equals("WING")){
                    String s = inv.get(0);
                    r9.add(s);
                    inv.remove(0);
                    System.out.println("You dropped owlet's wing in room 9.");
                    System.out.println("");
                }else if(inv.get(0).equals("HAIR")){
                    String s = inv.get(0);
                    r9.add(s);
                    inv.remove(0);
                    System.out.println("You dropped the cat hair in room 9.");
                    System.out.println("");
                }
            }if(d.equalsIgnoreCase("SCORE")){
                System.out.println("You have a total of " + tPoints + " points.");
                System.out.println("");
            }if(d.equalsIgnoreCase("ITEM")){
                int i = pot.size();
                int iL = 5 - i;
                System.out.println("There are " + iL + " items remaining.");
                System.out.println("");
            }
        }
    }
    public void Room10() {
        r10C += 1;
        System.out.println("----You have entered the 10th room----");
        f.main("Room10.txt");
        if(r10C == 1){
            tPoints += 1;
            r10.add("HAIR");
        }

        while(true){
            System.out.print("What would you like to do?: ");
            String d = kb.nextLine();

            if(d.toLowerCase().contains("north") || d.equalsIgnoreCase("N")){
                System.out.println("There is no exit North.");
                System.out.println("");
                Room10();
            }else if(d.toLowerCase().contains("east") || d.equalsIgnoreCase("E")){
                System.out.println("You have gone East.");
                System.out.println("");
                Room9();
            }else if(d.toLowerCase().contains("south") || d.equalsIgnoreCase("S")){
                System.out.println("There is no exit South.");
                System.out.println("");
                Room10();
            }else if(d.toLowerCase().contains("west") || d.equalsIgnoreCase("W")){
                System.out.println("There is no exit West.");
                System.out.println("");
                Room10();
            }
            if(d.equalsIgnoreCase("QUIT")){
                System.out.println("You have sucessfully vanished.");
                System.exit(0);
            }
            if(d.equalsIgnoreCase("HELP")){
                f.main("help.txt");
            }
            if(d.equalsIgnoreCase("INVENTORY") || d.equalsIgnoreCase("INV")){
                if(inv.size() == 0){
                    System.out.println("Your inventory is empty");
                    System.out.println("");
                }else{
                    String s = inv.get(0);
                    System.out.println("You have " + s + " in your inventory.");
                    System.out.println("");
                }
            }if(d.equalsIgnoreCase("LOOK")){
                if(r10.size() == 0){
                    System.out.println("There is nothing in this room.");
                    System.out.println("");
                }else{
                    System.out.println("You see clumps of cat hair on the butcher's block.");
                    System.out.println("");
                }

            }if(d.equalsIgnoreCase("GRAB")){
                if(r10.size() == 0){
                    System.out.println("There is nothing to grab in this room.");
                    System.out.println("");
                }else if(inv.size() >= 1){
                    System.out.println("You are carrying your max amount of items.");
                    System.out.println("");
                }else if(r10.get(0).equals("TOE")){
                    String s = r10.get(0);
                    inv.add(s);
                    r10.remove(0);
                    System.out.println("You put the the frog's toe into your backpack.");
                    System.out.println("");
                }else if(r10.get(0).equals("EYE")){
                    String s = r10.get(0);
                    inv.add(s);
                    r10.remove(0);
                    System.out.println("You put the eye of Newt into your backpack.");
                    System.out.println("");
                }else if(r10.get(0).equals("LEG")){
                    String s = r10.get(0);
                    inv.add(s);
                    r10.remove(0);
                    System.out.println("You put the leg of a lizard into your backpack.");
                    System.out.println("");
                }else if(r10.get(0).equals("WING")){
                    String s = r10.get(0);
                    inv.add(s);
                    r10.remove(0);
                    System.out.println("You put the owlet's wing into your backpack.");
                    System.out.println("");
                }else if(r10.get(0).equals("HAIR")){
                    String s = r10.get(0);
                    inv.add(s);
                    r10.remove(0);
                    System.out.println("You grab some hair that the big cat is losing and put it in your backpack.");
                    System.out.println("");
                }

            }if(d.equalsIgnoreCase("DROP")){
                if(inv.size() == 0){
                    System.out.println("You have nothing to drop.");
                    System.out.println("");
                }else if(r10.size() >= 1){
                    System.out.println("This room already has its max amount of items.");
                    System.out.println("Try and drop it off at a differant room.");
                    System.out.println("");
                }else if(inv.get(0).equals("TOE")){
                    String s = inv.get(0);
                    r10.add(s);
                    inv.remove(0);
                    System.out.println("dropped the toe of a frog in room 10.");
                    System.out.println("");
                }else if(inv.get(0).equals("EYE")){
                    String s = inv.get(0);
                    r10.add(s);
                    inv.remove(0);
                    System.out.println("You dropped the eye of Newt in room 10.");
                    System.out.println("");
                }else if(inv.get(0).equals("LEG")){
                    String s = inv.get(0);
                    r10.add(s);
                    inv.remove(0);
                    System.out.println("You dropped Lizards leg in room 10.");
                    System.out.println("");
                }else if(inv.get(0).equals("WING")){
                    String s = inv.get(0);
                    r10.add(s);
                    inv.remove(0);
                    System.out.println("You dropped owlet's wing in room 10.");
                    System.out.println("");
                }else if(inv.get(0).equals("HAIR")){
                    String s = inv.get(0);
                    r10.add(s);
                    inv.remove(0);
                    System.out.println("You dropped the cat hair in room 10.");
                    System.out.println("");
                }
            }if(d.equalsIgnoreCase("SCORE")){
                System.out.println("You have a total of " + tPoints + " points.");
                System.out.println("");
            }if(d.equalsIgnoreCase("ITEM")){
                int i = pot.size();
                int iL = 5 - i;
                System.out.println("There are " + iL + " items remaining.");
                System.out.println("");
            }
        }
    }
}