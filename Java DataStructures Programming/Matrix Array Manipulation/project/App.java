//=============================================================================
// PROGRAMMER:Anaisy Garcia		
// PANTHER ID:5734454		
//
// CLASS: COP2210 Programming 1    		
// SECTION: U15     	
// SEMESTER: Spring 2019    	
// CLASSTIME: MoWe 5:00 PM - 6:25PM   	
//
// Project: Lab Final  
// DUE: April 19       
//
// CERTIFICATION: I certify that this work is my own and that
//                 none of it is the work of any other person.
//=============================================================================
package project;

import util.ArrayUtil;
import matrix.MatrixArray;

public class App {
    public static void main(String[] args) {
        
        int[] rnds = ArrayUtil.createRandomArray(15,100);
        System.out.println("15 Elements of the random Array");
        System.out.println("---------------------------------------------------------");
        ArrayUtil.printArray(rnds);
        System.out.println("---------------------------------------------------------");
        
        System.out.println("");
        System.out.println("Array Sum = " + ArrayUtil.getSum(rnds));
        System.out.println("Array Average = " + ArrayUtil.getAverage(rnds));
        System.out.println("Array Elements below the Average = " +
        ArrayUtil.numBelowAverage(rnds));
        
        System.out.println("Array Maximum = " + ArrayUtil.getMaximum(rnds));
        System.out.println("Array Minimum = " + ArrayUtil.getMinimum(rnds));
        System.out.println("\n\n");
        System.out.println("----------------------------------------------------------");
        System.out.println("Elements of a 10x10 MatrixArray");
        System.out.println("----------------------------------------------------------");
        
        MatrixArray matrixArray = new MatrixArray(10,10);
        matrixArray.consolePrint();
        System.out.println("Sum of Matrix = " + matrixArray.getSum());
        System.out.println("Average of Matrix = " + matrixArray.getAverage());
        System.out.println("---------------------------------------------------------");
        System.out.println("\n");
        
        matrixArray.changeEvenColsPattern();
        matrixArray.consolePrint();
        System.out.println("Sum of Matrix = " + matrixArray.getSum());
        System.out.println("Average of Matrix = " + matrixArray.getAverage());
        System.out.println("---------------------------------------------------------");
        System.out.println("\n");
        
        matrixArray.changeAllEvenPattern();
        matrixArray.consolePrint();
        System.out.println("Sum of Matrix = " + matrixArray.getSum());
        System.out.println("Average of Matrix = " + matrixArray.getAverage());
        System.out.println("---------------------------------------------------------");
        System.out.println("\n");
    }    
}