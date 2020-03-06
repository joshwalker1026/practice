
public class Practice  {
	private int[] numbers;

    public void sort(int[] arr) {
        // check for empty or null array
        if (arr ==null || arr.length==0){
            return;
        }
        this.numbers = arr;
        quicksort(0, arr.length - 1);
    }

	private void quicksort2(int low, int high) {
		int i = low, j = high;
		int pivot = numbers[(low + high) / 2];

		// Divide into two lists
		while (i <= j) {
			while (numbers[i] < pivot)
				i++;

			while (numbers[j] > pivot)
				j--;

			if (i <= j) {
				exchange(i, j);
				i++;
				j--;
			}
		}
		// Recursion
		if (low < j)
			quicksort2(low, j);
		if (i < high)
			quicksort2(i, high);
	}

	public void quicksort(int left, int right) {
		printarray(numbers);
		int i = left, j = right;
		int pivot = numbers[(i + (j - i) / 2)];
		while (i <= j) {
			while (numbers[i] < pivot)
				i++;
			while (numbers[j] > pivot)
				j--;
			if (i <= j) {
				exchange(i, j);
				i++;
				j--;
			}
		}
		if (i < right)
			quicksort(i, right);

		if (left < j)
			quicksort(left, j);
	}


    private void exchange(int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
    
    
    public static void main(String args[])
    {
    	Practice sorter = new Practice();
        //int [] arr={4,23,14,1,5};
        int [] arr={4,23,14,1,5};
        
        sorter.sort(arr);
        printarray(arr);
    }
    
    public static void printarray(int[] arr)
    {
        System.out.println("array:");
        for (int i=0;i < arr.length; i++)
            System.out.print(arr[i]+ ", ");
        System.out.println();
    }
    
}


