class Solution {
    public List<Integer> findAnagrams(String s, String p) {
       int k = p.length(); 
       int arr[] = new int[26];
        ArrayList<Integer>list = new ArrayList<>();
        if (p.length() > s.length()) {
            return list;
        }
       for(int i=0 ; i<p.length() ; i++) {
        arr[p.charAt(i) - 'a']++;
       }

     
       int right = 0; 
       int left = 0;
       int hash[] = new int[26];
      while(right < k){
        hash[s.charAt(right) - 'a']++;
        right++;
      }
       boolean flag = true;
        for(int i=0 ; i<26 ; i++){
        if(hash[i] != arr[i]){
            flag = false;
        }
       }
      if( flag == true )list.add(left);


      while(right < s.length()){
        hash[s.charAt(left) - 'a']--;
        hash[s.charAt(right)- 'a']++;
        
        left++;
        right++;

     flag = true;
      for(int i=0 ; i<26 ; i++){
        if(hash[i] != arr[i]){
            flag = false;
        }
      }
      
      if(flag == true)list.add(left);

      }
       return list;
    }
}