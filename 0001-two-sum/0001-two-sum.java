class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> m=new HashMap<>();
        m.put(nums[0],0);
        int ans[]={-1,-1};
        for(int i=1;i<nums.length;i++)
        {
            if(m.containsKey(target-nums[i]))
            {
                ans[0]=m.get(target-nums[i]);
                ans[1]=i;
                break;
            }
            m.put(nums[i],i);

        }
        return ans;   
    }
}