/*
 * Nilanshu Sharma
 * https://leetcode.com/problems/longest-substring-with-at-most-k-distinct-characters/
 */ 

public class LongestSubstringWithMaxKDistinctChars {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        if(s == null || s.length() == 0 || k == 0) return 0; 
        int[] map = new int[256];
        int count = 0, start=0, end=0, maxLen=Integer.MIN_VALUE;
        while(end <= s.length()-1){
            if(map[s.charAt(end++)]++ == 0) count++; 
            if(count <= k){
                maxLen = Math.max(maxLen, end-start);
                continue;
            } 
            while(map[s.charAt(start++)]-- != 1);
            count--;
        }
        return maxLen;
    }
}