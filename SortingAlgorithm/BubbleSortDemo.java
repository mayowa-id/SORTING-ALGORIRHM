package com.SortingAlgorithm;

public class BubbleSortDemo {
    public void bubbleSort(int[] arrayToBeSorted) {
        boolean isSorted = true;
        int i;
        for (i = 0; i < arrayToBeSorted.length; i++)
            isSorted = true;
        for (var j = 1; j < arrayToBeSorted.length - i; j++) {
            if (arrayToBeSorted[j] < arrayToBeSorted[j - 1]) {
                var temporary = arrayToBeSorted[j];
                arrayToBeSorted[j] = arrayToBeSorted[j - 1];
                arrayToBeSorted[j - 1] = temporary;
                isSorted = false;
            }
            if (isSorted)
                return;
        }
    }
}
