package Sorting;
public class BubbleSort {
	/**
	 * bubbleSort				sorts an array of integers using bubble sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] bubbleSort(int[] unsortedArray) {
    boolean changed = false;
    do {
      changed = false;
      for (int a = 0; a < unsortedArray.length - 1; a++) {
        if (unsortedArray[a] > unsortedArray[a + 1]) {
          int tmp = unsortedArray[a];
          unsortedArray[a] = unsortedArray[a + 1];
          unsortedArray[a + 1] = tmp;
          changed = true;
        }
      }
    } while (changed);
    return unsortedArray;
	}
}
