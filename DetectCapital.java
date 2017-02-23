/*
 * Nilanshu Sharma
 * https://leetcode.com/problems/detect-capital/?tab=Description
 */ 

public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        if(word == null || word.length() == 0) return true; 
        int upperCaseCount=0, lowerCaseCount=0, n = word.length(); 
        for(int i=0; i<=word.length()-1; i++){
            char ch = word.charAt(i);
            if(Character.isUpperCase(ch)) upperCaseCount++; 
            else lowerCaseCount++;
        }
        if(upperCaseCount == n || lowerCaseCount == n) return true; 
        else if(upperCaseCount == 1 && lowerCaseCount == n-1 && Character.isUpperCase(word.charAt(0))) return true; 
        else return false; 
    }
}