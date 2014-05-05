/**
 * Created by mac on 2014-05-05.
 */
public class RoadSegment extends RoadSymbol {

  public RoadSegment(Vec2 p, Vec2 d) {
    this.symbol = 1;
    this.position = p;
    this.direction = d;
  }

  @Override
  public RoadSymbol[] nextRoadSymbol() {

    // TODO - Finish the implementation.

    return null;
  }
}
