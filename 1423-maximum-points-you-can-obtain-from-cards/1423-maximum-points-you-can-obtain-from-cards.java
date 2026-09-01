class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int upper = 0;
        int lower = 0;
        int sum =0;
        int maxsum = 0;
        for(int i=0 ; i<k ; i++){
          sum = sum + cardPoints[i];
        }
        maxsum = sum;
        upper = sum;
        int j = cardPoints.length - 1;

        for(int i = k-1 ; i>=0 ; i--){
            upper = upper - cardPoints[i];
            lower = lower + cardPoints[j];
            maxsum = Math.max(maxsum , (upper + lower));
            j--;
        }
        return maxsum;
    }
}