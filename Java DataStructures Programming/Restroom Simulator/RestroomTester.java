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

public class RestroomTester
{
   public static void main(String[] args)
   {
      int STALLS = 12;
      Restroom wc = new Restroom(STALLS);
      wc.addOccupant();
      System.out.println(wc.getStalls());
      System.out.println("Expected: ______X_____");
      wc.addOccupant();
      System.out.println(wc.getStalls());
      System.out.println("Expected: ___X__X_____");
   }
}
