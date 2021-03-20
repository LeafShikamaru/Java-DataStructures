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
package util;

import java.util.Random;

public class ArrayUtil {
    public static final String VERSION = "1.27";
    
    public static int[] createRandomArray(int length, int randomBound){
        int randomArray[] = new int[length];
             Random random = new Random();
             for(int i=0; i<length; i++){
                    randomArray[i] = random.nextInt(randomBound);
             }
             return randomArray;
    }
    
    public static double getAverage(int[] theArray){
             double sum1 = 0;
             for(int i=0; i<theArray.length; i++){
                 sum1 += theArray[i];
             }
             double average  = sum1/theArray.length;
             return average;
    }

       public static double getSum(int[] theArray){
             double sum2 = 0;
             for(int i=0; i<theArray.length; i++){
                    sum2 += theArray[i];
             }
             return sum2;
       }

       public static int getMaximum(int[] theArray){
             int max = theArray[0];
             for(int i=1; i<theArray.length; i++){
                    if(theArray[i] > max){
                           max = theArray[i];
                    }
             }
             return max;
       }
       
         public static int getMinimum(int[] theArray){
             int min = theArray[0];
             for(int i=1; i<theArray.length; i++){
                    if(theArray[i] < min){
                           min = theArray[i];
                    }
             }
             return min;
       }

      

       public static int numBelowAverage(int[] theArray){
             double average = getAverage(theArray);
             int counter = 0;
             for(int i=0; i<theArray.length; i++){
                 if(theArray[i] < average){
                           counter++;
                 }
             }
             return counter;
       }

       public static void printArray(int[] theArray){
             for(int i=0; i<theArray.length; i++){
                 if(i<theArray.length-1){
                    System.out.print(theArray[i] + "," + " ");
             } else {
             System.out.println("" + theArray[i]);
                     }
             }
       }
}
