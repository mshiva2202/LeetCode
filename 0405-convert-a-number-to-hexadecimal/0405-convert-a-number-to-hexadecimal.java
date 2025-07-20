class Solution {
    public String toHex(int num) {

        if (num == 0) return "0";

        StringBuilder str = new StringBuilder();
        char[] hexChars = "0123456789abcdef".toCharArray();

        while (num != 0) {
            int rem = num&15; // samw like num%16...
            str.append(hexChars[rem]); 
            num =num>>>4;         // unsigned right shift operator..
        }

        return str.reverse().toString(); 
    }

}