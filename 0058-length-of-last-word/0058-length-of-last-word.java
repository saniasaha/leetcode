class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length() -1;//scan the last character
        //skip the spaces
        while(i>=0 && s.charAt(i) == ' '){
            i--;
        }
        //count the length of last word
        int count = 0;
        while(i>=0 && s.charAt(i) != ' '){
            count++;
            i--;
        }
        return count;

        }

    }
