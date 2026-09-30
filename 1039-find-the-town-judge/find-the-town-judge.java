class Solution {
    public int findJudge(int n, int[][] trust) {
       int trustCnt[]=new int[n+1];
   
       for(int t[]:trust){
        trustCnt[t[0]]--;
        trustCnt[t[1]]++;
       }
       for(int i=1;i<trustCnt.length;i++){
        if(trustCnt[i]==n-1) return i;
       }
       return -1;
    }
}