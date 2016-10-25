/*
 * Nilanshu Sharma
 * https://leetcode.com/problems/longest-repeating-character-replacement/
 */ 

public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int count=0, start=0, end=0, maxCount=-1, maxLen = 0;
        int[] map = new int[26]; 
       
        while(end <= s.length()-1) {
            map[s.charAt(end++)-'A']++;  
            maxCount = Math.max(maxCount, map[s.charAt(end-1)-'A']); 
            // This is when window breaks the constraint  
            while(end-start > maxCount + k) { 
                map[s.charAt(start++)-'A']--;
                for(int i=0; i<=25; i++) {
                    maxCount = Math.max(maxCount,map[i]); 
                }
            }
            maxLen = Math.max(maxLen,end-start); 
        }
        return maxLen; 
    }
}