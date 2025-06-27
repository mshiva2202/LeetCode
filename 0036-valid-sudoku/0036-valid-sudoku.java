class Solution {
    public boolean isValidSudoku(char[][] board) {

        Set<String> seen=new HashSet<>();

        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j] != '.')
                {
                    char ch=board[i][j];
                    if(seen.contains(ch+"row"+i) || seen.contains(ch+"col"+j) || seen.contains(i/3+"row"+j/3+"col"+ch))
                    {
                        return false;
                    }
                    seen.add(ch+"row"+i);
                    seen.add(ch+"col"+j);
                    seen.add(i/3+"row"+j/3+"col"+ch);
                }
            }
        }
        return true;
    }
}