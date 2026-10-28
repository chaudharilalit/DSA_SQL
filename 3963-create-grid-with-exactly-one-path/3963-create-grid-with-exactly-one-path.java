class Solution {
    public String[] createGrid(int m, int n) {
        char arr[][] = new char[m][n];
        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                if(i==0 || j== n-1){
                    arr[i][j] = '.';
                }
                else{
                    arr[i][j] = '#';
                }
             
            }
        }

     String str[] = new String[m];
         for(int i=0 ; i<m ; i++){
            String start = "";
            for(int j=0 ; j<n ; j++){
               start = start + arr[i][j];
            }

            str[i] = start;
        }

       return str;
    }
}