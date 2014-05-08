/**
 * Created by mac on 2014-05-05.
 */
public class RoadEdge {

  public enum TYPE  { WIDE, NORMAL, NARROW };

  private TYPE type;
  private int width;
  private Vec2 from; // position in x, y coordinates
  private Vec2 to; // position in x, y coordinates
  private Vec2 direction; // normalized 2D vector

  public RoadEdge(TYPE type, Vec2 from, Vec2 to, Vec2 direction) {
    this.type = type;
    this.from = from;
    this.to = to;
    this.direction = calcDirection(from, to);
    this.width = setWidth(type);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    RoadEdge roadEdge = (RoadEdge) o;

    if (!from.equals(roadEdge.from)) return false;
    if (!to.equals(roadEdge.to)) return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result = from.hashCode();
    result = 31 * result + to.hashCode();
    return result;
  }

  public Vec2 calcDirection(Vec2 from, Vec2 to){
    double x = from.x - to.x;
    double y = from.y - to.y;
    return new Vec2(x, y);
  }


  // TODO Decide on proper values for wide, normal and narrow. Maybe declare
  // some ranges for each of these types.
  public int setWidth(TYPE type){
    int s = 0;
    switch(type){
      case WIDE:
        s = 6;
        break;
      case NORMAL:
        s = 4;
        break;
      case NARROW:
        s = 2;
        break;
    }
    return s;
  }

}
