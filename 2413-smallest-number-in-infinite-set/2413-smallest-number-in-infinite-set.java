class SmallestInfiniteSet {
    private int next;
    private PriorityQueue<Integer> minHeap;
    private Set<Integer> addedBack;

    public SmallestInfiniteSet() {
        next = 1;
        minHeap = new PriorityQueue<>();
        addedBack = new HashSet<>();
    }

    public int popSmallest() {
        if (!minHeap.isEmpty()) {
            int smallest = minHeap.poll();
            addedBack.remove(smallest);
            return smallest;
        }
        return next++;
    }

    public void addBack(int num) {
        if (num < next && !addedBack.contains(num)) {
            minHeap.offer(num);
            addedBack.add(num);
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */
