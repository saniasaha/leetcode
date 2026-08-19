class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sorted = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sorted);

        int[] ans = new int[nums.length];

        for(int i =0; i<nums.length; i++){
            for(int j=0; j<sorted.length; j++){
                if(sorted[j] == nums[i]){
                    ans[i] =j;
                    break;
                }
            }
        }
        return ans;
    }
}