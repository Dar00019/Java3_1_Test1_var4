public class Queue extends List {
    public Queue() {
    }

    public Queue(int[] arr) {
        super(arr);
    }

    public int get() {
        return arr[0];
    }

    public Queue add(int obj) {
        int[] arr2 = new int[arr.length + 1];
        System.arraycopy(arr, 0, arr2, 0, arr.length);
        arr2[arr2.length - 1] = obj;
        return new Queue(arr2);
    }

    public Queue remove() {
        int[] arr2 = new int[arr.length - 1];
        System.arraycopy(arr, 1, arr2, 0, arr.length-1);
        return new Queue(arr2);
    }
}
