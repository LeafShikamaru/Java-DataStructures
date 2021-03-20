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
/**
   This program simulates the wins and losses for
   two different games of dice.
*/
public class DiceOddsTester
{
   public static void main(String[] args)
   {

      GameSimulator simulator = new GameSimulator(6, 1000000);

      simulator.runSingleDieSimulation();
      System.out.println("Game #1 wins: " + simulator.getWinPercent());
      System.out.println("Expected: .51");

      simulator.runDoubleDieSimulation();
      System.out.println("Game #2 wins: " + simulator.getWinPercent());
      System.out.println("Expected: .49");
   }
}
