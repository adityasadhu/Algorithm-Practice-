
//QuickSort 
public class QuickSort {
	public static void quicksort(int[] array){
		quicksort(array, 0, array.length-1);
	}
	
	public static void quicksort(int[] array, int left, int right){
		if(left >=right){
			return;
		}
		int pivot= array[(left+right)/2];
		int index= partition(array, left, right, pivot);
		quicksort(array, left, index-1);
		quicksort(array, index, right);
		
	}
	
	public static int partition(int[] array, int left, int right, int pivot){
		while(left<=right){
			while(array[left]< pivot){
				left++;
			}
			
			while(array[right]>pivot){
				right--;
			}
			
			if(left<=right){
				int temp= array[left];
				array[left]= array[right];
				array[right]= temp;
				left++;
				right--;
			}
		}
		return left;
	}
	 static void printArray(int array[])
	    {
	        int n = array.length;
	        for (int i=0; i<n; ++i)
	            System.out.print(array[i]+" ");
	        System.out.println();
	    }
	public static void main (String args[]){
		int array[] = {10, 7, 5, 11, 9, 6, 1};
		int n= array.length;
		QuickSort ob = new QuickSort();
		ob.quicksort(array);
		printArray(array);
		
	}

}
