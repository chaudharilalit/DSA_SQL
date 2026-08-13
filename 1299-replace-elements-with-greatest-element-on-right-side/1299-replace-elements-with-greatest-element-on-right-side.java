class Solution {
    public int[] replaceElements(int[] arr) {
        int nums[] = new int[arr.length];
      for(int i=0 ; i< arr.length ; i++){
         int max  = -1;
         for(int j=i+1 ; j<arr.length ; j++){
           if(arr[j] > max){
              max = arr[j];
           }
         }
         nums[i] = max ;
      }
      return nums;
    }
}