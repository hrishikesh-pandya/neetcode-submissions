class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for(int i=0;i<9;i++)
        {
            for (int j=0;j<9;j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        //Check rows/cols
        for(int i=0;i<9;i++)
        {
            if(rowChecker(board,i))
            {
                for(int j=0;j<9;j++)
                {
                    if(colChecker(board,j))
                    {
                        continue;
                    }
                    else
                    {
                        return false;
                    }
                }
            }
            else return false;
        }

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(boxChecker(board,i,j))
                {
                    continue;
                }
                else
                {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean rowChecker(char[][] board, int i)
    {

        int[] nums=new int[10];
        for(int j=0;j<9;j++)
        {
            if(board[i][j]=='.') continue;
            
            if(nums[board[i][j]-'0']<1) nums[board[i][j]-'0']++;
            else if(nums[board[i][j]-'0']>=1) return false; 
        }
        return true;
    }

    public static boolean colChecker(char[][] board, int j)
    {

        int[] nums=new int[10];
        for(int i=0;i<9;i++)
        {
            if(board[i][j]=='.') continue;
            
            if(nums[board[i][j]-'0']<1) nums[board[i][j]-'0']++;
            else if(nums[board[i][j]-'0']>=1) return false; 
        }
        return true;
    }

    public static boolean boxChecker(char[][] board, int i, int j)
    {

        int[] nums=new int[10];
        for(int row=0;row<3;row++)
        {
            for(int col=0;col<3;col++)
            {
                if(board[(3*i)+row][(3*j)+col]=='.') continue;

                if(nums[(board[(3*i)+row][(3*j)+col])-'0']<1) nums[(board[(3*i)+row][(3*j)+col])-'0']++;
                else if(nums[(board[(3*i)+row][(3*j)+col])-'0']>=1) return false;
            }
        }
        return true;
    }
}
