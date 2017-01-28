/*
 * Nilanshu Sharma
 * https://leetcode.com/problems/encode-and-decode-strings/
 */ 

public class Codec {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s : strs) {
            sb.append(s.length());
            sb.append('#');
            sb.append(s);
        }
        return new String(sb);
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> resList = new ArrayList<String>();
        if(s.length() == 0){
            return resList;
        }
        int len,end=0,start=0;
        StringBuilder sb;
        while(end<=s.length()-1){
            start=end;
            while(s.charAt(end)!='#') end++;
            len = Integer.parseInt(s.substring(start,end));
            start = ++end;
            end += len; 
            String tempStr = s.substring(start,end);
            resList.add(new String(tempStr));
        }
        return resList;
    }
}
