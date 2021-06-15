package learn.ds.linearsearch;

public class LinearSearch {

	public int getLinearSearchValue(int arr[], int key){
		int index=-1;
		for(int i=0; i<arr.length; i++){
			if(key == arr[i]){
				index = i;
				return index;
			}
		}
		
		return index;
	}
	
	public int getLinearSearchUsingRecursion(int arr[],int first, int last,  int key){
	
		if(first > last){
			return -1;
		}
		if(arr[first]==key){
			return first;
		}
		if(arr[last]==key){
			return last;
		}
		return getLinearSearchUsingRecursion(arr, first+1, last-1, key);
		
	}
}
