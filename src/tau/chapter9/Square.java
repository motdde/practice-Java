package tau.chapter9;

public class Square extends Rectangle {
    @Override
    public double calculatePerimeter() {
        return sides * length;
    }
}
