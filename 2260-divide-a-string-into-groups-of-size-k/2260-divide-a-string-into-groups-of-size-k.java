class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n=s.length();
        int arsize=(int)Math.ceilDiv(n,k);
        String res[]=new String[arsize];
        int a=0,b=k;
        for(int i=0;i<arsize;i++)
        {
            if(b <= n)
            {
                res[i]=s.substring(a,b);
                a=b;
                b=a+k;
            }
            else
            {   int rlen=n-a;
                int x=k-rlen;
                String temp=s.substring(a,n);
                while(x-->0)
                {
                    temp=temp+fill;
                }
                res[i]=temp;
            }
        }
        return res;
    }
}