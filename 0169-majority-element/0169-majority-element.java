class Solution {
    public int majorityElement(int[] nums) {
        //1.create an empty hashmap
        HashMap<Integer,Integer> map = new HashMap<>();
        //traverse the array  
        for(int num: nums){
            //check if the number is in the hashmap??
            if(map.containsKey(num)){
                map.put(num,map.get(num) + 1);//if yes then increase it's freq by 1
            }
            else{
                map.put(num, 1);//if not then add it with freq 1
            }
        } 
        // now traverse the hashmap
        for(int key : map.keySet()) {

            int freq = map.get(key);//get it's frequency

            if(freq>nums.length /2 ){// compare with n/2
                return key;
            }
        }
        return -1;
    }
}