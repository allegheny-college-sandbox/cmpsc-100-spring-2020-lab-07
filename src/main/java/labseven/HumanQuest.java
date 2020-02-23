package labseven;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/** Plays a high-stakes encounter of HumanQuest.
 *
 * @author Solution Repository
 */
public class HumanQuest {

  /** Entry point.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) {    
    // Set up file input
    File file = null;
    Scanner input = null;
    try {
      file = new File("input/quest.stats");
      input = new Scanner(file);
    } catch (FileNotFoundException noFile) {
      System.exit(0);
    }
    
    // Read file contents into appropriate variables
    int difficulty = input.nextInt();
    String monster = input.nextLine();
    
    // Roll the monster's difficulty die
    Die d20 = new Die(difficulty);
    d20.roll();
    
    // Print the monster's roll
    System.out.println("The party must beat the " + monster + "'s roll: " + d20);
    
    // Set up and roll each party members dice
    Die d2 = new Die(2);
    d2.roll();
    Die d4 = new Die(4);
    d4.roll();
    Die d6 = new Die(6);
    d6.roll();
    Die d8 = new Die(8);
    d8.roll();
    
    // Print result of party rolls
    System.out.println("G. Wiz rolls: " + d4);
    System.out.println("Slippy rolls: " + d6);
    System.out.println("Frogger rolls: " + d8);
    System.out.println("Lyle rolls: " + d2);
    
    // Total the rolls
    int total = d2.getRoll() +  d4.getRoll() + d6.getRoll() + d8.getRoll();
    
    // Create a boolean to evaluate
    boolean winsEncounter = total > d20.getRoll();
    
    // Print Total roll and comparison to monster roll
    System.out.println("The party's total roll: " + total);
    System.out.println("The party defeated the " + monster + ": " + winsEncounter);
  }
}