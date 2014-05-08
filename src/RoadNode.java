/**
 * Created by mac on 2014-05-06.
 */
public class RoadNode {

  Vec2 position;

  public RoadNode(Vec2 position) {
    this.position = position;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    RoadNode roadNode = (RoadNode) o;

    if (!position.equals(roadNode.position)) return false;

    return true;
  }

  @Override
  public int hashCode() {
    return position.hashCode();
  }

  public void setPosition(Vec2 position) {
    this.position = position;
  }

  public Vec2 getPosition() {
    return position;
  }

}
