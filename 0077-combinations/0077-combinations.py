class Solution:
    def combine(self, n: int, k: int) -> list[list[int]]:
        nums=[i for i in range(1,n+1)]
        result=[]
        self.combination(0,nums,[],result,k)
        return result
    def combination(self,i,nums,curr,result,k):
        if len(curr) > k :
            return
        if i == len(nums):
            if len(curr) != k:
                return
            result.append(list(curr))
            return
        
        
        curr.append(nums[i])
        self.combination(i+1,nums,curr,result,k)
        curr.pop()
        self.combination(i+1,nums,curr,result,k)