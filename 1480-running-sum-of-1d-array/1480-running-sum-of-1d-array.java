class Solution {
    public int[] runningSum(int[] nums) {
        nums[0] = nums[0];//this line can be omitted
        int n=nums.length;
        for(int i=1; i<n;i++){
            nums[i] = nums[i] + nums[i-1];

        }
        return nums;
    }
}