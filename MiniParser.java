/*
 * Nilanshu Sharma
 * https://leetcode.com/problems/mini-parser/
 */ 

public class MiniParser {
    public NestedInteger deserialize(String s) {
        if(s == null || s.length() == 0) return new NestedInteger(); 
        if (s.charAt(0) != '[') // ERROR: special case
            return new NestedInteger(Integer.valueOf(s));
        //NestedInteger currNI = null; 
        Stack<NestedInteger> st = new Stack<NestedInteger>(); 
        int end=0; 
        for(int i=0; i<=s.length()-1; i++){
            char ch = s.charAt(i);  
            if(ch == '[') {
                st.push(new NestedInteger());
            } else if(ch == ']') {
                NestedInteger prev = st.pop();
                if(st.isEmpty()) return prev; 
                st.peek().add(prev);
            } else if(ch == ','){ // Case of a comma, no need to do anything for a list
                continue; 
            } else { // Digit
                end = i; 
                while(end <= s.length()-1 && ((Character.isDigit(s.charAt(end))) || s.charAt(end) == '-')) end++; 
                NestedInteger currNI = new NestedInteger(Integer.valueOf(s.substring(i,end)));
                st.peek().add(currNI);
                i = --end; 
            }
        }
        
        return st.pop(); 
    }
}