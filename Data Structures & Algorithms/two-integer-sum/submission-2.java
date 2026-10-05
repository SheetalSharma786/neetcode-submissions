class Solution {
    public int[] twoSum(int[] nums, int target) {
         int[] ar = new int[0];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j <= nums.length - 1; j++) {
                if(i== j) {
                    continue;
                }
                if (nums[i] + nums[j] == target) {
                    ar = new int[] {i, j};
                }
            }
        }
        return ar;
    }
}
