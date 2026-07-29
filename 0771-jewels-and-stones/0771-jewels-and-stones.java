class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int[] arr1 = new int[256];
        int[] arr2 = new int[256];
        
        for(int i=0 ; i<jewels.length() ; i++){
          arr1[jewels.charAt(i)] = 1;
        }

        for(int i=0 ; i<stones.length() ; i++){
          arr2[stones.charAt(i)]++;
        }
         int count = 0;
        
        for(int i=0 ; i<arr1.length ; i++){
            if(arr1[i] == 1 ){
                count = count + arr2[i];
            }
        }
      return count;
    }
}