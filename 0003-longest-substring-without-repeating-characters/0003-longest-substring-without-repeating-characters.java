class Solution {
    public int lengthOfLongestSubstring(String s) {
      HashMap<Character, Integer>map = new HashMap<>();
      int n = s.length();
      int left = 0;
      int right = 0;
      int maxlength = 0;
      while(right < n ){

          map.put(s.charAt(right) , map.getOrDefault(s.charAt(right) , 0)+ 1);

        while(map.get(s.charAt(right) ) > 1 ){
        map.put(s.charAt(left) , map.get(s.charAt(left)) - 1);
         left++;
        }
        
        if( map.get(s.charAt(right))== 1){
               maxlength = Math.max(maxlength , right - left + 1);
               right++;
        }
      }
      return maxlength;
    }
}