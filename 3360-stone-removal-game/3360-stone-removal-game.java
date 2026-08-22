class Solution {
    public boolean canAliceWin(int n) {
    if(n < 10 ) return false;
    int count = 0;
    int remove = 10;
    while(n >= remove ){
      n= n - remove ;
      count++;
      remove--;
    }

    if(count % 2 == 0) return false;
    else return true;
    }
}