/**
 * Created by victor on 5/20/14.
 * This class represents one character in the string of the l-system
 */
public class Axiom {
  private String sequence;

  public Axiom(String seq){
    this.sequence = seq;
  }

  public Axiom(Axiom other){
    this.sequence = other.sequence;
  }

  public String getSeqence(){ return sequence; }

  public boolean compareSequences(Axiom other){
    return sequence.equals(other.sequence);
  }
}
