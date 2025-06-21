class Solution {
    public int minimumDeletions(String word, int k) {
        int a[]=new int[26];
        for(char ch:word.toCharArray())
        {
            a[ch-'a']++;
        }
        Arrays.sort(a);
        int res=Integer.MAX_VALUE;
        int dt=0;
        for(int i=0;i<26;i++){
            int minfreq=a[i];
            int temp=dt;
            for(int j=25;j>i;j--){
                if(Math.abs(a[i]-a[j])<=k) break;
                temp+=a[j]-minfreq-k;
            }
            res=Math.min(res,temp);
            dt+=minfreq;
        }
        
    return res;
    }
}