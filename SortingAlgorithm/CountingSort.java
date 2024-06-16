package com.SortingAlgorithm;

public class CountingSort {
    public void countingSprt(int [] array, int maxValue){

        int [] counts = new int[maxValue+1];
        for (var item : array)
            counts[item]++;

        var k=0;
        for(var i=0; i< counts.length; i++)
            for (var j=0; j< counts[i]; j++)
                array[k++]= i;
    }
}
