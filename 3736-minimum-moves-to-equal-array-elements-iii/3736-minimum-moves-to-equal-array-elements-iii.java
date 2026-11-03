class Solution {
    public int minMoves(int[] nums) {
        int max = Integer.MIN_VALUE;
        int count = 0;
        for(int i=0 ; i< nums.length ; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i] == max) continue;
            else if(nums[i] < max){
                int ans = max - nums[i];
                count = count + ans;
            }
        }
        return count;
    }
}