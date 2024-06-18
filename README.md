# SORTING-ALGORITHMS

  Essentially, the use of a sorting algorithm is to arrange a given array or list of elements into 
a certain order, Ascending or Descending as preferred. This codebase consists of the implementation of various sorting algorithms such as Bubble sort, Merge sort, Insertion sort etc.

Sorting algorithms are fundamental to computer science, serving as essential tools for organizing data. This readme provides an overview of various sorting algorithms, including their time complexity, space complexity, and general characteristics.
 Understanding these algorithms is crucial for writing efficient code and optimizing performance in a variety of applications.

1. Bubble Sort
This is a simple comparison-based algorithm where each pair of adjacent elements is compared, and the elements are swapped if they are in the wrong order. This process repeats until the list is sorted.

Time Complexity:
-Worst-case: O(n²)
-Average-case: O(n²)
-Best-case (for when the list is already sorted): O(n) 

Space Complexity:
O(1)

Characteristics:
-In-place sorting can beimolemented with bubble sort
- It is relatively stable
-It is rlatively easy to implement but inefficient for large datasets

2. Selection Sort
Selection Sort divides the list into two parts, the implementation in this codebase uses an array so it is divide into two sub arrays: a sorted array and an unsorted array. The algorithm recursively selects the smallest (or largest) element from the unsorted part and moves it to the sorted part.

Time Complexity:
-Worst-case: O(n²)
-Average-case: O(n²)
-Best-case: O(n²)

Space Complexity:
O(1)

Characteristics:
-In-place sorting can be implemented here as well
-Selecttion sort is knownn to be relatively unstable
-It is simple to implement but not so efficient for large datasets

3. Insertion Sort
Insertion Sort builds the sorted array one item at a time by repeatedly taking the next element and inserting it into the correct position among the already sorted elements.

Time Complexity:
-Worst-case: O(n²)
-Average-case: O(n²)
-Best-case (for when the list is already sorted): O(n) 

Space Complexity:
O(1)

Characteristics:
-You can also implement in-place sorting here
-Insertion sort is relatively stable
-Thus algorithm is efficient for small or nearly sorted datasets

4. Merge Sort
Merge Sort is known to be a divide-and-conquer algorithm that divides the list into two halves, recursively sorts them, and then merges the sorted halves to produce the final sorted list.

Time Complexity:
-Worst-case: O(n log n)
-Average-case: O(n log n)
-Best-case: O(n log n)

Space Complexity:
O(n)

Characteristics:
-Sorting doesn't occcur ib place, hence it requires extra space 
-It is stable
-It is quite efficient for large datasets

5.Quick Sort 
Quick sort also uses divide-and-conquer strategy, just like in Merge Sort. It selects an element as a pivot and partitions the array around it. 
It moves all the elements less than pivot to its left and all the elements greater than it to the right, then recursively sorts the subarrays.

Time Complexity: 
-Worst-case:  O(n²) (rare, can be mitigated with good pivot selection)
-Average-case: O(n log n)
-Best-case: O(n log n)

Space complexity: 
O(log n)

Characteristics: 
- It is an in-place  so it requires less space
- It is r3lativelty not stable
- Very efficient in practice, especially with good pivot selection

6. Counting Sort
Counting Sort is an algorithm suitable for sorting integers, it doesn't make use of comparison to sort integers. It counts the occurrences of each value, uses this information to determine the position of each value in the output array, and assembles the sorted array. 
Time Complexity:
Worst-case: O(n + k) (where k is the range of the input), Essentially, still O(n)

Space complexity: 
O(n)

Characteristics:
- It is a not in-place algprithm so it requires extra space
- It is relatively Stable
-Efficient for small range of integers, not suitable for large ranges or non-integer data

7, Bucket Sort 
Bucket Sort distributes elements into several buckets, sorts each bucket individually (using another sorting algorithm or recursively), and then concatenates the sorted buckets.

Time Complexity: 
- Worst-case: O(n²) (rare, depends on the distribution of elements)
- Average-case: O(n + k); k= range of input, so essentially it's O(n)
- Best-case: O(n + k)

Space Complexity:
O(n + k)

Characteristics: 
- It is a not in-place algorithm so it requires extra space.
-It is relatively Stable
- Efficient for uniformly distributed data


CONCLUSION

Choosing the right sorting algorithm depends on the specific requirements of your application, including the size of the dataset, the range of the data, and whether the data is already partially sorted. Understanding these can help you make informed decisions to optimize the performance of your code.
