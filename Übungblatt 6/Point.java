public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double givenX) {
        this.x = givenX;
    }

    public double getY() {
        return y;
    }

    public void setY(double givenY) {
        this.y = givenY;
    }

    public double distanceTo(Point other) {

        // difference of the x-values
        double a = Math.abs(other.x - this.x);

        // difference of the y-values
        double b = Math.abs(other.y - this.y);

        // Pythagoras
        double distance = Math.sqrt(a * a + b * b);
        return distance;

    }

    public void shift(double xShift, double yShift) {
        this.x += xShift;
        this.y += yShift;
    }

    

}
