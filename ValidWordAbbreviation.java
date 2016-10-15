/*
 * Nilanshu Sharma
 * https://leetcode.com/problems/valid-word-abbreviation/
 */ 

public class ValidWordAbbreviation {
    public boolean validWordAbbreviation(String word, String abbr) {
        if(abbr == null || abbr.length() == 0) return false; 
        int n=word.length(), zeroCount=0; 
        int bitMask = (int)Math.pow(2,n)-1, one=1, i=0; 
        while(bitMask >= 0){
            StringBuilder sb = new StringBuilder(); 
            int tempMask=bitMask;
            zeroCount = 0; 
            i = 0;
            while(i < n) {
                if((tempMask&one) != 0) {
                    if(zeroCount != 0) {
                        sb.append(zeroCount);
                        zeroCount = 0; 
                    }
                    sb.append(word.charAt(i));
                } else {
                    zeroCount++; 
                }
                i++;
                tempMask=tempMask>>1; 
            }
            
            if(zeroCount != 0) {
                sb.append(zeroCount);
            }
            String s = new String(sb);
            if(s.equals(abbr)) return true; 
            bitMask--; 
        }
        return false; 
    }
}