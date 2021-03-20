/**
* Title: GameSimulator
* Semester: COP3337 – Summer 2019
* @author Anaisy Garcia
*
* I affirm that this program is entirely my own work * and none of it is the work of any other person.
*
* Description of program, & explanation of programming: Program runs a random die test
* concept(s) being applied in the program: nested for loops and boolean data types
*/

//package anaisygarciaa1;
import java.util.Random;
/**
   This class models a die that, when cast,
   lands on a random face.
*/
public class Die
{
   private Random generator;
   private int sides;

   /**
      Constructs a die with a given number of sides.
      @param s the number of sides, e.g., 6 for a normal die.
   */
   public Die(int s)
   {
      sides = s;
      generator = new Random();
   }

   /**
      Simulates a throw of the die.
      @return the face of the die.
   */
   public int cast()
   {
      return 1 + generator.nextInt(sides);
   }
}
