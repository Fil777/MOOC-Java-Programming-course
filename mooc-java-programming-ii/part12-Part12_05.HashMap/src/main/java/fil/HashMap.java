package fil;

public class HashMap<K, V> {

    private MyList<Pair<K, V>>[] map;
    private int mapSize;

    public HashMap() {
        map = new MyList[32];
        mapSize = 0;
    }

    private MyList<Pair<K, V>> getListBasedOnKey(K key) {
        int hashValue = Math.abs(key.hashCode() % map.length);
        if (map[hashValue] == null) {
            map[hashValue] = new MyList<>();
        }

        return map[hashValue];
    }

    private int getIndexOfKey(MyList<Pair<K, V>> list, K key) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getKey().equals(key)) {
                return i;
            }
        }
        return -1;
    }
    
    public boolean containsKey(K key){
        return getIndexOfKey(getListBasedOnKey(key) , key) >= 0;
    }

    public void add(K key, V value) {
        MyList<Pair<K, V>> listAtIndex = getListBasedOnKey(key);
        int index = getIndexOfKey(listAtIndex, key);

        if (index < 0) {
            listAtIndex.add(new Pair<>(key, value));
            this.mapSize++;
        } else {
            listAtIndex.get(index).setValue(value);
        }
    }

    private void copy(MyList<Pair<K, V>>[] newOne, int fromIdx) {
        for (int i = 0; i < this.map[fromIdx].size(); i++) {
            Pair<K, V> value = this.map[fromIdx].get(i);

            int hashValue = Math.abs(value.getKey().hashCode() % newOne.length);
            if (newOne[hashValue] == null) {
                newOne[hashValue] = new MyList<>();
            }

            newOne[hashValue].add(value);
        }
    }

    private void grow() {
        // crete a new array
        MyList<Pair<K, V>>[] newArr = new MyList[this.map.length * 2];

        for (int i = 0; i < this.map.length; i++) {
            // copy the values of the old array into the new one
            copy(newArr, i);
        }
        // replace the old array with the new one
        this.map = newArr;
    }
    
    public V remove(K key) {
    MyList<Pair<K, V>> listAtIndex = getListBasedOnKey(key);
    if (listAtIndex.size() == 0) {
        return null;
    }

    int index = getIndexOfKey(listAtIndex, key);
    if (index < 0) {
        return null;
    }

    Pair<K, V> pair = listAtIndex.get(index);
    listAtIndex.remove(index);
    return pair.getValue();
}

}
