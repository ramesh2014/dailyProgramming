import java.util.HashMap;
import java.util.Map;

public class BuyAndSellStockWithCoolDown {

	int priceLength;
	
	private int maxProfit(int[] prices) {
		
		priceLength = prices.length;
		
		System.out.println("buy(prices,0)");
		return buy(prices, 0);
	
	}
	
	Map<Integer, Integer> buyMap = new HashMap();
	
	private int buy(int[] prices, int i) {
		
		if(i >= priceLength) {
			System.out.println("buy: return 0");
			return 0;
		}
		
		if(buyMap.containsKey(i)) {
			System.out.println("buyMap.get("+i+")");
			return buyMap.get(i);
		}
		
		buyMap.put(i, Math.max(-prices[i] + sell(prices, i+1), buy(prices, i+1)));
		System.out.println("buyMap.put("+i+","+"Math.max("+(-prices[i])+" + sell("+"prices" +", "+ (i+1) +"), buy("+ "prices" +", "+ (i+1) +")))");
		System.out.println("buyMap.get("+i+")");
		return buyMap.get(i);
	}
	
	Map<Integer, Integer> sellMap = new HashMap();
	private int sell(int[] prices, int i) {
		
		if(i >= priceLength) {
			System.out.println("sell: return 0");
			return 0;
		}
		
		if(sellMap.containsKey(i)) {
			System.out.println("sellMap.get("+i+")");
			return sellMap.get(i);
		}
		
		sellMap.put(i, Math.max(prices[i] + buy(prices, i+2), sell(prices, i+1)));
		System.out.println("sellMap.put("+i+","+"Math.max("+(prices[i])+" + buy("+"prices" +", "+ (i+2) +"), sell("+ "prices" +", "+ (i+1) +")))");
		System.out.println("sellMap.get("+i+")");
		return sellMap.get(i);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BuyAndSellStockWithCoolDown buySellClass = new BuyAndSellStockWithCoolDown();
		
		int[] iPrices = {1,2,3,0,2}; 
		
		System.out.println("buySellClass.maxProfit(iPrices)");
		
		int iMaxProfit =  buySellClass.maxProfit(iPrices);
		
		System.out.println("Max Profit: "+ iMaxProfit);
	}
	
}
