/**
 * Created by victor on 5/20/14.
 */
public class ProductionRule {
  private String predecessor;
  private String successor;
  private int id;

  public ProductionRule(int id, String pre, String succ) {
    this.id = id;
    this.predecessor = pre;
    this.successor = succ;
  }

  public String getPredecessor() { return predecessor; }

  public String getSuccessor() {
    return successor;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ProductionRule that = (ProductionRule) o;

    if (id != that.id) return false;
    if (predecessor != null ? !predecessor.equals(that.predecessor) : that.predecessor != null)
      return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result = predecessor != null ? predecessor.hashCode() : 0;
    result = 31 * result + id;
    return result;
  }
}
