import java.util.Stack;

/**
 * Created by victor on 5/27/14.
 */
public class State {
  private Stack<Point> pointStack;
  private Stack<Vec2> directionStack;
  private Stack<Float> angleStack;

  private Point currentPosition;
  private Vec2 direction;
  private float angle;

  public State(Point currentPosition, Vec2 direction, float angle){
    this.currentPosition = currentPosition;
    this.direction = direction;
    this.angle = angle;

    pointStack = new Stack<>();
    directionStack = new Stack<>();
    angleStack = new Stack<>();
  }

  public void move(double x, double y){
    currentPosition.setPoint(x, y);
  }

  public void rotate(float angle){
    this.angle += angle;
  }

  public void saveState(){
    pointStack.push(currentPosition);
    directionStack.push(direction);
    angleStack.push(angle);
  }

  public void restoreState(){
    currentPosition = pointStack.pop();
    direction = directionStack.pop();
    angle = angleStack.pop();
  }

}
