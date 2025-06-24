class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        Set<Integer> s=new TreeSet<>();
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {

            if(nums[i] == key)
            {
                s.add(i);
                int idx=i;
                int temp=k;
                while(temp>0)
                {
                    idx--;
                    if(idx>=0)
                    {
                        s.add(idx);
                    }
                    else
                    {
                        break;
                    }
                    temp--;
                }

                idx=i;
                temp=k;
                while(temp>0)
                {
                    idx++;
                    if(idx<nums.length)
                    {
                        s.add(idx);
                    }
                    else
                    {
                        break;
                    }
                    temp--;
                }

            }
        }
        for(Integer val:s)
        {
            res.add(val);
        }
     return res;
    }
}