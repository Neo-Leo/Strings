/*
 * Nilanshu Sharma
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */ 

public class LongestSubstringUniqueChars {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0)
            return 0; 
        int[] map = new int[256]; 
        int maxLen = Integer.MIN_VALUE, start=0, end=0,count=0; 
        while(end <= s.length()-1){
            if(map[s.charAt(end++)]++ > 0) count++; 
            while(count > 0){
                if(map[s.charAt(start++)]-- > 1) count--;     
            }    
            maxLen = Math.max(maxLen,end-start);
        }
        return maxLen; 
    }
}
