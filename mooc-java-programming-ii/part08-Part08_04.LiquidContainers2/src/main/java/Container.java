
/**
 *
 * @author Fil
 */
public class Container {

    private int inContainer;

    public Container() {
        int inContainer = 0;
    }

    private int maxInContainer() {
        return 100;
    }

    public int contains() {
        return inContainer;
    }

    public void add(int amount) {
        if (amount < 0) {
            return;
        }
        inContainer += amount;
        if (inContainer > maxInContainer()) {
            inContainer = maxInContainer();
        }
    }

    public void remove(int amount) {
        if (amount < 0) {
            return;
        }
        inContainer -= amount;
        if (inContainer < 0) {
            inContainer = 0;
        }
    }

    public String toString() {
        return inContainer + "/" + maxInContainer();
    }

}
