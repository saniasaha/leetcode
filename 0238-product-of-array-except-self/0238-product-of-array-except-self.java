class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] ans = new int[n];
        int leftpdt = 1;
        //first pass- left pdt
        for(int i =0; i<n;i++){
            ans[i]= leftpdt;
            leftpdt *= nums[i];
        }

        int rightpdt =1;
        //second pass- right pdt
        for(int i=n-1; i>=0; i--){
            ans[i] *= rightpdt;
            rightpdt *= nums[i];

        }
        return ans;
    }
}