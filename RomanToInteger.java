/*
 * Nilanshu Sharma
 * https://leetcode.com/problems/roman-to-integer/
 */ 

public class RomanToInteger {
    private HashMap<Character, Integer> hm;  
    
    public Solution(){
        hm = new HashMap<Character, Integer>();; 
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
    }
    
    public int romanToInt(String s) {
        int result=0, i=0, n=s.length(); 
        while(i <= n-2){
            if(hm.get(s.charAt(i)) >= hm.get(s.charAt(i+1))){ //Just process this. 
                result += hm.get(s.charAt(i)); 
                i++;
            } else {
                result += hm.get(s.charAt(i+1)) - hm.get(s.charAt(i));
                i=i+2; 
            }
        }
        if(i == n-1)
            result += hm.get(s.charAt(i));
        return result; 
    }
}

