public class GeometryProgress extends Progress {
    public GeometryProgress() {
    }

    public GeometryProgress(double firstElem, double parameter) throws Exception {
        super(firstElem, parameter);
        if (parameter == 1) {
            throw new Exception("Значение параметра r не может быть равно 1.");
        }
    }

    public double getElem(int num) {
        return firstElem * Math.pow(parameter, num);
    }

    public double sum(int num) {
        return (firstElem - getElem(num) * parameter) / (1 - parameter);
    }
}
