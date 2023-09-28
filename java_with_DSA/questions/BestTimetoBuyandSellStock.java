package questions;

public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {
        int[] arr = { 7, 1, 5, 3, 6, 4 };
        System.out.println(maxProduct4(arr));
    }

    public static int maxProfit(int[] prices) {
        int ans = 0;
        for (int i = 0; i < prices.length ; i++) {
            int max = Integer.MIN_VALUE;
            int profet = 0;
            for (int j = i + 1; j < prices.length; j++) {

                if (prices[i] < prices[j]) {
                    max = prices[j];

                }

            }
            System.out.println(max);
            // if (max > prices[i]) {
            //     profet = max - prices[i];
            // }
            // if (ans < profet) {

            //     ans = profet;
            //     profet=0;
            // }

        }
        return ans;


    }
    public static int maxProduct4(int [] prices){
        int least=Integer.MAX_VALUE;
        int profit=0;
        int maxprofit=0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i]<least) {
                least=prices[i];
                
            }
            profit=prices[i]-least;
            if (maxprofit<profit) {
                maxprofit=profit;
                
            }
        }
        return maxprofit;
    }
    public static  int maxProfit3(int []prices){
        int min=Integer.MAX_VALUE;
        int op=0;
        int pist = 0;

        for (int i = 0; i < prices.length; i++) {
            if(prices[i]<min)min=prices[i] ;
            pist=prices[i]-min;
            if(op<pist){
                op=pist;
            }
            
        }
        return op;
    }
     public int maxProfit2(int[] prices) {
        int lsf = Integer.MAX_VALUE;
        int op = 0;
        int pist = 0;
        
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < lsf){
                lsf = prices[i];
            }
            pist = prices[i] - lsf;
            if(op < pist){
                op = pist;
            }
        }
        return op;
    }

}
