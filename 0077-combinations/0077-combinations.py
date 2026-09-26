class Solution:
    def combine(self, n: int, k: int) -> list[list[int]]:
        nums=[i for i in range(1,n+1)]
        used=[False]*len(nums)
        result=[]
        self.combination(0,nums,used,[],result,k)
        return result
    def combination(self,i,nums,used,curr,result,k):
        if len(curr) > k :
            return
        if i == len(nums):
            if len(curr) != k:
                return
            result.append(list(curr))
            return
        if used[i]:
            return
        else:
            curr.append(nums[i])
            used[i]=True
            self.combination(i+1,nums,used,curr,result,k)
            curr.pop()
            used[i]=False
            self.combination(i+1,nums,used,curr,result,k)