class Solution {
    public int minimumOperations(int[] nums) {
      int right = nums.length - 1;
      HashMap<Integer,Integer>map = new HashMap<>();
     while(right >= 0){
       if(map.containsKey(nums[right])) break;
       else{
        map.put(nums[right] , map.getOrDefault(nums[right] , 0) + 1);
        right--;
       }
      }
      right++;
      if(right == 0) return 0;
      else if(right % 3 == 0) return right/3;
      else return (right/3)+1;

    }
}