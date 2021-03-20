/**
* Title: Clock
* Semester: COP3337 – Summer 2019
* @author Anaisy Garcia
*
* I affirm that this program is entirely my own work * and none of it is the work of any other person.
*
* Description of program, & explanation of programming: Program get local time and
* splits it into hours and minutes, sets an alarm, and clears it by using splits and substrings.
*/

//package anaisygarciaa3;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * Part I: Implement a class Clock whose getHours, getMinutes and
 * getTime methods return the current time at your location.
 * Return the time as a string.
 *
 * There are two ways to retrieve the current time as a String:
 *
 * 1) Before Java 8 use new Date().toString()
 * 2) With Java 8, you can use 3 classes in the java.time package:
 *    Instant, LocalDateTime and ZoneId. Here's how you do it:
 *    String timeString = LocalDateTime.ofInstant(Instant.now(),
 *                            ZoneId.systemDefault()).toString()
 *
 * With either method, you'll need to extract the hours and
 *   minutes as a substring.
 *
 *
 * Add an alarm feature to the Clock class.
 * When setAlarm(hours, minutes) is called, the clock
 * stores the alarm. When you call getTime, and the alarm
 * time has been reached or exceeded, return the time followed
 * by the string "Alarm" and clear the alarm.
*/
public class Clock
{
   //variable initialzation
   private int hours = 0;
   private int minutes = 0;
   public LocalDateTime dateTime; //local time is public
    
    public Clock() 
    { //getting and setting current time with code provided
        dateTime = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
    }

   /**
    * Sets the alarm.
    * @param hours hours for alarm
    * @param minutes minutes for alarm
    */
   public void setAlarm(int hours, int minutes)
   { //linking hours to private hours and minutes to private minutes
        this.hours = hours;
        this.minutes = minutes;
   }

   /**
    * gets current time composed of hours and minutes
    * @return time in string;
    */
   public String getTime()
   { //since time is a string we must split here we are splitting by T
        String time; //initialize time string
        time = currentTime().split("T")[1]; //split by T
        time = time.substring(0, 5); //split into 5 due to time being in format 00:00
        
        if (hours != 0 && (Integer.parseInt(getHours()) >= hours && Integer.parseInt(getMinutes()) >= minutes)) 
        { //checking for an alarm witch if statement
            //since the alarm was found reset hours and minutes
            hours = 0; 
            minutes = 0;
            return time + " Alarm"; //returning and printing time with "Alarm" as specified in code
        }
        return time; //return time string
   }

   /**
    * gets hours
    * @return hours of current time in string
   */
   public String getHours()
   {
      //splitting time string again from above code
        String time; //initialize time string
        time = currentTime().split("T")[1]; //split by T
        time = time.substring(0, 5); //time in 00:00 string format

        return time.substring(0, 2); //return string from 00:00 only hours in first 00 format without :
   }

   /**
    * gets minutes
    * @return hours of current time in string
   */
   public String getMinutes()
   {
       //splitting time string again from above code
       String time; //initialize time string
       time = currentTime().split("T")[1]; //split by T
       time = time.substring(0, 5); //time in 00:00 string format
       
       return time.substring(3, 5); //return string from 00:00 only minutes in second 00 format without :
   }

   /**
      Returns the current Date and Time as a String.
   */
   private String currentTime()
   {
      return dateTime.toString(); //return dateTime as a string
   }
}
