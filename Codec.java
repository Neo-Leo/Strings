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
        int len,j,i=0,start=0;
        StringBuilder sb;
        while(i<=s.length()-1){
            start=i;
            while(s.charAt(i)!='#') {
                i++;
            }
            len = Integer.parseInt(s.substring(start,i));
            i++;
            j=0;
            sb = new StringBuilder();
            while( (i+j <= s.length()-1) && j<=len-1) {
                sb.append(s.charAt(i+j));
                j++;
            }
            i+=len;
            resList.add(new String(sb));
        }
        return resList;
    }
}