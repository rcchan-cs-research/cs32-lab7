package Sorting;

public class InsertionSort {
	/**
	 * insertionSort			sorts an array of integers using insertion sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] insertionSort(int[] unsortedArray) {
		//TODO: S2 implements insertion sort
		 for(int i = 1; i < A.length; i++){
    		int value = A[i];
    		int j = i - 1;
    		while(j >= 0 && A[j] > value){
      		A[j + 1] = A[j];
      		j = j - 1;
    }
    A[j + 1] = value;
  }
		return null;
	}
}
