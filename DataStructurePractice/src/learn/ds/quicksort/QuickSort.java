package learn.ds.quicksort;

public class QuickSort {

	public void sortingByQuickSort(int[] arr, int start, int end){
		if(start<end){
		int pv=partition(arr, start, end);
		sortingByQuickSort(arr, start, pv-1);
		sortingByQuickSort(arr, pv+1, end);
		}
	}

	private int partition(int[] arr, int start, int end) {

		int pivot=arr[end];
		int i=start-1;
		for(int j=start; j<=end-1; j++){
			if(arr[j]<=pivot){
				i++;
				int i_temp  = arr[i];
				int j_temp = arr[j];
				arr[i]=j_temp;
				arr[j]=i_temp;
			}
		}
		int i_temp= arr[i+1];
		arr[end]=i_temp;
		arr[i+1]=pivot;
		return i+1;
	}
}
