
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 5, 6, 9, 10, 12, 14, 16, 20};
		int ans = binarySearch(arr, 0, 9, 2);
		if(ans == -1){
			System.out.println("Key not found.");
		}else
			System.out.println("Key found at position: "+ (ans));
	}
	
	public static int binarySearch(int[] array, int start, int end, int key){
		if(start > end){
			return -1;
		}
		int mid = (start + end)/2;
		
		if(array[mid] == key){
			return mid;
		}
		else if(array[mid] > key){
			return binarySearch(array, start, mid-1, key);
			
		}
		else {
			return binarySearch(array, mid+1, end, key);
		}
		
	}

}
