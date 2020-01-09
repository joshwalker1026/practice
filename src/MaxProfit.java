
public class MaxProfit {

	
	public static void main (String[] arg)
	{
		int[] stockPricesYesterday = {11, 4, 3, 3, 2, 1, 1};
		MaxProfit getPrice = new MaxProfit();
		System.out.println(getPrice.getMaxProfit(stockPricesYesterday));
	}
	
	
	public static int getMaxProfit(int[] stockPricesYesterday) {
		int maxProfit = 0;
		int minPrice = stockPricesYesterday[0];
		int CurrentPrice = 0;
		
		for (int i=1; i< stockPricesYesterday.length;i++)
		{
			
			if (	minPrice > stockPricesYesterday[i])
			{
				minPrice = stockPricesYesterday[i];
			}
			else
			{
				if (	maxProfit < stockPricesYesterday[i]-minPrice)
					{
					maxProfit = stockPricesYesterday[i]-minPrice;
					}
			}
			
		}
		
		return maxProfit;
	}
		  
		  
		  
}
