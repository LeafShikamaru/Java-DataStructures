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
    * class to put a negative numbers in between parenthesis
    * @param n- the integers
    * @return returns number formatted with parenthesis 
    */
public class AccountingFormatter implements NumberFormatter {

@Override


    public String format(int n) {
        if(n < 0) { // if number is negative
            return "(" + -n + ")"; //put within parenthesis
        }else{ //else
            return "" + n; //just return numbers
        }// end if else
    }
}//end class