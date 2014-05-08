/**
 * Created by mac on 2014-05-05.
 */
abstract class RoadEdge {

  public enum TYPE  { WIDE, NORMAL, NARROW };

  TYPE type;
  Vec2 from; // position in x, y coordinates
  Vec2 to; // position in x, y coordinates
  Vec2 direction; // normalized 2D vector

  public RoadEdge(TYPE type, Vec2 from, Vec2 to, Vec2 direction) {
    this.type = type;
    this.from = from;
    this.to = to;
    this.direction = direction;
  }

}
