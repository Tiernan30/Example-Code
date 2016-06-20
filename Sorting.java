
public class Sorting {
	
	public static void insertionSort(int[] array){
		for(int i = 1; i < array.length; i++){
			int valueToSort = array[i];
			int j = i;
			while(j > 0 && array[j-1] > valueToSort){
				array[j] = array[j-1];
				j--;
			}
			array[j] = valueToSort;
			
		}
	}
	
	public static void selectionSort(int[] array){
		for (int i = 0; i < array.length -2; i++){
			int min = i;
			for(int j = i+1; j < array.length -1; j++){
				if(array[j] < array[min]){
					min = j;
				}
			}
			int tmp = array[i];
			array[i] = array[min];
			array[min] = tmp;
		}
		
	}
	
	public static void bubbleSort(int[] array){
		for(int i = 0; i <array.length -1; i++){
			for(int j = array.length -2; j >= i ;j--){
				if(array[j] > array[j+1]){
					int tmp = array[j];
					array[j] = array[j+1];
					array[j+1] = tmp;
				}
			}
		}
	}
	
	public static void main(String[] args){
		int[] a = {14, 33, 27, 10, 35, 19, 42, 44};
		
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + "\t");
		}
		System.out.println();
		
		//insertionSort(a);
		//selectionSort(a);
		bubbleSort(a);
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + "\t");
		}
		
		
	}

}
