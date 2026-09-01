class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int mini = -1;
        int maxi = -1;
        for(int i=0 ; i< n ; i++){
            if(nums[i] > max){
                max = nums[i];
                maxi = i;
            }
        }
         for(int i=0 ; i< n ; i++){
            if(nums[i] < min){
                min = nums[i];
                mini = i;
            }
        }
       if(mini > maxi){
        int temp = mini ;
        mini = maxi;
        maxi = temp;
       }
       // left shrink
      int leftmax = maxi + 1;

      //right shrink 
      int rightmax = n-mini;

      // both side shrink

      int bothmax = (mini+1) + (n-maxi) ;

      return Math.min(leftmax , Math.min(rightmax , bothmax));
    }
}