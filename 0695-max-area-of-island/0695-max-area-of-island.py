class Solution:
    def maxAreaOfIsland(self, grid: list[list[int]]) -> int:
        maxArea=0
        m,n=len(grid),len(grid[0])
        dire=[(1,0),(-1,0),(0,1),(0,-1)]
        def dfs(r,c):
            area=1 
            if grid[r][c] == 1:
                grid[r][c] = 0
                for dr,dc in dire:
                    nr,nc=dr+r,dc+c
                    if 0<=nr<m and 0<=nc<n and grid[nr][nc]==1:
                        area+=dfs(nr,nc)
            return area
        for r in range(m):
            for c in range(n):
                if grid[r][c] ==1:
                    # print(dfs(r,c))
                    maxArea=max(dfs(r,c),maxArea)
        return maxArea
