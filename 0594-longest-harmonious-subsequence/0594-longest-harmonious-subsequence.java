class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans = 0;
        for(int i=0 ; i<n ; i++){
            int len = 0;
            for(int j=0 ; j<n ; j++){
             if((nums[j] == nums[i] + 1) || (nums[i] == nums[j] + 1)){
               len = j-i+1;
             }
            }
           ans = Math.max(ans , len);
        }
        return ans;
    }
}