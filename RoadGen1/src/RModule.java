/**
 * Created by victor on 6/3/14.
 * Basic Road Segment Module
 */
public class RModule {
  private final String SYMBOL = "R";

  private RoadAttributes roadAttributes;

  private int delay;

  public RModule(int delay, RoadAttributes rl){
    this.delay=delay;
    roadAttributes =rl;
  }

  public int getDelay(){ return delay; }
  public void setDelay(int delay){ this.delay=delay; }

  public RoadAttributes getRoadAttributes(){ return roadAttributes; }
}
