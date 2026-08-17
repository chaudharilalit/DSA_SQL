class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        double discount = 0.0;
        int i = prices.length - 1;
        int j = discounts.length - 1;
        
        while(i >= 0 && j >= 0){
            discount = discount + ( (double)( prices[i] ) * (double)(100 - discounts[j] ) / 100);
            i--;
            j--;
        }
        if(prices.length > discounts.length){
            int rem = prices.length - discounts.length ;
            for(int k=0 ; k< rem ; k++){
                discount = discount + prices[k];
            }
        }
      return discount;
    }
}