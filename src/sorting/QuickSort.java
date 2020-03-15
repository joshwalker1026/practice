package sorting;

import java.util.Arrays;

public class QuickSort  {
    public void sort(int[] arr) {
        // check for empty or null array
        if (arr ==null || arr.length==0){
            return;
        }
        
        quicksort(arr, 0, arr.length - 1);
    }

	public static void quicksort(int[] arr, int left, int right) {
		int i = left, j = right;
		int pivot = arr[(i + (j - i) / 2)];
		while (i <= j) {
			while (arr[i] < pivot)
				i++;
			while (arr[j] > pivot)
				j--;
			if (i <= j) {
				exchange(arr, i, j);
				i++;
				j--;
			}
		}
		
		if (i < right)
			quicksort(arr, i, right);

		if (left < j)
			quicksort(arr, left, j);
			
	}

    private static void exchange(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String args[])
    {
        int [] arr={4,23,14,1,5};

        QuickSort.quicksort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}


