class Solution {
    public int partitionArray(int[] nums, int k) {
      Arrays.sort(nums);
      int ans=0;
      int n=nums.length;
        int left=0;
      for(int i=1;i<n;i++)
      {
            if(nums[i]-nums[left] > k)
            {
                ans++;
                left=i;
            }
            
      }
      if(left < n)
      {
        ans++;
      }
      return ans;
    }
}