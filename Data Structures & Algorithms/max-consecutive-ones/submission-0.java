class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int output = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                sum += 1;
            } else if (nums[i] == 0) {
                if (sum > output) {
                    output = sum;
                }
                sum = 0;
            }
        }
        if (sum > output) {
            output = sum;
        }
        return output;
    }
}