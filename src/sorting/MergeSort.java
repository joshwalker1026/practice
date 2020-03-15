package sorting;

import java.util.Arrays;

public class MergeSort {
	private static int[] numbers;
	private static int[] temp;

    public static int[] sort(int[] arr) {
        // check for empty or null array
        if (arr ==null || arr.length==0)
            return arr;

		numbers=arr;
		mergesort(0, arr.length - 1);
		return numbers;
    }

    private static void mergesort(int low, int high) {
    	
	    	if (low < high) {
	          int middle = low + (high - low)/2;
	          mergesort (low, middle);
	          mergesort (middle+1, high);
	          merge(low, middle, high);
	    	}
    }
    
    
	public static void merge(int left, int middle, int right) {
		temp = Arrays.copyOf(numbers, numbers.length);
		
		int index = left;
		int i = left;
		int j = middle + 1;

		while (i <= middle && j <= right) {
			if (temp[i] <= temp[j]) {
				numbers[index] = temp[i];
				i++;
			} else {
				numbers[index] = temp[j];
				j++;
			}
			index++;
		}
		while (i <= middle) {
			numbers[index++] = temp[i++];
		}
		while (j <= right) {
			numbers[index++] = temp[j++];
		}
	}
    
    public static void main(String args[])
    {
        int [] arr={4,23,14,1,5};
		MergeSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}