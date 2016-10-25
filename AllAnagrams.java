/*
 * Nilanshu Sharma
 * https://leetcode.com/problems/find-all-anagrams-in-a-string/
 */ 

public class AllAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<Integer>(); 
        if(s == null || p == null || s.length() == 0 || p.length() == 0 || p.length() > s.length())     
            return list; 
        int[] Map = new int[256];
        int start=0, end=0, count=p.length(); 
        for(int i=0; i<=p.length()-1; i++){
            Map[p.charAt(i)]++;
        }

        while(end <= s.length()-1) {
            // If a character in p is found in s
            if(Map[s.charAt(end++)]-- > 0) {  
                count--; 
            }
            // This condition is true when a substring in s 
            // is found which has all character in p    
            while(count == 0) {
                // Check if the substring has the same length as p
                if(end - start == p.length()) {
                    list.add(start); 
                }
                // Remove unnecessary characters from starting
                if(Map[s.charAt(start++)]++ == 0) { count++; }  
            }
        }
        return list; 
    }
}