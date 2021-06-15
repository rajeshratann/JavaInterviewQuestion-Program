package learn.ds.insertionsort;

public class InsertionSort {
	
	public int [] insertionSortArray(int []arr){
		
		for(int i=1; i<arr.length;i++){
			int index = arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>index){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1]=index;
		}
		return arr;
		
	}

}
