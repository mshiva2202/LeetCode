class Solution {
    public int findLucky(int[] arr) {
        int i=0,j=arr.length-1;
        int ans=-1;
        Map<Integer,Integer> m=new HashMap<>();
         while(i<=j)
        {
            m.put(arr[i],m.getOrDefault(arr[i],0)+1);
            i++;
        }
         for(Integer key : m.keySet()) 
            if(key==m.get(key)  && ans<key)
                {
                    ans=key;
                }
    
        return ans;
        
    }
}