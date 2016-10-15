/*
 * Nilanshu Sharma
 * https://leetcode.com/problems/integer-to-roman/
 */ 

public class IntegerToRoman {
    public String intToRoman(int num) {
        String Thousands[] = {"", "M", "MM", "MMM"};
        String Hundreds[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String Tens[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String Units[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        StringBuilder sb = new StringBuilder();
        sb.append(Thousands[num/1000]); //Thousands
        sb.append(Hundreds[(num%1000)/100]); //Hundreds
        sb.append(Tens[(num%100)/10]); //Tens
        sb.append(Units[num%10]); //Units
        return new String(sb);
    }
}