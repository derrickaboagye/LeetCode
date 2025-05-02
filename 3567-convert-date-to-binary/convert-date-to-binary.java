

    /**
    Iuntuion: Here we are given a string of numbers in format yyyy-mm-dd. 

    date can writeen in its binary format wihtout any leading zeros. and wirriten back in yyyy-mm-dd format. return binary rep of the date.


    Aporahc.
    
    
     */
   public class Solution {
    public String convertDateToBinary(String date) {
        // we parse each part of our string into int values
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));

        // we find the binary value of each parsed part of our string
        String y = Integer.toBinaryString(year);
        String m = Integer.toBinaryString(month);
        String d = Integer.toBinaryString(day);

        return y + "-" + m + "-" + d;
    }
}
