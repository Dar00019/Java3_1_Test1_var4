abstract class List {
    protected int[] arr;

    public List() {
    }

    public List(int[] arr) {
        this.arr = arr;
    }

    public int size() {
        return arr.length;
    }

    abstract int get();

    abstract List add(int obj);

    abstract List remove();
}
