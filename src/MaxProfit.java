
public class MaxProfit {

	
	public static void main (String[] arg)
	{
		int[] stockPricesYesterday = {11, 4, 3, 3, 2, 1, 15};
		MaxProfit getPrice = new MaxProfit();
		System.out.println(getPrice.getMaxProfit(stockPricesYesterday));
	}
	
	
	public int getMaxProfit(int[] stockPrices) {
		int maxProfit = 0;
		int minPrice = stockPrices[0];
		
		for (int i=1; i< stockPrices.length; i++)
		{
			
			if ( minPrice > stockPrices[i])
			{
				minPrice = stockPrices[i];
			}
			else
				maxProfit = Math.max(maxProfit, stockPrices[i] - minPrice);
		}
		
		return maxProfit;
	}
		  
		  
		  
}
