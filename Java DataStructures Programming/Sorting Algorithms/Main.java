//5734454
//code based off what was taught in class. Anything copied directly off powerpoints will show slide number.

//main based off WritingToTextFile given with assignment materials things changed will be commented on to explain implementation

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

//modified to fit UML diagram
class Main
{
    public static void main(String[] args)
    {
        Main();
    }
    
    /**
    * Illustrates how to create text file in Java program
    * @author Prof. A. Hernandez
    */
    public static void Main(){
        String outputFilename = "SortingAlgorithms.csv"; //output file name changed
        PrintWriter output = null;
        //open output stream
        try
        {
            output = new PrintWriter(new FileWriter(outputFilename));
        }catch (IOException ex)
        {
            System.exit(1);
        }

        Random rnd = new Random();
        int n = 0; //n changed to 0
        //headers added
        output.println("      n" + "," + "bubblesort" + "," + "insertionsort" + "," + "mergesort" + "," + "quicksort" + "," + "selectionsort" + ",");

        for(int i = 1; i <= 1000; i++) //for loop changed to <= 1000 for 1000 runs of timing
        { 
            n += 100; //increment by 100
            int list[] = new int [n];
            SortingAlgorithms object = new SortingAlgorithms();

            //fill array with random values
            SortingAlgorithms.fillArray(list);
            output.print(list.length + ",");
            int a[], b[], c[], d[], e[];
            a = b = c = d = e = list; //assign all to list
            
            //timing codes based off timing code in week 4 slide number 16
            //timing for bubble sort
            long startTime = System.nanoTime();
            SortingAlgorithms.bubbleSort(a);
            long endTime = System.nanoTime();
            long durationInNano = (endTime - startTime);
            output.print(durationInNano + ",");

            //timing for inserton sort
            startTime = System.nanoTime();
            SortingAlgorithms.insertionSort(b);
            endTime = System.nanoTime();
            durationInNano = (endTime - startTime);
            output.print(durationInNano + ",");

            //timing for mergesort
            startTime = System.nanoTime();
            SortingAlgorithms.mergeSort(c);
            endTime = System.nanoTime();
            durationInNano = (endTime - startTime);
            output.print(durationInNano + ",");

            //timing for quicksort
            startTime = System.nanoTime();
            object.quickSort(d);
            endTime = System.nanoTime();
            durationInNano = (endTime - startTime);
            output.print(durationInNano + ",");

            //timing for selection sort
            startTime = System.nanoTime();
            SortingAlgorithms.selectionSort(e);
            endTime = System.nanoTime();
            durationInNano = (endTime - startTime);
            output.print(durationInNano + ",");

            output.println();
            output.flush();
            System.out.println(i);
        }
    }
}
