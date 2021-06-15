package learn.ds.selectionsort;

public class SelectionSort {
	
	public int[] getValueBySelecitonSort(int arr[]){
		
		for(int i=0; i<arr.length; i++){
			int minimum =i;
			
			for(int j=i+1;j< arr.length; j++ ){
				if(arr[j]<= arr[minimum]){
					minimum =j;
				}
			}
			int temp= arr[i];
			arr[i] = arr[minimum];
			arr[minimum] = temp;
		}
		return arr;
	}

}
