
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        String printStr = "The collection " + name;
        if (elements.size() == 0) {
            printStr += " is empty.";
        } else {
            printStr += " has " + elements.size() + " "
                    + elementsWord(elements.size()) + ":";
            for (String element : elements) {
                printStr += "\n" + element;
            }
        }
        return printStr;
    }

    private String elementsWord(int n) {
        if (n == 1) {
            return "element";
        } else {
            return "elements";
        }
    }

}
