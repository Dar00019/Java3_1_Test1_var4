public class Stack extends List {
    public Stack() {
    }

    public Stack(int[] arr) {
        super(arr);
    }

    public int get() {
        return arr[arr.length - 1];
    }

    public Stack add(int obj) {
        int[] arr2 = new int[arr.length + 1];
        System.arraycopy(arr, 0, arr2, 0, arr.length);
        arr2[arr2.length - 1] = obj;
        return new Stack(arr2);
    }

    public Stack remove() {
        int[] arr2 = new int[arr.length - 1];
        System.arraycopy(arr, 0, arr2, 0, arr.length - 1);
        return new Stack(arr2);
    }
}
