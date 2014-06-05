
public class Module {
	
	// Module types
	public enum TYPE {UNASSIGNED, R, B, F, I};
	public enum STATE {UNASSIGNED, SUCCEED, FAILED};
	
	// Module parameters
	public TYPE type;
	public STATE state;
	public int delay;
	public Vec2 startPos;
	public Vec2 endPos;
	
	public Module() {
		type = TYPE.UNASSIGNED;
		state = STATE.UNASSIGNED;
	}
	
	public void setType(TYPE t) {
		type = t;
	}
	
	public void setDelay(int d) {
		delay = d;
	}
	
	public void setStartPos(Vec2 p) {
		startPos = p;
	}
	
	public void setEndPos(Vec2 p) {
		endPos = p;
	}
	
	public double length() {
		return Math.sqrt(Math.pow(endPos.x - startPos.x, 2) + Math.pow(endPos.y - startPos.y, 2));
	}
}
