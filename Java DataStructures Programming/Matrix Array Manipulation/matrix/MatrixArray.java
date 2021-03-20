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
package matrix;

import util.ArrayUtil;

public class MatrixArray {
    private int rows;
    private int cols;
    private int matrix[];
      
       public MatrixArray(int rows, int cols){
           this.rows = rows;
           this.cols = cols;
           matrix = new int[rows*cols];

           for(int i=0; i<matrix.length; i++){
               matrix[i] = 0;
           }
       } 

       public void consolePrint(){
           for(int i=0; i<matrix.length; i++){
               if((i%cols) == 0){
                   System.out.print("\n" + matrix[i] + "\t");
               }else if(i != cols){
                   System.out.print(matrix[i] + "\t");
               }
           }
           System.out.println("");
       }

       public void changeEvenColsPattern(){
           for(int i=0; i<matrix.length; i++){
               if(i%2 == 0){
                   matrix[i] += 1;
               }
           }
       }

       public void changeAllEvenPattern(){
           for(int i=0; i<matrix.length; i++){
               if(i%2 == 1 && (i/rows)%2 == 1){
                   matrix[i] += 1;
               }
           }
       }

       public double getSum(){
           double sum = ArrayUtil.getSum(matrix);
           return sum;
       }

       public double getAverage(){
           double average = ArrayUtil.getAverage(matrix);
           return average;
       }
}