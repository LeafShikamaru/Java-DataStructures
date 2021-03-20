/**
* Title: Numbers
* Semester: COP3337 – Summer 2019
* @author Anaisy Garcia
*
* I affirm that this program is entirely my own work * and none of it is the work of any other person.
*
* Description of program, & explanation of programming: Program get Numbers and adjusts
* for a different format depending on whats needed.
*/

//package Numbers;

//import Numbers.NumberFormatter;

/**
    * class to format numbers without commas just negatives if needed
    * @param n- the integers
    * @return return the default number in the usual way
    */
public class DefaultFormatter implements NumberFormatter {

@Override //override class

    public String format(int n) {
        return "" + n; //return format
    }

}//end class