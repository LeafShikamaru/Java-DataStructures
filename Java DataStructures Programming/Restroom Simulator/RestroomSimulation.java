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

import java.util.Scanner;

/**
      Print diagrams of restroom stalls as they are occupied.
      The premise is that people generally prefer to maximize
      their distance from already occupied stalls, by occupying
      the middle of the longest sequence of unoccupied places.
*/
public class RestroomSimulation
{
   public static void main(String[] args)
   {
      int end = 0; // set end to 0
      
      while (end != -1){ // while the end is not -1
      
      Scanner scan = new Scanner(System.in);//create scanner
      System.out.println("Enter number (between 5 and 30) of stalls: ");//ask for input
      int STALLS = scan.nextInt();//set STALLS # to given number
      
      if(STALLS >= 5 && STALLS <= 30){ //if within boundaries for between 5 and 30

      
      Restroom wc = new Restroom(STALLS);
      
      for (int i = 1; i <= STALLS; i++){
         wc.addOccupant();
         System.out.println(wc.getStalls());
         end = -1;//ends when correct number is imputed
      }
          }else{
          System.out.println("Error not within range. Try again."); //keeps printing till correct number inputted
      
      }
   }
   }
}
