import java.util.ArrayList;

public class Queue extends List {
    public Queue() {
    }

    public Queue(ArrayList<Integer> arr) {
        super(arr);
    }

    public Integer get(int index) {
        return arr.get(0);
    }

    public void add(Integer obj) {
        arr.add(obj);
    }

    public void remove() {
        arr.remove(0);
    }
}
