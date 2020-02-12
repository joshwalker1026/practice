
public class ProductArray {

	
	public static void main (String[] arg)
	{
		int[] arrayOfInts = {11, -4, 3, -3, 2, 8, 1};
		System.out.println(getProduct(arrayOfInts));
	}
	
	
	public static int getProduct(int[] arrayOfInts) {
		int max = Math.max(arrayOfInts[0], arrayOfInts[1]);;
		int maxProductOf2 = arrayOfInts[0]*arrayOfInts[1];
		int maxProductOf3 = arrayOfInts[0]*arrayOfInts[1]*arrayOfInts[2];
		int minProductOf2 = arrayOfInts[0]*arrayOfInts[1];
		int min = Math.min(arrayOfInts[0], arrayOfInts[1]);
		
		for (int i=2; i< arrayOfInts.length;i++)
		{	
			maxProductOf3 = Math.max(Math.max(arrayOfInts[i]*maxProductOf2, arrayOfInts[i]*minProductOf2), maxProductOf3);
			maxProductOf2 = Math.max(max*arrayOfInts[i], maxProductOf2);
			minProductOf2 = Math.min(min*arrayOfInts[i], minProductOf2);
			
			min = Math.min(min, arrayOfInts[i]);
			max = Math.max(max, arrayOfInts[i]);
		}
		
		return maxProductOf3;
	}
		  
		  
		  
}
