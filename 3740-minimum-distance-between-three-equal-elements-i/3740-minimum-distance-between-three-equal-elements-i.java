class Solution {
    public int minimumDistance(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        for(int i=0 ; i<n ; i++){
            for(int j=i+1 ; j<n ; j++ ){
                for(int k=j+1 ; k < n ; k++){
              if(i == j && j == k){
                 break;
              }
              if(nums[i] == nums[j] && nums[j] == nums[k]){
                int dis1 = Math.abs(i-j);
                int dis2 = Math.abs(j-k);
                int dis3 = Math.abs(k - i);
                min = Math.min(min , dis1 + dis2 + dis3);
              }
                }

            }
        }
        if(min == Integer.MAX_VALUE) return -1;
        return min;
    }
}