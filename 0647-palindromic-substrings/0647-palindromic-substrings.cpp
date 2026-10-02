class Solution {
public:
    int countSubstrings(string s) {
        
        vector<vector<bool>>dp(s.length(),vector<bool>(s.length(),false));
        int count=0;

        for(int length=1; length<=s.length();length++){
         for(int i=0;i+length-1<s.length();i++){
            int j= i+length-1;

            if(i==j){
                dp[i][j]=true;
            }
            else if((i+1)==j && s[i]==s[j]){
                dp[i][j]=true;
            }
            else if(s[i]==s[j] && dp[i+1][j-1]==true){
                dp[i][j]=true;
            }

            if(dp[i][j]==true)count++;
         }
        }

        return count;
    }
};