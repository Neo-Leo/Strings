/*
 * Nilanshu Sharma
 * https://leetcode.com/problems/length-of-last-word/
 */ 

public class LastWordLength {
    public int lengthOfLastWord(String s) {
        int end = s.length()-1; 
        while(end>=0 && !Character.isLetter(s.charAt(end))){
            end--;    
        }  
        if(end < 0) return 0; 
        int len=0; 
        while(end>=0 && Character.isLetter(s.charAt(end))){
            end--;
            len++;
        } 
        return len; 
    }
}