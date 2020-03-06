package sorting;

public class MergeSort {
	private int[] numbers;
	private int[] temp;
	
    public void sort(int[] arr) {
        // check for empty or null array
        if (arr ==null || arr.length==0){
            return;
        }
        this.numbers = arr;
        this.temp = new int[arr.length];
        
        mergesort(0, arr.length - 1);
    }

    private void mergesort (int low, int high) {
    	
	    	if (low < high) {
	        int middle = low + (high - low)/2;
	        mergesort (low, middle);
	        mergesort (middle+1, high);
	        merge(low, middle, high);
	    	}
    }
    
    
	public void merge(int left, int middle, int right) {
		for (int i = left; i <= right; i++)
			temp[i] = numbers[i];
		
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

    
	private void merge2(int left, int middle, int right) {

		for (int i = left; i <= right; i++) {
			temp[i] = numbers[i];
		}

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
	}
    
    
    public static void main(String args[])
    {
    		MergeSort sorter = new MergeSort();
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
    
    private void exchange(int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}