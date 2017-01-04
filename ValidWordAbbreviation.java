/*
 * Nilanshu Sharma
 * https://leetcode.com/problems/valid-word-abbreviation/
 */ 

public class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        if(word == null && abbr == null) return true; 
        if(word == null || abbr == null) return false; 
        if(word.length()==0 && abbr.length()==0) return true; 
        if(word.length()==0 || abbr.length()==0) return false; 
        int i=0,j=0;
        while(i<=word.length()-1 && j <= abbr.length()-1){
            char ch = abbr.charAt(j); 
            if(!Character.isDigit(ch)){
                if(ch != word.charAt(i)) return false; 
                j++; 
                i++; 
            } else {
                int skip = 0; 
                if(j<=abbr.length()-1 && ch == '0') return false; 
                while(j<=abbr.length()-1 && Character.isDigit(abbr.charAt(j))){
                    skip = skip*10 + abbr.charAt(j)-'0'; 
                    j++; 
                } 
                if(skip > word.length()-i) return false; 
                while(skip>0){
                    i++; 
                    skip--; 
                }
            } 
        }
        if(i == word.length() && j == abbr.length()) return true; 
        return false; 
    }
}
