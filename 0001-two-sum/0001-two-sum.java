class Solution {
    public int[] twoSum(int[] nums, int target) {
         // creating an empty hashmap
        HashMap<Integer, Integer> map = new HashMap<>(); 

        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if(map.containsKey(need)){  //need find the required number

                return new int[]{map.get(need),i}; //check if we already get
            }

            map.put(nums[i],i); //store the current number

        }

        return new int[]{}; // empty array
        
    }
}