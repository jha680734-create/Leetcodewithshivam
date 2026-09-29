class Solution {
    public boolean isAnagram(String s, String t) {
        // Agar lengths alag hain, toh anagram nahi ho sakta
        if (s.length() != t.length()) {
            return false;
        }
        
        // 26 size ka frequency array (lowercase English letters ke liye)
        int[] count = new int[26];
        
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;  // s ke character ki frequency badhao
            count[t.charAt(i) - 'a']--;  // t ke character ki frequency ghatao
        }
        
        // Check karo ki sabhi counts 0 hain ya nahi
        for (int val : count) {
            if (val != 0) {
                return false;
            }
        }
        
        return true;
    }
}