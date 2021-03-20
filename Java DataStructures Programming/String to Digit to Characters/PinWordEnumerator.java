/**
* Title: String to Digit to Characters
* Semester: COP3337 – Summer 2019
* @author Anaisy Garcia
*
* I affirm that this program is entirely my own work * and none of it is the work of any other person.
*
* Description of program, & explanation of programming: Program uses inputted string of numbers converts them to digits and
* finds their character equivalent then outputs all possible combination.
*/

//package anaisygarciaa8;

import java.util.Scanner;

/**
   Converts a numeric pin to an equivalent word using the digit to 
   letter mapping on a standard telephone keypad.
 */
public class PinWordEnumerator
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a pin number-> ");
        String num = scan.nextLine();
        System.out.println();
        System.out.printf("The keypad encodings for %s are:%n",num);
        enumerateWords(num);
    }

    //letters list for numbers 0 1 2 3 4 5 6 7 8 9 in that order
    static String lettersList[] = {"", "", "abc", "def", "ghi", "jkl","mno", "pqrs", "tuv", "wxyz"};

    /**
        A wrapper for a recursive method that enumerates all the
        phone keypad encodings for a number.
        @param n a string representing the number
    */
    public static void enumerateWords(String n)
    {
        //replace all 1 and 0 because they have no letters assigned to them
        n = n.replaceAll("0", "error"); //zero will return error message
        n = n.replaceAll("1", "error"); //one will return error message

        //result array
        char result[];
        result = new char[n.length()];

        //number array
        int num[];
        num = new int[n.length()];

            //convert string to individual integer digits
            try {
                //loop from list and convert
                for(int i = 0; i < n.length(); i++){ //for i less than string n length
                    num[i] = Integer.parseInt(n.charAt(i) + ""); //convert character at i to integer digit and store in num
            }

            } catch(NumberFormatException x){ //catch exception for 0s 1s and letters
                System.out.println("Error: Invalid entry. No letters, 1s, or 0s."); //print error message
            }

        printUntil(num, 0, result, n.length()); //print until all combos done
    }//end enumerateWords

    /**
        Recursive method to print all words that can be obtained by the 
        inputted number. 
        The output words are stored in output.
        * @param i, j - index in letters list
        * @return string - string of letters combinations
    */
    public static void printUntil(int num[], int currentDigit, char output[], int n)
    {
        int i; //initialize i
        if (currentDigit != n){ //if current digit is not n
            } else {
                for(int j = 0; j < output.length; j++) //for a j less than output length
                    System.out.print(output[j]); //print out j
                    System.out.println(); //go to next line
                    return; //output
            }

        /**
            Try all combination of characters for current digit
            and remaining digits.
        */
        for(i = 0; i < lettersList[num[currentDigit]].length(); i++){ //for i less than letters list current digit length
            output[currentDigit] = lettersList[num[currentDigit]].charAt(i); //output character at index

            printUntil(num, currentDigit + 1, output, n); //print until all combos done

            if (num[currentDigit] != 0 && num[currentDigit] != 1){ //if the current digit is not 1 or 0 output
                } else {
                    return; //output
            }//end if
        }//end for
    }//end printUntil
}//end main