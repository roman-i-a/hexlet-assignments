package exercise;

// BEGIN
public class Circle {
    Point center;
    int radius;

    public Circle(Point circleCenter, int circleRadius) {
        this.center = circleCenter;
        this.radius = circleRadius;
    }


    public int getRadius() {
        return this.radius;
    }

    public double getSquare() throws NegativeRadiusException {
        if (radius < 0) {
            throw new NegativeRadiusException();
        }
        return Math.PI * radius * radius;
    }
}
// END
