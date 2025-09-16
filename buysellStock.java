 class buysellStock {

    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int MaxProfit = 0;
        for(int i=0; i<prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }
            else{
                int profit = prices[i] - min;
                if(profit> MaxProfit){
                    MaxProfit = profit;
                }
            }
        }
        return MaxProfit;
    }
    public static void main(String[] args) {
        int[] prices ={7,1,5,3,6,4};
        // System.out.println(maxProfit(prices));
        System.out.println(maxProfit(prices));
    }
    
}
