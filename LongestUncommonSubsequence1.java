/*
 * Nilanshu Sharma
 * https://leetcode.com/problems/longest-uncommon-subsequence-i/
 */ 

public class LongestUncommonSubsequence1 {
    public int findLUSlength(String a, String b) {
        if(a.equals(b)) return -1; 
        return Math.max(a.length(), b.length());
    }
}