package com.SortingAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {
    public void bucketSort(int [] array, int noOfBuckets) {
var buckets = createBuckets(array, noOfBuckets);
        var i = 0;
        for(var bucket : buckets){
            Collections.sort(bucket);
            for (var item : bucket)
                array[i++] = item;
        }
    }
    private List<List<Integer>> createBuckets(int[]array, int noOfBuckets){
        List<Integer> x = new ArrayList<>();
        List<List<Integer>> buckets = new ArrayList<>();
        for (var i =0; i< noOfBuckets; i++)
            buckets.add(new ArrayList<>());

        for (var item : array)
            buckets.get(item/noOfBuckets).add(item);

        return buckets;
    }

}
