package learn.ds.test;

import java.util.Arrays;

import learn.ds.binarysearch.BinarySearch;
import learn.ds.insertionsort.InsertionSort;
import learn.ds.linearsearch.LinearSearch;
import learn.ds.mergesort.MergeSort;
import learn.ds.quicksort.QuickSort;
import learn.ds.selectionsort.SelectionSort;

public class AppTest {

	public static void main(String[] args) {
		int arr[] = {4,6,2,9,7,5};
		int out[] = Arrays.copyOf(arr, arr.length);
		int last=arr.length-1;
		int key= 9;
		int index = 0;
		int end=arr.length-1;
//    Start: - selection sort example
//		SelectionSort sort = new SelectionSort();
//		InsertionSort sort = new InsertionSort();
//		sort.getValueBySelecitonSort(arr);
//		sort.insertionSortArray(arr);
//		MergeSort sort = new MergeSort();
		QuickSort sort = new QuickSort();
		sort.sortingByQuickSort(arr, 0, end);
		
		for(int i=0; i<arr.length; i++)
		System.out.print(arr[i]+",");
		System.out.println();
//	  End :- Selection Sort Example.
		
//	  Start: - LinearSearch example
		LinearSearch linearSearch= new LinearSearch();
		index = linearSearch.getLinearSearchValue(arr, key);
		System.out.println("The Key: "+key+" LinearSearch index: "+index);
		System.out.println();
	    index= linearSearch.getLinearSearchUsingRecursion(arr, 0, last, key);
	    System.out.println("The Key: "+key+" LinearSearch using Recursion index: "+index);
	    System.out.println();
//	  End :- LinearSearch Example.
	    
//	  Start: - BinarySearch Example.
	    BinarySearch binarySearch= new BinarySearch();
	    index = binarySearch.getBinarySearchValue(arr, 0, last, key);
	    System.out.println("The Key: "+key+" BinarySearch using Recursion index: "+index);
	    System.out.println();
	}

}
