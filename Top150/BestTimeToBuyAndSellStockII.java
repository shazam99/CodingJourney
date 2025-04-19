package Top150;

public class BestTimeToBuyAndSellStockII {
    // 122. Best Time to Buy and Sell Stock II
    public static void main(String[] args) {
        int[] prices = new int[]{1,2,3,4,5};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int minStock = prices[0];
        int maxPro = 0;
        // here don't do brains
        // simply add profit for each day.
        // sum all profits
        for(int stock: prices){
            minStock = Math.min(minStock, stock);
            int currentPro = stock-minStock;
            if (currentPro > 0){
                maxPro+=currentPro;
                minStock = stock;
            }
        }

       return maxPro;
    }
}