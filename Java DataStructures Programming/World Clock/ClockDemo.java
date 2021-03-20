/**
* Title: Clock
* Semester: COP3337 – Summer 2019
* @author Anaisy Garcia
*
* I affirm that this program is entirely my own work * and none of it is the work of any other person.
*
* Description of program, & explanation of programming: Program get local time and
* splits it into hours and minutes, sets an alarm, and clears it.
*/

//package anaisygarciaa3;

/**
 * Tests the alarm feature of the Clock class.
 */
public class ClockDemo
{
   public static void main(String[] args)
   {
      //test WorldClock
	  System.out.println("");
	  System.out.println("Testing WorldClock class");
	  int offset = 3;
	  System.out.println("Offset: " + offset);
	  WorldClock wclock = new WorldClock(offset);
	  System.out.println("Hours: " + wclock.getHours());
	  System.out.println("Minutes: " + wclock.getMinutes());
      System.out.println("Time: " + wclock.getTime());



      //test the AlarmClock
      System.out.println("");
      System.out.println("Testing AlarmClock");
      Clock clock = new Clock();
      System.out.println("Hours:" + clock.getHours());
      System.out.println("Minutes: " + clock.getMinutes());
      System.out.println("Time: " + clock.getTime());

      //test AlarmClock with alarm
      int h = Integer.parseInt(clock.getHours());
      int m = Integer.parseInt(clock.getMinutes());

      clock.setAlarm(h, m - 1);
      System.out.println("Time:" + clock.getTime());
      //test to see if the Alarm is cleared.
      System.out.println("Time: " + clock.getTime());
   }
}
