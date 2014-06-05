/**
 * Created by victor on 6/3/14.
 * Basic Module for Road Branching
 */
public class BModule {
  private final String SYMBOL = "B";

  private RoadAttributes roadAttributes;

  private int delay;

  public BModule(int delay, RoadAttributes rl){
    this.delay=delay;
    roadAttributes =rl;
  }

  public int getDelay(){ return delay; }
  public void setDelay(int delay){ this.delay=delay; }

  public RoadAttributes getRoadAttributes(){ return roadAttributes; }

}
