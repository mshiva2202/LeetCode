class Solution {
    public int[][] divideArray(int[] nums, int k) {

        int n=nums.length;
        int m=n/3;
        int res[][]=new int[m][3];
        Arrays.sort(nums);
        int row=0;
        int col=0;
        for(int val:nums)
        {
            res[row][col]=val;
            col++;
            if(col>2)
            {
                if(Math.abs(res[row][0]-res[row][2]) > k)
                {
                    return new int[][]{};
                }
       
                else
                {
                    row++;
                    col=0;
                }
            }

        }

        return res;
        
    }
}