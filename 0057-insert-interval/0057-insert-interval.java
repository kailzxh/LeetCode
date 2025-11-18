class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        List<List<Integer>> ans = new ArrayList<>();

        int n = intervals.length;
        boolean merged = false;

        for (int i = 0; i < n; i++) {

            List<Integer> in = new ArrayList<>();
            if (intervals[i][1] < newInterval[0]) {
                in.add(intervals[i][0]);
                in.add(intervals[i][1]);
                ans.add(in);
            }
            else if (intervals[i][0] <= newInterval[1]) {

                
                int start = Math.min(intervals[i][0], newInterval[0]);
                int end   = Math.max(intervals[i][1], newInterval[1]);

            
                int j = i + 1;
                while (j < n && intervals[j][0] <= end) {
                    end = Math.max(end, intervals[j][1]);
                    j++;
                }

                in.add(start);
                in.add(end);
                ans.add(in);
                i = j - 1;
                merged = true;
            }
            else {
                if (!merged) {
                    List<Integer> newIn = new ArrayList<>();
                    newIn.add(newInterval[0]);
                    newIn.add(newInterval[1]);
                    ans.add(newIn);
                    merged = true;
                }

                in.add(intervals[i][0]);
                in.add(intervals[i][1]);
                ans.add(in);
            }
        }
        if (!merged) {
            List<Integer> in = new ArrayList<>();
            in.add(newInterval[0]);
            in.add(newInterval[1]);
            ans.add(in);
        }
        int[][] out = new int[ans.size()][2];
        for (int i = 0; i < ans.size(); i++) {
            out[i][0] = ans.get(i).get(0);
            out[i][1] = ans.get(i).get(1);
        }

        return out;
    }
}
