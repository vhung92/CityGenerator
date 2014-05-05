/**
 * Created by mac on 2014-05-05.
 */
public class RoadTurn extends RoadSymbol {

  public RoadTurn(int[] p, int[] d) {
    this.symbol = 2;
    this.position = p;
    this.direction = d;
  }

  @Override
  public RoadSymbol[] nextRoadSymbol() {
    return null;
  }
}
