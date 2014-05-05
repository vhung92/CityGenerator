/**
 * Created by mac on 2014-05-05.
 */
abstract class RoadSymbol {

  int symbol; // 0 = end, 1 = segment, 2 = turn
  Vec2 position; // position in x, y coordinates
  Vec2 direction; // normalized 2D vector

  public int getType() {
    return symbol;
  }

  public Vec2 getPosition() {
    return position;
  }

  public Vec2 getDirection() {
    return direction;
  }

  abstract RoadSymbol[] nextRoadSymbol();

}
