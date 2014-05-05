/**
 * Created by mac on 2014-05-05.
 */
public class Vec2 {

  public double x;
  public double y;
  public double length;

  public Vec2(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public void normalize() {
    length = Math.sqrt(x * x + y * y);
    x /= length;
    y /= length;
  }
}
