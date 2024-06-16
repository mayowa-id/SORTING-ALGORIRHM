package com.SortingAlgorithm;

public class QuickSort {
    public void quickSort(int [] array){
        quickSort(array, 0, array.length -1);
    }

    private void quickSort(int [] array,int start , int end){
        //base condition
        if (start >= end)
            return;

        var boundary = partition(array, start, end);

        quickSort(array, start, boundary -1);
        quickSort(array, boundary+1 , end);
    }
    private int partition (int [] array, int start, int end){
        var pivot = array[array.length-1];
        var boundary = start-1;
        for (var i=start; i< end; i++)
            if(array[i] <= pivot){
                boundary++;
                //then swap
                var temp = array[i];
                array[i] = array[boundary];
                array[boundary] = temp;

            }
        return  boundary;
    }

}
