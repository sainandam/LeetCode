class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        int n=1<<nums.length;
        for(int i=0;i<n;i++){
            List<Integer>sub=new ArrayList<>();
            for(int j=0;j<nums.length;j++){
                if(checkbit(i,j)){
                    sub.add(nums[j]);
                }

            }
            res.add(sub);

        }
        return res;


    }
    public boolean checkbit(int n,int i){
        return (n&(1<<i))!=0;
    }
}