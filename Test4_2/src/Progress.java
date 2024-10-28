abstract class Progress {
    protected double firstElem;
    protected double parameter;

    public Progress() {
    }

    public Progress(double firstElem, double parameter) {
        this.firstElem = firstElem;
        this.parameter = parameter;
    }

    abstract double sum(int num);
}
