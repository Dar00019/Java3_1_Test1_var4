public class Point {
    private float x = 0, y = 0;

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    private void parallelTranslation(float offsetX, float offsetY) {
        x += offsetX;
        y += offsetY;
    }

    private class InnerClass {
        InnerClass() {
            x = 10;
            y = 10;
        }

        void eTranslation() {
            parallelTranslation((float) (Math.random()), (float) (Math.random()));
        }
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void changePoint() {
        InnerClass innerClass = new InnerClass();
        innerClass.eTranslation();
    }
}
