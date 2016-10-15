/*
 * Nilanshu Sharma
 * https://leetcode.com/problems/simplify-path/
 */ 

public class SimplifyPath {
    public String simplifyPath(String path) {
        String[] input = path.split("/");
        Stack<String> s = new Stack<String>();
        StringBuilder sb = new StringBuilder(); 
        for(String str : input){
            if(str.equals("..")) {
                if(!s.isEmpty()){
                    s.pop(); 
                }
            } else if(!str.equals("") && !str.equals(".")) {
                s.push(str);
            } 
        }
        
        if(s.isEmpty()){
            return "/"; 
        }
        
        while(!s.isEmpty()){
            sb.insert(0,s.pop());
            sb.insert(0,"/");
        }
        
        return new String(sb);
    }
}