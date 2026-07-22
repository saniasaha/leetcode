class Solution {
    public boolean isAnagram(String s, String t) {
        // check if the s length is equal with t string
        if(s.length() != t.length()){ 
            return false;
        }
        // create a empty hashmap
        HashMap<Character,Integer> map = new HashMap<>();

        // traverse the s string
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }

            else{
                map.put(ch,1);
            }
        }

        //traversinfg the t string
        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);

            if(! map.containsKey(ch)) {
                return false;
            }

            int freq =map.get(ch);
            if(freq==0){
                return false;
            }

            map.put(ch,freq - 1);
        }
    
        return true;

    }
}