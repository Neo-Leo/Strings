/*
 * Nilanshu Sharma
 * https://leetcode.com/problems/integer-to-english-words/
 */ 

public class IntegerToEnglishWords {
    String[] lessThan20 = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    String[] tens = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    String[] thousands = {"", "Thousand", "Million", "Billion"};

    public String numberToWords(int num) {
        if(num == 0)    
            return "Zero";
        String result = ""; // string to be returned 
        int i=0; //Thousand marker
        
        while(num>0) {
            if (num % 1000 != 0) // If num%1000 is 0, then you will get the unwanted thousands term e.g. 1000000 -> One million thousand. 
                result = wrapper(num%1000) + thousands[i] + " " + result; //Extract last three digits of the number, 
                                                                      //create result for it 
            num = num/1000; //Get rid of the last three digits.  
            i++; // Increment the thousand marker. 
        }
        result = result.trim(); //There will be an extra space at the back so trim it. 
        return result; 
    }
    
    public String wrapper(int n){ //Recieves the three digits. 
        String result;
        if(n==0)
            result = "";
        else if(n<20)
            result = lessThan20[n] + " ";
        else if (n<100)
            result = tens[n/10] + " " + wrapper(n%10);  
        else
            result = lessThan20[n/100] + " Hundred " + wrapper(n%100);  
        return result;
    }
}