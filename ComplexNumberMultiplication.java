/*
 * Nilanshu Sharma
 * https://leetcode.com/problems/complex-number-multiplication/
 */ 

public class ComplexNumberMultiplication {
    public int extractA(String s) {
        int i=0,val=0,n=s.length();
        boolean isNeg = false; 
        if(s.charAt(i) == '-') isNeg = true;
        if(isNeg) i++;  
        while(s.charAt(i) != '+') {
            int digit = s.charAt(i++)-'0'; 
            val = val*10 + digit; 
        } 
        return isNeg ? -val : val; 
    }
    
    public int extractB(String s, int start) {
        int i=start,val=0,n=s.length();
        boolean isNeg = false; 
        if(s.charAt(i) == '-') isNeg = true;
        if(isNeg) i++; 
        while(i<=n-1 && s.charAt(i) != 'i'){
            int digit = s.charAt(i++)-'0'; 
            val = val*10 + digit; 
        } 
        return isNeg ? -val : val; 
    }
    
    public String complexNumberMultiply(String str1, String str2) {
        int a1 = extractA(str1); 
        int a2 = extractA(str2);
        int i=0, j=0; 
        while(str1.charAt(i) != '+') i++;
        while(str2.charAt(j) != '+') j++;
        int b1 = extractB(str1,++i);
        int b2 = extractB(str2,++j);
        int a3 = a1*a2 - b1*b2; 
        int b3 = a1*b2 + a2*b1; 
        String str = "" + a3 + "+" + b3 + "i"; 
        return str; 
    }
}