class Solution:
    def combinationSum2(self, candidates: list[int], target: int) -> list[list[int]]:
        res=[]
        candidates.sort()
        
        def backtrack(start , curr , curr_sum):
            if target == curr_sum:
                res.append(curr[:])
                return
            if start == len (candidates) or curr_sum > target:
                return
            curr.append(candidates[start])
            backtrack(start+1 , curr , curr_sum+candidates[start] )
            
            curr.pop()
            next_idx = start + 1
            while (next_idx < len(candidates) and candidates[next_idx] == candidates[start]):
                next_idx += 1
            backtrack( next_idx , curr , curr_sum)
        backtrack(0,[],0)
        return res


        