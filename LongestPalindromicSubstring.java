/*
 * Nilanshu Sharma
 * https://leetcode.com/problems/longest-palindromic-substring/
 */ 


public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if(s == null || s.length() == 0)
            return s; 
        int start=0,end=0,maxStart=0, maxEnd=0,maxLength=Integer.MIN_VALUE;
        for(int i=0; i<=s.length()-2;i++){
            //Find the odd length Strings 
            end = start= i; 
            while(start>=0 && end <= s.length()-1 && s.charAt(start) == s.charAt(end)){
                start--; 
                end++;
            }
            if(end-start-1 > maxLength){
                maxLength = end-start-1;
                maxStart = start+1; 
                maxEnd = end-1;
            }
            start=i; 
            end=i+1; 
            while(start>=0 && end <= s.length()-1 && s.charAt(start) == s.charAt(end)){
                start--; 
                end++;
            }
            if(end-start-1 > maxLength){
                maxLength = end-start-1;
                maxStart = start+1; 
                maxEnd = end-1;
            }
        }
        return s.substring(maxStart, maxEnd+1);
    }
}