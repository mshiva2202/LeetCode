class Solution {
    public int findLHS(int[] nums) {
    int ans=0;
    Map<Integer,Integer> m=new TreeMap<>();
    for(int n:nums)
    {
        m.put(n,m.getOrDefault(n,0)+1);
    }
    int s=m.size();
    int a[][]=new int[s][2];
    int idx=0;
    for(Integer key:m.keySet())
    {
        a[idx][0]=key;
        a[idx][1]=m.get(key);
        idx++;
    }

    for(int i=0;i<s-1;i++)
    {
        if(a[i+1][0] - a[i][0] == 1)
        {
            int temp=a[i][1]+a[i+1][1];
            ans=Math.max(temp,ans);
        }
    }

    return ans;
}
}