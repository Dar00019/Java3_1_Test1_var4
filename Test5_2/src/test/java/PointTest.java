import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PointTest {

    @Test
    void changePoint() {
        Point point = new Point();
        for (int i = 0; i < 100; i++) {
            point.changePoint();
            Assertions.assertTrue(point.getX() > 10 && point.getX() < 11
                    && point.getY() > 10 && point.getY() < 11);
        }
    }
}