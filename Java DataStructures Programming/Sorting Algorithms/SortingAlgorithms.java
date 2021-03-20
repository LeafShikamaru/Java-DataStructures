//5734454
//code based off what was taught in class. Anything copied directly off powerpoints will show slide number.

import java.util.Random;

public class SortingAlgorithms
{
    //bubble sort from week 5 slide 4
    public static void bubbleSort(int []list)
    {
     for(int i=0; i < list.length-1; i++)
        for(int j=0; j < list.length-i-1; j++)
            if(list[j] > list[j+1])
            {
                //swap list[j] and list[j+1]
                int temp = list[j];
                list[j] = list[j+1];
                list[j+1] = temp;
            }
    }
    
    //insertion sort from week 5 slide 14
    public static void insertionSort(int []list)
    {
        for(int i=1; i < list.length; i++)
         {
            int temp = list[i];
            int j = i-1;
            while (j>=0 && temp < list[j])
            {
                list[j+1] = list[j];
                j--;
            }
            list[j+1] = temp;
         }
    }

    //mergesort based off week 6 slides 18 through 25
    public static void mergeSort(int []list)
    {
        if(list == null)
        {
            return;
        }

        if(list.length > 1)
        {
            int middle = list.length / 2;

            int[] left = new int[middle];
            System.arraycopy(list, 0, left, 0, middle);

            int[] right = new int[list.length - middle];
            for(int i = middle; i < list.length; i++)
            {
                right[i - middle] = list[i];
            }
            mergeSort(left);
            mergeSort(right);

            int i = 0;
            int j = 0;
            int k = 0;

            while(i < left.length && j < right.length)
            {
                if(left[i] < right[j])
                {
                    list[k] = left[i];
                    i++;
                }else{
                    list[k] = right[j];
                    j++;
                }
                k++;
            }

            while(i < left.length)
            {
                list[k] = left[i];
                i++;
                k++;
            }

            while(j < right.length)
            {
                list[k] = right[j];
                j++;
                k++;
            }
        }
    }

    //quicksort given with assignment files modifications will have comments
     /**
     * Recursive quicksort algorithm
     * @author Prof. A. Hernandez
     */
    public void quickSort(int []list) //added int []list to specify list array
    {
        quicksort(0, list.length - 1, list); //added list
    }

    private void quicksort(int end, int begin, int []list) //added int []list to specify list array
    {
        int temp;
        int pivot = findPivotLocation(begin, end);
        
        // swap list[pivot] and list[end]
        temp = list[pivot];
        list[pivot] = list[end];
        list[end] = temp;
        
        pivot = end;
        
        int i = begin,
            j = end - 1;

        boolean iterationCompleted = false;
        while (!iterationCompleted)
        {
            while (list[i] < list[pivot])
                i++;
            while ((j >= 0) && (list[pivot] < list[j]))
                j--;
            if (i < j)
            {
                //swap list[i] and list[j]
                temp = list[i];
                list[i] = list[j];
                list[j] = temp;
                
                i++;
                j--;
            }else{
                iterationCompleted = true;
            }
            
            //swap list[i] and list[pivot]
            temp = list[i];
            list[i] = list[pivot];
            list[pivot] = temp;

            if (begin < i - 1) quicksort(begin, i - 1, list); //added list
            if (i + 1 < end) quicksort(i + 1, end, list); //added list
        }
    }
    
    /*
     * Computes the pivot
     */
    private int findPivotLocation(int b, int e)
    {
        return (b + e) / 2;
    }

    //selection sort based off week 6 slide 16 and prog19_01 done in class
    public static void selectionSort(int []list)
    {
        for (int i = 0; i < list.length-1; i++)
        {
            int minimum = i;
            for (int j = i+1; j < list.length; j++)
                if (list[j] < list[minimum])
                    minimum = j;
                    int temp = list[minimum];
                    list[minimum] = list[i];
                    list[i] = temp;
        }
    }

    //fillarray from prog19_01 java file sorting Algrithms
    public static void fillArray(int []list)
    {
        Random rnd = new Random();
        for(int i = 0; i < list.length; i++)
        {
            list[i] = rnd.nextInt(100);
        }
    }

    //printarray from prog19_01 java file sorting Algrithms
    public static void printArray(int []list)
    {
        for (int i = 0; i < list.length; ++i)
            System.out.print(list[i] + " ");
            System.out.println();
    }
}