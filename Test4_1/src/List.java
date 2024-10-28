import java.util.ArrayList;

abstract class List {
    protected ArrayList<Integer> arr;

    public List() {
    }

    public List(ArrayList<Integer> arr) {
        this.arr = arr;
    }

    public int size() {
        return arr.size();
    }

    abstract Integer get(int index);

    abstract void add(Integer obj);

    abstract void remove();
}
