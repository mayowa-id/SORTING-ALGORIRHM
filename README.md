# SORTING-ALGORIRHMS

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
