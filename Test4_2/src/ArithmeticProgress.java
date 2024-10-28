public class ArithmeticProgress extends Progress {
    public ArithmeticProgress() {
    }

    public ArithmeticProgress(double firstElem, double parameter) {
        super(firstElem, parameter);
    }

    public double getElem(int num) {
        return firstElem + num * parameter;
    }

    public double sum(int num) {
        return (num + 1) * (firstElem + getElem(num)) / 2;
    }
}
