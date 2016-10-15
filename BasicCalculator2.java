/*
 * Nilanshu Sharma
 * https://leetcode.com/problems/basic-calculator-ii/
 */ 

public class BasicCalculator2 {
    public int calculate(String s) {
        if(s == null || s.length() == 0) return 0; 
        Stack<Integer> st = new Stack<Integer>(); 
        int val=0; 
        char sign = '+'; 
        for(int i=0; i<=s.length()-1; i++) {
            char ch = s.charAt(i); 
            if( Character.isDigit(ch)) {
                val = val*10 + ch-'0'; 
            } 
            
            if((!Character.isDigit(ch) && ch != ' ') || i == s.length()-1) { // At encounter of every sign or last character we push on the stack 
                if(sign == '+'){
                    st.push(val); 
                } else if(sign == '-') {
                    st.push(-val); 
                } else if(sign == '*') { // Multiplication Case 
                    st.push(val*st.pop()); 
                } else { // Division Case 
                    st.push(st.pop()/val); 
                }
                sign = ch; 
                val=0;
            }
        }
        int result = 0; 
        while(!st.isEmpty()){
            result += st.pop(); 
        }
        
        return result; 
    }
}