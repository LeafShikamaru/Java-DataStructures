/**
* Title: Polynomial Printing
* Semester: COP3337 – Summer 2019
* @author Anaisy Garcia
*
* I affirm that this program is entirely my own work * and none of it is the work of any other person.
*
* Description of program, & explanation of programming: Program constructs a polynomial and
* takes given terms, adds and multiplies them, then organizes them by power.
*/

//package anaisygarciaa9;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;

/**
   A class to represent a polynomial.
*/
public class Polynomial
{
    LinkedList <Term> ploynomial; //polynomial as type LinkedList

   /**
      Constructs an empty polynomial
   */
   public Polynomial()
   {
        ploynomial = new LinkedList<>();
   }

   /**
      Constructs a new polynomial with the given term
      @param t the term to initialize the polynomial with
   */
   public Polynomial(Term t)
   {
        ploynomial = new LinkedList<>();
        boolean add;
        add = ploynomial.add(t);
   }

   /**
      Adds the polynomial such that the terms are in sorted order
      from highest power to lowest
      @param p the polynomial to add
   */
   public void add(Polynomial p)
   {
        int index;
        index = 0;
        boolean added;
        Term firstTerm;

       for (Iterator<Term> it = p.ploynomial.iterator(); it.hasNext();){ //compare each Term to current term
           Term secondTerm;
           secondTerm = it.next();
           added = false;
           
           while(!added && index < ploynomial.size()){ //term is not added or not otherwise compare more terms
               firstTerm = ploynomial.get(index);
               
               if(firstTerm.getPower() != secondTerm.getPower()){ //find if the terms compared are same power
                   if(secondTerm.getPower() <= firstTerm.getPower()){ //if less
                        }else{
                            ploynomial.add(index, new Term(secondTerm.getCoefficient(), secondTerm.getPower()));
                            added = true;
                        }
                    }else{
                        firstTerm.addIfSamePower(secondTerm);//add if same power
                        added = true;
                    }
               index++; //move on to next term in the existing list if the power is less than the current term
           }
           
           if(added){ //if the term did not match any powers in existing term
                }else{
                    ploynomial.add(new Term(secondTerm.getCoefficient(), secondTerm.getPower())); //add to end
                 }
       }
    }

   /**
      Multiplies the given polynomial with this one and returns the result
      @param p the polynomial to multiply
      @return this * p
   */
   public Polynomial multiply(Polynomial p)
   {
       Polynomial result; //Intialize the polynomial object
       result = new Polynomial();
       
       for (Iterator<Term> it = p.ploynomial.iterator(); it.hasNext();) {
           Term t1 = it.next();
           ploynomial.stream().map((t2) -> t1.multiply(t2)).forEachOrdered((t3) -> {
           result.add(new Polynomial(t3));
           });
       }
    return result;
    }

   /**
      Prints the polynomial "nicely" so that it reads
      from highest term to lowest and doesn't have a
      leading "+" if the first term is positive.
   */
   public void print()
   {
      String str;
      str = "\t";
      
      for(int i = 0; i < ploynomial.size(); i++){
          Term t;
          t = ploynomial.get(i);
          
          if(t.getCoefficient() > 0){
              if(i == 0){
                }else{
                    str += " + " ;
                }
            }else{
                str += " - ";
            }
          str += t.toString();
      }
      System.out.print(str);
   }
}
