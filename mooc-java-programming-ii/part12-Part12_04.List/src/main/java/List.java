
import java.lang.Object;

/**
 *
 * @author Fil
 * @param <T>
 */
public class List<T> {

    private T[] list;
    private int listSize;

    public List() {
        list = (T[]) new Object[32];
        clear();
    }

    public int size() {
        return listSize;
    }

    public void clear() {
        listSize = 0;
    }

    private void testBounds(int index) {
        if (index < 0 || index >= listSize) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.listSize + "]");
        }
    }

    private void grow() {
        ensureCapacity(list.length + list.length / 2);
    }
    
    public void ensureCapacity(int minCapacity) {
        if (minCapacity <= list.length) return;
        T[] newList = (T[]) new Object[minCapacity];
        for (int i = 0; i < listSize; i++) {
            newList[i] = list[i];
        }
        list = newList;
    }

    public boolean contains(T value) {
        return indexOf(value) >= 0;
    }

    public int indexOf(T value) {
        for (int i = 0; i < listSize; i++) {
            if (list[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    public void remove(int index) {
        testBounds(index);
        for (int i = index; i < listSize - 1; i++) {
            list[i] = list[i + 1];
        }
        listSize--;
    }

    public void add(int index, T value) {
        testBounds(index);
        add(null);
        for (int i = listSize - 1; i > index; i--){
            list[i] = list[i-1];
        }
        list[index] = value;
    }

    public void add(T value) {
        if (listSize == list.length) {
            grow();
        }
        this.list[listSize] = value;
        listSize++;
    }

    public T get(int index) {
        testBounds(index);
        return list[index];
    }

    public void set(int index, T value) {
        testBounds(index);
        list[index] = value;
    }

}
