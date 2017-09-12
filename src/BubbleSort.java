/* coded by aditya */

public class BubbleSort {
	public static void bubbleSort(int array[]){
		boolean isSorted = false;
		int lastUnsorted = array.length-1;
		while(!isSorted){
			for (int i= 0; i < lastUnsorted; i++){
				isSorted= true;
				if ( array[i]> array[i + 1]){
					swap(array,i,i+1);
					isSorted= false;
				}
			}
			lastUnsorted--;
		}
	}
	
	public static void swap( int array[], int i, int j){
		int temp= array[i];
		array[i]=array[j];
		array[j]= temp;
	}
	
	static void printArray(int array[])
    {
        int n = array.length;
        for (int i=0; i<n; ++i)
            System.out.print(array[i]+" ");
        System.out.println();
    }

	public static void main(String args[]){
		int array[] = {10,5, 11,77};
		BubbleSort bs = new BubbleSort();
		bs.bubbleSort(array);
		printArray(array);
		
	
	}	
	}