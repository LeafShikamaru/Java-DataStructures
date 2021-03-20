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
    * class to take given integers and add a comma for every 3 numbers
    * @param n- the integers
    * @return return numbers with a comma in appropriate places
    */
public class DecimalSeparatorFormatter implements NumberFormatter {

@Override //overide class

    public String format(int n) {
    
        return String.format("%,d",n); //format the number for putting a comma for 3 numbers
    }
}// end class