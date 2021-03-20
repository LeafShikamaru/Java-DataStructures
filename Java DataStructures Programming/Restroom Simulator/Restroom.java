//package newpackage;

/**
* Title: Restroom
* Semester: COP3337 – Summer 2019
* @author Anaisy Garcia
*
* I affirm that this program is entirely my own work * and none of it is the work of any other person.
*
* Description of program, & explanation of programming: Program runs a random die test
* concept(s) being applied in the program: nested for loops and boolean data types
*/

/**
   A class that shows how restroom stalls are occupied.
*/

public class Restroom
{
    private boolean[] STALLS;//boolean array

   /**
      Constructs a restroom with a given number of stalls.
      @param ns the number of stalls
   */
   public Restroom(int ns)
   {
       STALLS = new boolean[ns];//initializing STALLS for given boolean number of stalls
   }

   /*
      Adds an occupant in the middle of the longest sequence of
      unoccupied places. 
   */
   public void addOccupant()
   {
       //variable initialization
        int longestCount = 0;
        int longestLength = 0;
        int currentCount = 0;
        int currentLength = 0;
        for (int i = 0; i < STALLS.length + 1; i++){ //loop for given stalls length
            if (i == STALLS.length){ //if i is equal to the stalls length then
                if (longestCount > currentCount){ //if the longest is larger than the current
                    currentCount = longestCount;// the current cpunt becomes the value of longest count
                    currentLength = longestLength;//the current length becomes the value of longest length
                }
            }else if (longestCount == 0 && !STALLS[i]){ //else if longest count equals 0 and not within stalls array
                longestLength = i; // make longestLength equal to index i
                longestCount++; //increment longestcount
            }else{ // else
                if (!STALLS[i]){ //if not within stalls array
                    longestCount++; //increment longestCount
                }else{
                    if (longestCount > currentCount){//if the longest is larger than the current
                        currentCount = longestCount;// the current count becomes the value of longest count
                        currentLength = longestLength;//the current length becomes the value of longest length
                    }
                    longestCount = 0;//rather than increment set to 0
                }
            }
        }
        STALLS[currentLength + currentCount / 2] = true; //set boolean to true value for stalls array currentLength + currentCount / 2
   }

   /*
      Gets a string describing the current stall occupation
      @return a string with _ for an empty stall and X for an occupied one
   */
   public String getStalls()
   {
       String q = "";//set q as empty string
        for (boolean a : STALLS) //test for printing out an for occupied of a _ for unoccupied 
            q += a ? "X" : "_"; //if else shorthand
        return q;//give value of q
    }
   }
