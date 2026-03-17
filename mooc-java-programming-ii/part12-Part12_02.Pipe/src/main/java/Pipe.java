
import java.util.ArrayList;

/**
 *
 * @author Fil
 * @param <T>
 */
public class Pipe<T> {

    private final ArrayList<T> pipe;

    public Pipe() {
        pipe = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        pipe.add(value);
    }

    public T takeFromPipe() {
        if (isInPipe()) {
            T element = pipe.get(0);
            pipe.remove(0);
            return element;
        } else {
            return null;
        }
    }

    public boolean isInPipe() {
        return !(pipe.isEmpty());
    }
}
