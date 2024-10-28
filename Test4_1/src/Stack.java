import java.util.ArrayList;

public class Stack extends List {
    public Stack() {
    }

    public Stack(ArrayList<Integer> arr) {
        super(arr);
    }

    public Integer get(int index) {
        return arr.get(arr.size() - 1);
    }

    public void add(Integer obj) {
        arr.add(obj);
    }

    public void remove() {
        arr.remove(arr.size() - 1);
    }
}
