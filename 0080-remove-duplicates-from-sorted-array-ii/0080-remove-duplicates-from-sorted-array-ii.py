class Solution:
    def removeDuplicates(self, nums: list[int]) -> int:
        if not nums:
            return len(nums)
        prev=nums[-1]
        count=0
        for i in range(len(nums)-1,-1,-1):
          
            
            if prev == nums[i]:
                count+=1
            else:
                prev=nums[i]
                count=1

            if count > 2:
                nums.pop(i)
                count-=1
        
        return len(nums)