package com.SortingAlgorithm;

public class MergeSort {
    public void mergeSort(int [] arrayToBeSorted){
        //Base condition for recursion
        if (arrayToBeSorted.length < 2)
            return;

        //Divide array into two and insert into the respective sub arrays
        var middle = (arrayToBeSorted.length)/2;

        var leftArray = new int[middle];
        for (var i=0; i< middle; i++)
            leftArray[i] = arrayToBeSorted[i];

        var rightArray = new int[arrayToBeSorted.length - middle];
        for (var i = middle; i < arrayToBeSorted.length; i++)
            rightArray[i -middle] = arrayToBeSorted[i];

        mergeSort(leftArray);
        mergeSort(rightArray);
merge(leftArray, rightArray, arrayToBeSorted);
    }
    private void merge(int[] left, int[] right, int[] result){
        int i =0, j=0, k=0;
        while(i< left.length && j< right.length){
            if (left[i] <= right[j])
                result[k++] = left[i++];
            else
                result[k++] = right[j++];
        }
        while (i< left.length)
            result[k++] = left[i++];
        while (j< right.length)
            result[k++] = right[j++];

    }
}
