/*
 * Nilanshu Sharma
 * https://leetcode.com/problems/read-n-characters-given-read4/
 */ 

public class ReadNChars extends Reader4 {
    /**
     * @param buf Destination buffer
     * @param n   Maximum number of characters to read
     * @return    The number of characters read
     */
    public int read(char[] largeBuf, int n) {
        int smallBuffPtr = 0, largeBufPtr=0, totalCharsReadCount=0;
        int ret = 0;
        char[] smallBuff = new char[4];
        while (totalCharsReadCount < n) {
            ret = read4(smallBuff);
            if (ret == 0) break; //No more chars to read, this is the case when buffer is smaller than n. 
            while (totalCharsReadCount < n && smallBuffPtr < ret) {
                largeBuf[largeBufPtr++] = smallBuff[smallBuffPtr++];
                totalCharsReadCount++;
            }
            if (ret < 4) break; //Read4 has less than 4 characters, so more characters to read. 
            smallBuffPtr = 0;
        }
        return totalCharsReadCount;
    }
}