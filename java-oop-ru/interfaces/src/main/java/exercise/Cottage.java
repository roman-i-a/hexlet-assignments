package exercise;

// BEGIN
public class Cottage implements Home {

    private final double area;
    private final int floorCount;

    public Cottage (double cottageArea, int cottageFloorCount) {
        this.area = cottageArea;
        this.floorCount = cottageFloorCount;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public int compareTo(Home another) {
        return Home.super.compareTo(another);
    }

    @Override
    public String toString() {
        String pattern = "%d этажный коттедж площадью %.1f метров";
        return String.format(pattern, floorCount, getArea());
    }
}
// END
