/**
 * Created by mac on 2014-05-05.
 */
public class RoadSegment extends RoadSymbol {

  public RoadSegment(int[] p, int[] d) {
    this.symbol = 1;
    this.position = p;
    this.direction = d;
  }

  @Override
  public RoadSymbol[] nextRoadSymbol() {
    return null;
  }
}
