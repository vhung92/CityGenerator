/**
 * Created by victor on 6/3/14.
 * Basic Road Segment Module
 */
public class RModule {
  private final String SYMBOL = "R";

  private int length;
  private float angle;


  public RModule(){
  }

  public void setAttributes(int length, float angle){
    this.length = length;
    this.angle = angle;
  }

  public int getLength(){ return length; }

  public float getAngle(){ return angle; }
}
