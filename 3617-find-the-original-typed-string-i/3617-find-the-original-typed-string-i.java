class Solution {
    public int possibleStringCount(String word) {

        int a[]=new int[26];
        char prev='2';
        int c=word.length()+1;;
        for(char ch:word.toCharArray())
        {
            if(ch != prev)
            {
                prev=ch;
                c--;
            }
         
        }
        return c;
        
    }
}