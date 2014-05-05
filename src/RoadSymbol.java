/**
 * Created by mac on 2014-05-05.
 */
abstract class RoadSymbol {

  int symbol; // 0 = end, 1 = segment, 2 = turn
  int[] position; // position in x, y coordinates
  int[] direction; // normalized 2D vector

  public int getType() {
    return symbol;
  }

  public int[] getPosition() {
    return position;
  }

  public int[] getDirection() {
    return direction;
  }

  abstract RoadSymbol[] nextRoadSymbol();

}
