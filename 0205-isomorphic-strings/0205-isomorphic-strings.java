class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() !=t.length()){ //check if the s and t string length is same or not?
        return false;
        }
        //create two empty hashmaps
        HashMap<Character, Character > map1 = new HashMap<> (); 
        HashMap<Character, Character> map2 = new HashMap<> (); 
        

        // traverse both strings in one loop
        for(int i=0; i< s.length(); i++){
            char ch1= s.charAt(i);
            char ch2= t.charAt(i);

            //check whether char 1 already exists in map1
            if(map1.containsKey(ch1)){ 
                if(map1.get(ch1) != ch2){
                    return false;
                }
            }
            else{
                map1.put(ch1,ch2);
            }
                
            

            //check whether char 2 already exists in map2
            if(map2.containsKey(ch2)){
                if(map2.get(ch2) != ch1){
                    return false;
                }
            }
            else{
                map2.put(ch2,ch1);
            }

        }
        return true;
    }
}