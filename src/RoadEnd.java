/**
 * Created by mac on 2014-05-05.
 */
public class RoadEnd extends RoadSymbol {

  public RoadEnd(int[] p, int[] d) {
    this.symbol = 0;
    this.position = p;
    this.direction = d;
  }

  @Override
  public RoadSymbol[] nextRoadSymbol() {
    return null;
  }
}
