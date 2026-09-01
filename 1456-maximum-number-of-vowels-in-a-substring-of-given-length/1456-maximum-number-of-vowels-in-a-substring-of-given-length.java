class Solution {
    public int maxVowels(String s, int k) {
        int left = 0;
        int right = 0;
        int max = 0;
        int count =0 ;
        while(right  < k){
            if((s.charAt(right) == 'a') || (s.charAt(right ) == 'e') || (s.charAt(right) == 'i') || (s.charAt(right ) == 'o') || (s.charAt(right) == 'u')){
                count++;
            }
            right++;
        }
        max = count;

        while(right < s.length() ){

            if((s.charAt(right) == 'a') || (s.charAt(right ) == 'e') || (s.charAt(right) == 'i') || (s.charAt(right ) == 'o') || (s.charAt(right) == 'u')){
                count++;
            }

             if((s.charAt(left) == 'a') || (s.charAt(left) == 'e') || (s.charAt(left) == 'i') || (s.charAt(left) == 'o') || (s.charAt(left) == 'u')){
                count--;
            }

            left++;
            right++;

            max = Math.max(count , max);
        }
        return max;
    }
}