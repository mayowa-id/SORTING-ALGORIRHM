package com.SortingAlgorithm;

public class SelectionSort {
    public void selectionSort(int[] arrayToBeSorted) {
        for (var i = 0; i < arrayToBeSorted.length; i++) {
            var minimumIndex = i;
            for (var j = i; j < arrayToBeSorted.length; j++)
                if (arrayToBeSorted[j] < arrayToBeSorted[minimumIndex]) {
                    var temporary = arrayToBeSorted[j];
                    arrayToBeSorted[j] = arrayToBeSorted[j - 1];
                    arrayToBeSorted[j - 1] = temporary;
                }
        }
    }
}
