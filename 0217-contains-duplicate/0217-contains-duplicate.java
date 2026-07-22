class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set =new HashSet<>();//creating a empty hashset
        for(int num: nums){ // traverse array by enhanced for loop
             if(set.contains(num)){ // check if current elemenent in hashset
                return true; 
             }

             set.add(num);// if not present then add the current element to hashset
        }  
        return false;
        
    }
}   
    
