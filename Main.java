///////////////////////////////////////////////////////////////////////////////////////////////////
// Author: Joseph Wilson
//
// Program: This software is a Dragon Quest Text Game. While the player is in the dungeon, the 
// player will choose to attack, heal, or run from the fight. When the player runs from the fight, 
// the player will escape the dugeon and ends the game there.
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner; // This imports the Scanner class for inputs.

public class Main {
    public static void main(String[] args) {

      // This will greet the player by displaying a message to them.
      System.out.println("\n");
      System.out.println("################################################");
      System.out.println("Hello, and welcome to the world of Dragon Quest!");
      System.out.println("In this game, you will enter a dungeon and face");
      System.out.println("many monsters on your journey. You will be given");
      System.out.println("choices to chose as you travel through the");
      System.out.println("dangerous dungeon. Good luck and have fun!");
      System.out.println("################################################");
      System.out.println("\n");

      // This creates a Scanner object for 'scanning' the input.
      // Ignore the leaking warning. It is a VS Code extention issue.
      Scanner userInput = new Scanner(System.in);

      // This will prompt the user if he/she wants to start the game by
      // answering 'yes' or 'no.'
      System.out.println("Would you like to start the game?: (yes/no)");

      // This will create a variable for the user's input.
      String choice = userInput.nextLine(); 


      while (true) {

        String input = choice;

        // input.equals compares the contents of the input.
        if (input.equals("yes")) {
          System.out.println("Let's go!");
          break;
        }

        else if (input.equals("no")) {
          System.out.println("See you later!");
          break;
        }

        else {
          System.out.println("Please try again by typing 'yes' or 'no.'");
          break;
        }
      }

    

    }
  }

