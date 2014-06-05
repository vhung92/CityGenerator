/**
 * Created by mac on 2014-05-11.
 */
public class PopulationNode implements Comparable<PopulationNode> {

  static final double CITY_SIZE = 10;

  Vec2 position;
  int connectedCities;

  public PopulationNode(Vec2 position, int size) {
    this.position = position;
    connectedCities = size % 80;
  }

  public Vec2 getPosition() {
    return position;
  }

  @Override
  public int compareTo(PopulationNode o) {
    if (this == o) return 0;
    if (o == null || getClass() != o.getClass()) return -1;

    double distance = Math.sqrt(Math.pow((position.x - o.position.x), 2) + Math.pow((position.y - o.position.y), 2));

    if(distance > CITY_SIZE) {
      return -1;
    }

    return 0;
  }
}
