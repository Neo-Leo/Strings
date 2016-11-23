/*
 * Nilanshu Sharma
 * https://leetcode.com/problems/valid-word-square/
 */ 

public class Solution {
    public boolean validWordSquare(List<String> words) {
        if(words == null || words.size() == 0 || words.get(0).length() == 0) return true;
        int rows = words.size(); 
        for(int i=0; i<=rows-1; i++) {
            for(int j=0; j<=words.get(i).length()-1; j++) {
                if((j >= rows) || (i >= words.get(j).length()) || (words.get(i).charAt(j) != words.get(j).charAt(i))) return false; 
            }
        }
        return true; 
    }
}