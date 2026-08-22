class Solution {
    public int maximumLengthSubstring(String s) {
       int maxlength = 0;
        for(int i=0 ; i<s.length() ; i++){
            int arr[] = new int[26];
            int length = 0;
            for(int j= i ; j<s.length() ; j++){
               char ch = s.charAt(j);
               arr[ch - 'a']++;
               if(arr[ch - 'a'] > 2){
                 break;
               }
               length = j-i+1;
                
            }

           maxlength = Math.max(length , maxlength );
           
        }
      return maxlength;
    }
}