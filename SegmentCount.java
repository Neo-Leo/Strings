/*
 * Nilanshu Sharma
 * https://leetcode.com/problems/number-of-segments-in-a-string/
 */ 

public class SegmentCount {
    public int countSegments(String s) {
        if(s == null ||  s.length() == 0) return 0; 
        int NONSPACE=1, SPACE=2; 
        int state = -1; 
        if(s.charAt(0) != ' ') state = NONSPACE; 
        else state = SPACE; 
        int count; 
        if(state == SPACE) count = 0; 
        else count = 1; 
        for(int i=1; i<=s.length()-1; i++){
            if(state == NONSPACE && s.charAt(i) == ' ') {
                state = SPACE; 
            } else if (state == SPACE && s.charAt(i) != ' ') {
                count++; 
                state=NONSPACE; 
            }
        }
        return count; 
    }
}