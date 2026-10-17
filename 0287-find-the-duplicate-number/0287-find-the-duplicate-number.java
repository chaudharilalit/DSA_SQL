class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer>map  = new HashMap<>();
        for(int i=0 ; i<nums.length ; i++){
            map.put(nums[i],map.getOrDefault(nums[i] , 0)+ 1);
        }

      for(Map.Entry<Integer , Integer>it : map.entrySet()){
        int key = it.getKey();
        int value = it.getValue();

        if(value >= 2){
            return key;
        }
      }
      return -1;
    }
}