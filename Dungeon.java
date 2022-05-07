// This class will be used for the Main function as it will call certain
// functions from this class file for the game.
public class Dungeon {

    // Variables for the Level Class.


    // Functions for the Level Class.

    // This function will display the first room of the dungeon that the user will be in.
    void room_a() {
        System.out.println("");
        System.out.println("As you enter into the dugeon, you see a sword and shield on the ground.");
        System.out.println("You decide to pick it up and move forward with them. Now you see two doors");
        System.out.println("that lead to two different rooms. Which door will you choose to enter in?");
        System.out.println("(right / left)");
        System.out.println("");
    }

    // This will display the second room of the first option that the user chooses.
    void room_b() {
        System.out.println("");
        System.out.println("You feel like picking the the left door because it strikes you fancy. As you move");
        System.out.println("to the next room, you come across three Blue Slimes that block your path.");
        System.out.println("What will you do to defeat them?");
        System.out.println("(attack / defend)");
        System.out.println("");
    }

    // This will display the second room of the second option tht the user chooses.
    void room_c() {
        System.out.println("");
        System.out.println("You thought that it would be funny to pick the right room because you think that");
        System.out.println("you are always 'right.' You slowly enter the room and stopped to see that there");
        System.out.println("was a Robot waiting for you! The Robot acted quickly and started running towards");
        System.out.println("you! What will you do?");
        System.out.println("attack / flee");
        System.out.println("");
    }

    // This function will display the victory condidtion based on the user's choice.
    void victory() {
        System.out.println("");
        System.out.println("You have chosen wisely and have escaped death. You see the next room and see a");
        System.out.println("big treasure chest! You opened it and see a message written inside of it.");
        System.out.println("");
        System.out.println("You won the game! Thank you for playing my game!");
        System.out.println("");
    }

    // This function will display the defeat (GAME OVER) condition based on the user's choice.
    void defeat() {
        System.out.println("");
        System.out.println("You have chosen poorly and decide run all the way to the enterance of the dungeon.");
        System.out.println("As you were catching your breath, you see a big Green Dragon that is holding a sign");
        System.out.println("that says...");
        System.out.println("");
        System.out.println("GAME OVER");
        System.out.println("");
    }

} // End of Level Class

// static class is more global. It is used more as a tutorial structure for simple functions.
// regular class is more open to other functions, ideas, etc. (Recomend doing).
