class CountBinarySubstrings {
     public int countBinarySubstrings(String s) {
        int count = 0, curr_local_count=0, last_local_count=0, n=s.length(), start=0, end=0, i=0;  
        while(end<=n-1) {
            while (end<=n-1 && s.charAt(start) == s.charAt(end)) {
                curr_local_count++; 
                end++; 
            } 
            if(i>0) count += Math.min(curr_local_count, last_local_count);
            last_local_count=curr_local_count;
            start = end;
            curr_local_count=0;
            i++;
        }
        return count;
    }
}
