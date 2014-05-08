/**
 * Created by mac on 2014-05-06.
 */
public class RoadNode {

  Vec2 position;
  RoadEdge source;
  RoadEdge destination;

  public RoadNode(RoadEdge src, RoadEdge dest) {
    this.source = src;
    this.destination = dest;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this)
      return true;
    else if (obj == null)
      return false;
    else if (!(obj instanceof RoadNode))
      return false;

    RoadNode other = (RoadNode) obj;
    if(source.equals(other.source) && destination.equals(other.destination)){
      return true;
    }
    else{
      return false;
    }
  }

  public RoadNode(Vec2 position) {
    this.position = position;
  }

  public void setPosition(Vec2 position) {
    this.position = position;
  }

  public Vec2 getPosition() {
    return position;
  }

  public void setSource(RoadEdge src){ this.source = src; }

  public void setDestination(RoadEdge dest){ this.destination = dest; }
}
