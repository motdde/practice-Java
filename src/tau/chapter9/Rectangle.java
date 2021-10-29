package tau.chapter9;

public class Rectangle {
    protected double length;
    protected double width;
    protected double sides = 4;

    public double getWidth() {
        return width;
    }

    public double getSides() {
        return sides;
    }

    public void setSides(double sides) {
        this.sides = sides;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculatePerimeter() {
        return (2 * length) + (2 * width);
    }

}
