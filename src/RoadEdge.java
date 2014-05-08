/**
 * Created by mac on 2014-05-05.
 */
public class RoadEdge {

  public enum TYPE  { WIDE, NORMAL, NARROW };

  private TYPE type;
  private Vec2 from; // position in x, y coordinates
  private Vec2 to; // position in x, y coordinates
  private Vec2 direction; // normalized 2D vector

  public RoadEdge(TYPE type, Vec2 from, Vec2 to) {
    this.type = type;
    this.from = from;
    this.to = to;
  }

  public RoadEdge(TYPE type, Vec2 from, Vec2 to, Vec2 direction) {
    this.type = type;
    this.from = from;
    this.to = to;
    this.direction = direction;
  }

  public TYPE getType() {
    return type;
  }

  public Vec2 getFrom() {
    return from;
  }

  public Vec2 getTo() {
    return to;
  }

  public Vec2 getDirection() {
    return direction;
  }

}
