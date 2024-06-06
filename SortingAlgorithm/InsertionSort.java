package com.SortingAlgorithm;

public class InsertionSort {
    public void insertionSort(int[] arrayToBeSorted) {
        for (var i = 0; i < arrayToBeSorted.length; i++) {
            var current = arrayToBeSorted[i];
            var j = i - 1;
            while (j >= 0 && arrayToBeSorted[j] > current){
                arrayToBeSorted[j+1] = arrayToBeSorted[j];
                j--;
            }
            arrayToBeSorted[j+1] = current;
        }
    }
}
