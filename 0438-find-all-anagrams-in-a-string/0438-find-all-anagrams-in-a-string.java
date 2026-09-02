class Solution {
    public List<Integer> findAnagrams(String s, String p) {
       int k = p.length(); 
       int arr[] = new int[26];
       for(int i=0 ; i<p.length() ; i++) {
        arr[p.charAt(i) - 'a']++;
       }

       ArrayList<Integer>list = new ArrayList<>();
       int right = 0; 
       int left = 0;
       int hash[] = new int[26];
       while(left <= s.length()-k ){
        boolean flag = true;
          hash[s.charAt(right) - 'a']++;
           if((right-left+1) == k){
          
            for(int i=0 ; i<26 ; i++){
            if(hash[i] != arr[i]){
             flag = false;
            }
            }
               if(flag == true) list.add(left);
               hash[s.charAt(left) - 'a']--;
               left++;
           }
        
           right++;
    
       }
    //    boolean flag = true;
    //     for(int i=0 ; i<26 ; i++){
    //         if(hash[i] != arr[i]){
    //          flag = false;
    //         }
    //         }
    //            if(flag == true) list.add(left);
       
       return list;
    }
}