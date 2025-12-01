import java.util.Arrays;

public class Triangle {
    private double a, b, c;
    private static final double epsilon = 1E-9;

    // epsilon = 0,5%
    // (1+e)* first >= second && (1+e)*second >= first

    // constructor: weist jeder Seite a,b,c die Entfernung zweier Eckpunkte zu
    public Triangle(Point p1, Point p2, Point p3) {
        this.a = p1.distanceTo(p2);
        this.b = p2.distanceTo(p3);
        this.c = p3.distanceTo(p1);

        // befüllt das array mit den drei Seitenlängen, sortiert es nach Größe
        double[] sortedLengths = new double[] { a, b, c };
        Arrays.sort(sortedLengths);

        this.a = sortedLengths[0];
        this.b = sortedLengths[1];
        this.c = sortedLengths[2];      //längste seite
    }

    // sind 2 seiten gleichlang?
    public boolean isEqual(double d1, double d2) {
        return (Math.abs(d1 - d2) < epsilon);
    }

    // gleichseitig?
    public boolean isEquilateral() {
        return (isEqual(a, b) && isEqual(b, c));
    }

    // gleichschenklig
    public boolean isIsosceles() {
        return (isEqual(b, a) || isEqual(b, c) || isEqual(c, a));
    }

    // spitzwinklig?
    public boolean isAcute() {
        return (Math.pow(a, 2) + Math.pow(b, 2) > Math.pow(c, 2));
    }

    // rechtwinkling?
    public boolean isRight() {
        return (epsilon > ((Math.pow(a, 2) + Math.pow(b, 2)) - Math.pow(c, 2)));
    }

    // stumpfwinkling?
    public boolean isObtuse() {
        return (Math.pow(a, 2) + Math.pow(b, 2) < Math.pow(c, 2));
    }

    /*
     * public static void main(String[] args){
     * Point a = new Point(4,5);
     * Point b = new Point(3,.5);
     * Point c = new Point(9.9,2);
     * Triangle test = new Triangle(a,b,c);
     * System.out.println(test.a);
     * System.out.println(test.b);
     * System.out.println(test.c);
     * System.out.println(test.isEquilateral());
     * System.out.println(test.isIsosceles());
     * 
     * }
     */
}
