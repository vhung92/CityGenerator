/**
 * Created by victor on 6/3/14.
 * Basic Road Segment Module
 */
public class RModule {
  private final String SYMBOL = "R";

  private int length = 0;
  private float angle = 0;


  public RModule(){
  }

  public RModule(int length, float angle){
    this.length = length;
    this.angle = angle;
  }

  public void setLength(int length){
    this.length = length;
  }

  public void setAngle(float angle){
    this.angle = angle;
  }
}
