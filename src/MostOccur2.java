import java.util.HashMap;
import java.util.Map;

public class MostOccur2 {

	public static void main(String args[]) {
		int[] arr = { 1, 4, 5, 6, 7, 8, 1, 6, 7, 2, 5, 7, 4 };
		int tempmax = 0;
		int max = 0;
		int count = 0;
		int max_coour = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[j] == arr[i])
					count++;
			}
			tempmax = count;
			if (tempmax > max) {
				max = tempmax;
				max_coour = arr[i];
			}
			count = 0;
		}

		System.out.print(max_coour);

	}

}