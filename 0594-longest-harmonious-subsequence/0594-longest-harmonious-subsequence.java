class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
    int ans=0;
    int left=0;
    int c=0;
    for(int right=0;right<nums.length;right++)
    {
        if(nums[right]-nums[left] == 1)
        {
            c++;
            if(c>ans)
            {
                ans=c;
            }
        }
        else
        {
            while(nums[right]-nums[left] > 1)
            {
                left++;
            }
            c=right-left+1;
        }
    } 
   
    return ans;
}
}