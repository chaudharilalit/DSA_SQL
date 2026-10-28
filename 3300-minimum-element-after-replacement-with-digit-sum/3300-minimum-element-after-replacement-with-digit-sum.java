class Solution {
    public int minElement(int[] nums) {
        int arr[] = new int[nums.length];
        int min = Integer.MAX_VALUE;
        for(int i=0 ; i<nums.length ; i++){
            int num = nums[i];
            int sum = 0;
            while(num > 0){
                int ld = num % 10;
                sum = sum + ld;
                num = num / 10;
            }
            arr[i] = sum;
            min = Math.min(sum , min);
        }
        return min;
    }
}