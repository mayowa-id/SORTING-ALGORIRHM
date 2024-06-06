package com.SortingAlgorithm;

import java.util.Arrays;

public class Main {
    public static void main (String [] args){
int [] myNumbers = {3,4,7,3,9,6,34,54,3,47,23,46,4,8,6,5,7658,45};
var sorter = new BubbleSortDemo();
sorter.bubbleSort(myNumbers);
        System.out.println(Arrays.toString(myNumbers));
    }
}
