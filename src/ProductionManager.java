import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by victor on 5/20/14.
 */
public class ProductionManager {
  private Set<ProductionRule> rules;
  private HashMap<String, String> rulesMap;

  public ProductionManager(){
    rules = new HashSet<>();
    rulesMap = new HashMap<>();
  }

  public void addRule(ProductionRule pr){
    rules.add(pr);
    rulesMap.put(pr.getPredecessor(), pr.getSuccessor());
  }

  public Axiom applyRules(Axiom a){
    String seq = a.getSeqence();
    StringBuilder stringBuilder = new StringBuilder();
    for(int i = 0; i < seq.length(); i++) {
      if (rulesMap.containsKey("" + seq.charAt(i))) {
        stringBuilder.append(rulesMap.get("" + seq.charAt(i)));
      } else {
        stringBuilder.append("" + seq.charAt(i));
      }
    }
    return new Axiom(stringBuilder.toString());
  }
}
