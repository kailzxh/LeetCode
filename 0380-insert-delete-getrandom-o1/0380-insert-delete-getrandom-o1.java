import java.util.*;

class RandomizedSet {
    private List<Integer> list;
    private Map<Integer, Integer> map;
    
    private Random rand;

    public RandomizedSet() {
        this.list = new ArrayList<>();
        this.map = new HashMap<>();
        this.rand = new Random();
    }
    
    public boolean insert(int val) {
       
        if (map.containsKey(val)) {
            return false;
        }

        
        map.put(val, list.size());
        list.add(val);
        
        return true;
    }
    
    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }

    
        
        int indexToRemove = map.get(val);
        int lastElement = list.get(list.size() - 1);

        list.set(indexToRemove, lastElement);
        
        map.put(lastElement, indexToRemove);

        list.remove(list.size() - 1);
        map.remove(val);
        
        return true;
    }
    
    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }
}