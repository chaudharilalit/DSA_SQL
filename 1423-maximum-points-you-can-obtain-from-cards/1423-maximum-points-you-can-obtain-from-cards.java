class Solution {
    public int maxScore(int[] cardPoints, int k) {
      int n = cardPoints.length;
      int sum =0 ;
      for(int i=0 ; i<k ; i++){
       sum = sum + cardPoints[i];
      }
      int maxsum = sum;

      
      int right = n-1;
      for(int left = k-1 ; left>=0 ; left--){
       sum = sum - cardPoints[left];
       sum = sum + cardPoints[right];
       maxsum = Math.max(sum , maxsum);
       right--;

      }
       return maxsum;
    }
}