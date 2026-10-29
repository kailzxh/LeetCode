class Solution:
    def findCircleNum(self, isConnected: List[List[int]]) -> int:
        graph=[ [] for _ in range(len(isConnected)) ]
        for i in range(len(isConnected)):
            for j in range(len(isConnected[i])):
                if isConnected[i][j]==1 and j!=i:
                    graph[i].append(j)
        visited=set()  
        count=0
        def dfs(graph,node):
            visited.add(node)
            for n in graph[node]:
                if n not in visited:
                    dfs(graph,n)
        for i in range(len(isConnected)):
            if i not in visited:
                count+=1
                dfs(graph,i)  
        return count


        