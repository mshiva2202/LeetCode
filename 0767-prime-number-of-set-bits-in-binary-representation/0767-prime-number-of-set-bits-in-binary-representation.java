class Solution {
    static boolean isPrime(int count)
    {
        if(count<2) return false;
        int mul=1;
        int i=2;
        while(i <= count/i)
        {
            if(count%i == 0)
            {
                mul++;
                if(mul>=2)
                {
                    return false;
                }
            }
            i++;
        }
        return true;
    }
    public int countPrimeSetBits(int left, int right) {

        int ans=0;
        for(int i=left;i<=right;i++)
        {
            int num=i;
            int temp=0;
            while(num>0)
            {
                num=num&(num-1);
                temp++;
            }

            if(isPrime(temp))
            {
                ans++;
            }

        
        }
        return ans;
    }
}