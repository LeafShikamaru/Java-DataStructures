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

import java.time.Instant;
import java.time.ZoneOffset;

/**
 * PART II.
 * Provide a subclass of Clock namded WorldClock whose constructor
 * accepts a time offset. For example, if you live in California,
 * a new WorldClock(3) should show the time in New York, three
 * time zones ahead. You should not override getTime.
 */
public class WorldClock extends Clock
{
    public WorldClock(int off) 
    { //subclass of clock
        super(); //calling superclass constructor with no arguments

        ZoneOffset offset = ZoneOffset.ofHours(off); //gets an offset from given offset hours and creates an offset
        
        dateTime = Instant.now().atOffset(offset).toLocalDateTime(); //updates dateTime to fix for offset time
    }









}
