/*
 * Nilanshu Sharma
 * https://leetcode.com/problems/minimum-window-substring/
 */ 

public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        int[] map = new int[256]; 
        int count=t.length(), minLength = Integer.MAX_VALUE, start=0, end=0, minStart=-1,minEnd=-1;
        for(int i=0; i<=t.length()-1; i++) map[t.charAt(i)]++; 
        while(end <= s.length()-1){
            if(map[s.charAt(end++)]-- > 0) count--; 
            while(count == 0){
                if(end-start < minLength){
                    minStart = start; 
                    minEnd = end; 
                    minLength = end-start; 
                }
                if(map[s.charAt(start++)]++ == 0) count++; 
            }
        }
        return (minLength == Integer.MAX_VALUE) ? "" : s.substring(minStart,minEnd);  
    }
}
