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
    * class to format a number depending on base between 2 and 36
    * @param n- the integers
    * @param tmp- test for base
    * @param x- variable used to test
    * @return returns number formatted for appropriate base
    */
class BaseFormatter implements NumberFormatter {
int tmp; //tmp value to test as base

public BaseFormatter(int x) {
    tmp = x;
    
    if(tmp < 2 || tmp > 36){ //if the values are out of range 2-36
        tmp = 2; //default to 2
    }
}

public String format(int n)
{
    return Integer.toString(n, tmp); //return format
}

int getBase()
{
    return tmp;
}

}//end class