package learn.ds.mergesort;

public class MergeSort {
	
	public void getMergeSortValue(int arr[], int[] out, int start, int end){
		
		if(start == end){
			return;
		}
		int mid=(start+end)/2;
		
		getMergeSortValue(arr, out, start, mid);
		getMergeSortValue(arr, out, mid+1, end);
		mergeData(arr, out, start, mid, end );
		
	}

	private void mergeData(int[] arr, int[] out, int start, int mid, int end) {
        
		int k=start; int i=start; int j=mid+1;
		
		while(i<=mid && j<=end){
			if(arr[i]<arr[j] ){
				out[k++]= arr[i++];
			}else{
				out[k++]= arr[j++];
			}
		}
		
		while(i<=mid){
			out[k++] = arr[i++];
		}
		while(j<=end){
			out[k++] = arr[j++];
		}
		for(i = start; i<= end; i++){
        	arr[i]=out[i];		
		}
		
	}

}
