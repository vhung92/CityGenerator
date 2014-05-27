import java.util.HashMap;
import java.util.Stack;

/**
 * Created by victor on 5/27/14.
 */
public class SymbolManager {
  HashMap<String, Action> symbols;
  private Stack<State> stateStack;

  public SymbolManager(){
    symbols = new HashMap<>();
    stateStack = new Stack<>();
  }


}
