class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
      int n=nums.length;
      int[] ans = new int[n - k + 1];
      int ri=0;
      Deque<Integer> dq = new ArrayDeque<>();
      for(int i=0;i<n;i++){
        if(!dq.isEmpty()&&dq.peekFirst()<i-k+1){
            dq.pollFirst();
        }
            while(!dq.isEmpty()&&nums[dq.peekLast()]<nums[i]){
                dq.pollLast();
            }
            dq.offerLast(i);
            if(i>=k-1){
                ans[ri++]=nums[dq.peekFirst()];
            }
        }

      
      return ans;
    }
}

//   if(nums==null||nums.length==0){
//             return new int[0];
//         }
//         int n=nums.length;
//         int []res=new int[n-k+1];
//         int ri=0;
//         Deque<Integer> deque=new ArrayDeque<>();

//         for(int i=0;i<n;i++){
//             if(!deque.isEmpty()&&deque.peekFirst()<i-k+1){
//                 deque.pollFirst();
//             }
//             while(!deque.isEmpty()&&nums[deque.peekLast()]<nums[i]){
//                 deque.pollLast();
//             }
//             deque.offerLast(i);
//             if(i>=k-1){
//                 res[ri++]=nums[deque.peekFirst()];
//             }
//         }
//         return res;
       
