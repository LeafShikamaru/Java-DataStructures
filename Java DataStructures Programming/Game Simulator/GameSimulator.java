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
public class GameSimulator
{
   private int tries;
   private Die d1, d2;
   private int wins;
   private int losses;

   /**
      Construct a simulator object for die games.
      @param numSides the number of sides on the die.
      @param numTries the number of times to run the simulation.
   */
   public GameSimulator(int numSides, int numTries)
   {
      this.tries = numTries; //assigns numTries to tries
      d1 = new Die(numSides); // dreates a new die called d1 with numSides from Die class
      d2 = new Die(numSides); // dreates a new die called d2 with numSides from Die class
   }

   /**
      Runs a single die simulation.
      One die is cast 4 times. If a six appears in those 4 casts,
      then wins is incremented, otherwise losses is incremented.
      Simulation is run according to the number of tries set.
   */
   public void runSingleDieSimulation()
   {
      for(int counter = 0; counter < tries; counter++){ //will run for number of tries given GameSimulator
          boolean aWinny = false; //assigns the boolean expression aWinny to false
          
          for(int cast = 0; cast < 4; cast++){  //this will run for cast 4 times
              
              if(d1.cast() == 6){ //if a 6 appears within the 4 casts then
                  wins++; //increment the variable wins for 6 for the die
                  aWinny = true;//reassign aWinny to true to finish the 4 casts
                  break;//break loop
              }//end if
              
          }//end second for
          
          if(aWinny == false){ //till aWinny is true count losses
              losses++; //increment the variable losses for both dies
       } //end if else
          
     }// end first for
  }//end runSingleDieSimulation

   /**
      Runs a double die simulation.
      A pair of dice are cast 24 times. If a double-six appears in
      those 24 casts, then wins is incremented, otherwise losses
      is incremented. The simulation is run according to the number
      of tries set.
   */
   public void runDoubleDieSimulation()
   {
     for(int x = 0; x < tries; x++) { //will run for number of tries given GameSimulator
           boolean doubleWinny = false; //assigns the boolean expression doubleWinny to false
           
           for(int y = 0; y < 24; y++) { //this will run for cast 24 times
               
               int dieOne = d1.cast(); //assigns dieOne to cast class in Die.java
               int dieTwo = d2.cast(); //assigns dieTwo to cast class in Die.java
               
               if(dieOne == 6 && dieTwo == 6){ //if a 6 appears in both die in those 24 casts then
                   wins++; //increment the variable wins for 6 for both dies
                   doubleWinny = true; //reassign doubleWinny to true to finish the 24 casts
                   break;//break loop
                }//end first if
               
             }//end second for
           
               if (doubleWinny == false){ //till doubleWinny is true count losses
                   losses++; //increment the variable losses for both dies
        }// end second if
               
    }//end first for
}// end runDoubleDieSimulation

   /**
      Returns the % of wins.
      @return the % of wins.
   */
   public double getWinPercent()
   {
      return (double)(wins) / (wins + losses);
   }

   /**
      Returns the number of wins.
      @return the number of wins.
   */
   public int getWins()
   {
      return wins;
   }

   /**
      Returns the number of losses.
      @return the number of losses.
   */
   public int getLosses()
   {
      return losses;
   }
}
