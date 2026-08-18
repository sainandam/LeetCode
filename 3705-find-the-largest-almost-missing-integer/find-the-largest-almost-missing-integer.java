class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Select each subarray of size k
        for (int i = 0; i <= nums.length - k; i++) {

            // Store distinct elements of current window
            HashSet<Integer> set = new HashSet<>();

            // Traverse current window
            for (int j = i; j < i + k; j++) {
                set.add(nums[j]);
            }

            // Count how many subarrays contain each number
            for (int num : set) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        int max = Integer.MIN_VALUE;

        for (int num : map.keySet()) {
            if (map.get(num) == 1) {
                max = Math.max(max, num);
            }
        }

        return max == Integer.MIN_VALUE ? -1 : max;

    }
}