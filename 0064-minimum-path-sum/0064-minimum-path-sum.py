# 참고 블로그: https://blog.naver.com/abj13/223328826523 
class Solution(object):
    def minPathSum(self, grid):
        grid_height = len(grid)
        grid_width = len(grid[0])
        
        for x in range(1, grid_width):
            grid[0][x] += grid[0][x-1]
        
        for y in range(1, grid_height):
            grid[y][0] += grid[y-1][0]

        for y in range(1, grid_height):
            for x in range(1, grid_width):
                grid[y][x] += min(grid[y][x-1], grid[y-1][x])
        
        return grid[-1][-1]
   
