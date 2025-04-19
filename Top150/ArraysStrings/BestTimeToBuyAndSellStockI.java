package Top150.ArraysStrings;

public class BestTimeToBuyAndSellStockI {
    // 121. Best Time to Buy and Sell Stock I
    public static void main(String[] args) {
        int[] prices = new int[]{7,1,5,3,6,4,1,8,4,0,9};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {

        int maxProfit = 0;
        int minStock = prices[0];

        for(int stock: prices){
            minStock = Math.min(minStock, stock); // track min stock
            int currentProfit = stock - minStock; // minus from currStock
            maxProfit = Math.max(maxProfit, currentProfit); // max profit bw curr and min stock
        }
        return maxProfit;
    }
}

