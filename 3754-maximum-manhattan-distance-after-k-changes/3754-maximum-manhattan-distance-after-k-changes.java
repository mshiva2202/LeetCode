class Solution {

    static int helper(String s,char n[],int k)
    {
        int a=0,b=0;
        int maxval=0;
        for(char ch:s.toCharArray())
        {
            if(ch == 'N' || ch == 'S')
            {
                if((n[0]!=ch) && k>0)
                {
                    b++;
                    k--;
                }
                else if(n[0]!=ch)
                {
                    b--;
                }
                else
                {
                    b++;
                }
            }
            else
            {
                if((n[1]!=ch) && k>0)
                {
                    a++;
                    k--;
                }
                else if(n[1]!=ch)
                {
                    a--;
                }
                else
                {
                    a++;
                }
            }
            int cur=Math.abs(a-0)+Math.abs(b-0);
            maxval=Math.max(cur,maxval);
        }
        return maxval;
    }
    public int maxDistance(String s, int k) { 
     
     int dir[]=new int[4];
     for(char ch:s.toCharArray())
     {
        if(ch == 'N')
        {
            dir[0]+=1;
        }
        else if(ch =='S')
        {
            dir[1]+=1;
        }
        else if(ch == 'E')
        {
            dir[2]+=1;
        }
        else
        {
            dir[3]+=1;
        }
        
     }

    char arr[]=new char[2];
    arr[0]='N';
    arr[1]='E';
    int ne=helper(s,arr,k);
    arr[0]='N';
    arr[1]='W';
    int nw=helper(s,arr,k);
    arr[0]='S';
    arr[1]='E';
    int se=helper(s,arr,k);
    arr[0]='S';
    arr[1]='W';
    int sw=helper(s,arr,k);
    return Math.max(Math.max(ne,nw),Math.max(se,sw));


    }
}