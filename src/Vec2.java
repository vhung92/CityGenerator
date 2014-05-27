/**
 * Created by mac on 2014-05-05.
 */
public class Vec2 {

  public double x;
  public double y;

  public Vec2(double x, double y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Vec2 vec2 = (Vec2) o;

    if (Double.compare(vec2.x, x) != 0) return false;
    if (Double.compare(vec2.y, y) != 0) return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result;
    long temp;
    temp = Double.doubleToLongBits(x);
    result = (int) (temp ^ (temp >>> 32));
    temp = Double.doubleToLongBits(y);
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    return result;
  }

  public void normalize() {
    double length = Math.sqrt(x * x + y * y);
    x /= length;
    y /= length;
  }

  public static double distance(Vec2 to, Vec2 from) {
    return Math.sqrt(Math.pow((from.x - to.x), 2) + Math.pow((from.y - to.y), 2));
  }
}
