class Solution {
    static String addChars(String temp)
    {
        String ans=new String(temp);
        for(char ch:temp.toCharArray())
        {
           if(ch == 'z')
           {
                ans=ans+"a";
           }
           else
           {
                ans=ans+(char)(ch+1);
           }
        }
        return ans;
    }
    public char kthCharacter(int k) {

        String word="a";
        while(word.length() < k)
        {
            word=addChars(word);
        }
        return word.charAt(k-1);
    }
}