class Solution {
    public int minMoves(int[] nums) {
       int maxVal=nums[0];
       for(int num:nums){
        maxVal=Math.max(maxVal,num);
       }

       long total=0;
       for(int num:nums){
        total+=(maxVal-num);
       }
       return (int)total;
       

    }
}