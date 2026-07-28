class Solution {
    public String smallestPalindrome(String s) {

        int[] freq = new int[26];

        // Count frequency of each character
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        StringBuilder firstHalf = new StringBuilder();
        String middle = "";

        // Build first half and find middle character
        for (int i = 0; i < 26; i++) {

            while (freq[i] >= 2) {
                firstHalf.append((char) (i + 'a'));
                freq[i] -= 2;
            }

            if (freq[i] == 1) {
                middle = String.valueOf((char) (i + 'a'));
            }
        }

        // Build second half
        String secondHalf = new StringBuilder(firstHalf).reverse().toString();

        return firstHalf.toString() + middle + secondHalf;
    }
}