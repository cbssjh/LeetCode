class Solution:
    def uniquePaths(self, m: int, n: int) -> int:
        board = {}
        for i in range(n):
            board[0,i] = 1
        for i in range(m):
            board[i,0] = 1
        
        for i in range(1,m):
            for j in range(1,n):
                board[i,j] = board[i-1,j] + board[i,j-1]
    
        return board[m-1, n-1]
        
    