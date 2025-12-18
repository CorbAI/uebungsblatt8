public class Rectangle {
  private Point lowLeft;
  private Point upRight;

  public Rectangle(Point lowLeft, Point upRight) {
    this.lowLeft = lowLeft;
    this.upRight = upRight;
  }

  public Point getLowLeft() {
    return lowLeft;
  }

  public Point getUpRight() {
    return upRight;
  }

  public double width() {
    return Math.abs(lowLeft.getX() - upRight.getX());
  }
}
