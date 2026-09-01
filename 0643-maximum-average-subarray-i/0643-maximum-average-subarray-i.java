class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0;
        int right = 0;
        double mavg = 0;
        double sum = 0;
        while(right < k ){
        sum = sum + nums[right];
         right++;
        }

        mavg = sum / k ;
    while(right < nums.length){
        sum = sum + nums[right];
        sum = sum - nums[left];

        mavg = Math.max(mavg , (sum / k));
        left++;
        right++;
    }
      return mavg;
    }
}