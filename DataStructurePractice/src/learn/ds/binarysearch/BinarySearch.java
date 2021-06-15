package learn.ds.binarysearch;

public class BinarySearch {
	
	public int getBinarySearchValue(int arr[], int start, int end, int key){
		
		if(start>end){
			return -1;
		}
		int mid = (start+end)/2;
		
		if(arr[mid]==key){
			return mid;
		}else if(key<arr[mid-1]){
			return getBinarySearchValue(arr, start, mid-1, key);
		}else{
			return getBinarySearchValue(arr, mid+1, end, key);
		}
	}

}
