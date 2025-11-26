class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        back(0,candidates,target,result,new ArrayList<>());
        return result;
    }
    private void back(int index , int[] candidates , int remaining , List<List<Integer>> result , List<Integer> curr){
        if(remaining==0){
            result.add(new ArrayList<>(curr));
            return;
        }
        if (index == candidates.length || remaining < 0) {
            return;
        }
        if (candidates[index] <= remaining) {
            curr.add(candidates[index]);
            back(index, candidates, remaining - candidates[index], result, curr);
            curr.remove(curr.size() - 1);
        }


        back(index + 1, candidates, remaining,result, curr);
    }
}