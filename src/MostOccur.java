import java.util.HashMap;
import java.util.Map;

public class MostOccur {

	public static void main(String args[]) {
		int [] arr = {1, 4, 5, 6, 7, 8, 1, 6, 7, 2, 5, 7, 4};
		Map <Integer, Integer> occur = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			Integer a = arr[i];
			if (occur.get(a) == null)
			{
				occur.put(a, 1);
			}
			else
				occur.put(a, occur.get(a)+1);
		}

		int most = 0;
		int max = 0;
		int tempmax = 0;
		for (Integer key : occur.keySet()) {
		   tempmax = occur.get(key);
		   if (tempmax > max)
		   {
			   max = tempmax;
			   most = key;
		   }
		}
		
		System.out.print(most);
		
	}

}