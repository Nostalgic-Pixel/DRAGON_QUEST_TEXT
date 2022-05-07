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


      // This WHILE loop will take the user's choice and go through each of the 
      // possibilites inside of the if/else statements to determine the output
      // to the user.
      while (true) {


        // Create a variable that the input equals to the user's choice.
        String input = choice;

        
        // If the choice was "yes," then the game will start and begin by asking the user questions.
        if (input.equals("yes")) { // input.equals compares the contents of the input.
          System.out.println("");
          System.out.println("Let's go!");
          System.out.println("");


           // Call the Dungeon Class here and declair it as a new varialbe ('c').
           Dungeon c = new Dungeon();


           // This calls the room_a function from the Dungeon class.
           c.room_a();


           // Declare new variable for the input function (A).
           String inputA = userInput.nextLine();
           

           // Route 1 (A -> B)
           // If the user picks to go 'left,' the user will then go in the B room path.
           if (inputA.equals("left")) {
             c.room_b();
             String inputB = userInput.nextLine(); // Declare another new varialbe for the inpute function (B).
             

             // If the user picks 'attack, the user wins the game!
             if (inputB.equals("attack")) {
              c.victory();
              break;
             }
             

             // If the user picks 'defend,' the user loses the game...
             else if (inputB.equals("defend")) {
               c.defeat();
               break;
             }
           } // End of Route 1


           // Route 2 (A -> C)
           if (inputA.equals("right")) {
             c.room_c();
             String inputC = userInput.nextLine(); // Declare another new variable for the input function (C).

            // If the user picks 'attack,' the user loses the game...
             if (inputC.equals("attack")) {
               c.defeat();
               break;
             }


             // If the user picks 'flee', the user wins the game!
             else if (inputC.equals("flee")) {
               c.victory();
               break;
             }
           } // End of Route 2
          break;
        }


        // If the choice is "no," then the software will end.
        else if (input.equals("no")) {
          System.out.println("See you later!");
          break;
        }


        // Else, tell the user that their answer is not valid.
        else {
          System.out.println("Please restart the software and try again by typing 'yes' or 'no.'");
          break;
        }

        
      } // End of the main WHILE loop.

    } // End of the main function.

  } // End of the Main Class.
