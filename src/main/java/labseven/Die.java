package labseven;

import java.util.Random;

/** Represents an N-sided die.
 *
 * @author Solutions Repository
 */
public class Die {

  private final int sides;
  private Random random;
  private int result;
  
  /** Constructor.
   *
   * @param sides Number of sides for die
   */
  public Die(int sides) {
    this.sides = sides;
    this.random = new Random();
  }
  
  /** Rolls the die.
   *
   */
  public void roll() {
    this.result = this.random.nextInt(this.sides) + 1;
  }
  
  /** Represents the roll value as an int.
   *
   */
  public int getRoll() {
    return this.result;
  }
  
  /** Represents the roll value as a string.
   *
   */
  public String toString() {
    return String.valueOf(this.result);
  }
}