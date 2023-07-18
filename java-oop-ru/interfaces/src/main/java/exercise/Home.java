package exercise;

// BEGIN
public interface Home {
    double getArea();

    default int compareTo(Home another) {
        int result = 0;
        if (getArea() > another.getArea()) {
            result = 1;
        } else if (getArea() < another.getArea()) {
            result = -1;
        }
        return result;
    }
}
// END
