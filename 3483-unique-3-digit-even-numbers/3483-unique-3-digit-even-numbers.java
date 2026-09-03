class Solution {
    public int totalNumbers(int[] digits) {
        int arr[] = new int[10];
        int count= 0;

        for(int i=0 ; i<digits.length ; i++){
            arr[digits[i]]++;
        }
      
       for(int i=100 ; i <= 999 ; i+=2 ){
           int numarray[] = new int[10];
           boolean flag = true;
           int val = i;
           while(val > 0){
             int num = val % 10;
             numarray[num]++;
             val = val / 10;
           }
           for(int k=0 ; k < 10 ; k++){
            if(numarray[k] > arr[k]){
                flag = false;
            }
           }
           if(flag == true){
            count++;
           }
       }
       return count;
    }
}